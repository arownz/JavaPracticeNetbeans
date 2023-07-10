import javax.swing.*; 
public class progressbar extends JFrame{
JProgressBar jb;
JLabel lblLoading=new JLabel("Loading...");
int i=0; progressbar(){
        jb = new JProgressBar(0,2000);
        jb.setBounds(40, 20, 100, 20);
        lblLoading.setBounds(40, 20, 100, 20);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        add(lblLoading);
        setSize(250,150);
        setLayout(null);
    } public void iterate(){
    while(i<=2000){
        jb.setValue(i);
        i=i + 20;
        try{
            Thread.sleep(150);
        }
        catch(Exception e){
        }
    }
}
            public static void main(String[] a){
                progressbar m = new progressbar();
                m.setVisible(true);
                m.iterate();
                m.dispose();
            }
        }