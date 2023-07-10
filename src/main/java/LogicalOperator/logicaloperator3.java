package LogicalOperator;

 /* logical operator = used to connect two or more expressions
        
        && == (and) both conditions must be true
        || = (or) either condition must be true 
        ! = (not) reverses boolean value of condition */
import java.util.Scanner;
public class logicaloperator3 {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Playing a game, Press Q to quit");
    String response = scanner.next();
    
    if(!response.equals("q") && !response.equals("Q")) {
        System.out.println("Still playing the game");
    }
    else {
        System.out.println("Quitted the game");
    }
    }
}
