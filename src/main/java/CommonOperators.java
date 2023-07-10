import java.util.Scanner;
public class CommonOperators {
    public static void main (String[] args){
        Scanner i = new Scanner (System.in);
        
        System.out.print("Enter num: ");
        int num1 = i.nextInt();
        System.out.print("Enter next num: ");
        int num2 = i.nextInt();
        
        int num3 = num1+num2;
        
        System.out.println("Answer = " + num3);

    }
}
