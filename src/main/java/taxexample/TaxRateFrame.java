package taxexample;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class TaxRateFrame extends JFrame {
    private JButton showButton;
    private JTable taxTable;
    private DefaultTableModel tableModel;

    public TaxRateFrame() {
        initializeUI();
        createAndShowGUI();
    }

    private void initializeUI() {
        showButton = new JButton("Show Tax Rates");
        taxTable = new JTable();
        tableModel = new DefaultTableModel();

        tableModel.addColumn("Employee ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Type");
        tableModel.addColumn("Income");
        tableModel.addColumn("Tax Rate");
        tableModel.addColumn("Tax Amount");

        taxTable.setModel(tableModel);

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fetchTaxRatesFromDatabase();
            }
        });
    }

    private void fetchTaxRatesFromDatabase() {
        try {
            // Establish the database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/taxdb", "root", "");

            // Create the SQL statement
            String sql = "SELECT individuals.id, individuals.name, categories.type, individuals.income, categories.taxrate FROM individuals INNER JOIN categories ON individuals.rateid = categories.rateno";

            // Prepare the statement
            Statement statement = conn.createStatement();

            // Execute the query
            ResultSet resultSet = statement.executeQuery(sql);

            // Clear existing data in the table
            tableModel.setRowCount(0);

            // Process the results and populate the table
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String type = resultSet.getString("type");
                double income = resultSet.getDouble("income");
                double taxRate = resultSet.getDouble("taxrate");
                double taxAmount = calculateTaxAmount(type, income, taxRate);

                Object[] rowData = {id, name, type, income, taxRate, taxAmount};
                tableModel.addRow(rowData);
            }

            // Close the resources
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private double calculateTaxAmount(String type, double income, double taxrate) {
        double taxAmount = 0;

        if (type.equalsIgnoreCase("Teaching")) {
            // Tax calculation for Teaching profession
            if (income <= 250000) {
                taxAmount = 0;
            } else if (income <= 400000) {
                taxAmount = (income - 250000) * taxrate;
            } else if (income <= 800000) {
                taxAmount = (income - 400000) * taxrate + 30000;
            } else if (income <= 2000000) {
                taxAmount = (income - 800000) * taxrate + 130000;
            } else {
                taxAmount = (income - 2000000) * taxrate + 490000;
            }
        } else if (type.equalsIgnoreCase("Non-Teaching")) {
            // Tax calculation for Non-Teaching profession
            if (income <= 400000) {
                taxAmount = 0;
            } else if (income <= 800000) {
                taxAmount = (income - 400000) * taxrate;
            } else if (income <= 2000000) {
                taxAmount = (income - 800000) * taxrate + 160000;
            } else {
                taxAmount = (income - 2000000) * taxrate + 480000;
            }
        }

        return taxAmount;
    }

    private void createAndShowGUI() {
        setTitle("Calculate Tax Rate of Teachings and Non-Teaching");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        JScrollPane scrollPane = new JScrollPane(taxTable);
        contentPane.add(scrollPane, BorderLayout.CENTER);
        contentPane.add(showButton, BorderLayout.SOUTH);

        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TaxRateFrame();
            }
        });
    }
}

