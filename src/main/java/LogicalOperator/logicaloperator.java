package LogicalOperator;

 /* logical operator = used to connect two or more expressions
        
        && == (and) both conditions must be true
        || = (or) either condition must be true 
        ! = (not) reverses boolean value of condition */
public class logicaloperator {
    public static void main(String[]args){
       
        
        int temp = 25;
        if (temp>30) {
            System.out.println("Hot outside");
        }
        else if (temp>=20 && temp<=30){
            System.out.println("Warm outside");
        }
        else { 
            System.out.println("Cold outside");
    }
    }
}
