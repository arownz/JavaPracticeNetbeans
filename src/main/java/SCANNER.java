import java.util.Scanner;
public class SCANNER {
    public static void main(String []args ){
        Scanner input = new Scanner (System.in);
        

        System.out.print("enter the first integer: ");
        int num1 = input.nextInt();
        
        System.out.print("enter the second integer: ");
        int num2 = input.nextInt();
        
        System.out.println();
        if (num2 > num1){
        System.out.println("the value of second integer is twice the value of first integer");
                }
        else{
        System.out.print("False");

                }
        }
    }
    

