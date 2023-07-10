import java.util.Scanner;

public class aveGrade {
    public static void main (String arg[]){
        int section;
        String name,adviser,sec=null,num;

        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Fullname         : "); 
         name = in.nextLine();
        System.out.print("Student Number              : ");
        num = in.nextLine();
        System.out.print("Name of Adviser             : ");
         adviser = in.nextLine();
        System.out.print("Section (1-2)               : ");
        section = in.nextInt();
        if (section == 1) {
            sec = "ICT 12-01";}
        
        else if (section == 2) {
            sec = "ICT 12-02";}
        
        System.out.println("");
        System.out.println("3rd Quarter Grades (2nd Semester)");
        System.out.print("III                         : ");
    float iii = in.nextFloat();
        System.out.print("Philosophy                  : ");
float ph = in.nextFloat();
        System.out.print("Empowerment Technologies     : ");
    float et = in.nextFloat();
        System.out.print("FCl 4                       : ");
 float fcl = in.nextFloat();
        System.out.print("PEH 4                       : ");
float peh = in.nextFloat();
        System.out.print("Animation 2                 : ");
 float ani = in.nextFloat();
        System.out.print("Computer Programming 2      : ");
float cp = in.nextFloat();


    
        System.out.println("");
        System.out.println("Student Name              : "+ name);
        System.out.println("Student Number            : "+ num);
        System.out.println("Class Adviser             : "+ adviser);
        System.out.println("Section                   : "+ sec);
        
        System.out.println("");
        float av = (iii+ph+et+fcl+peh+ani+cp)/7;
        System.out.println("Your Average Grade is     : "+ av);
         if (av>= 100){
        System.out.println("Remarks                   : Invalid Grade!");
         }else if (av>= 98&& av<=100){
        System.out.println("Remarks                   : With Highest Honors");
        }else if (av>= 95&& av<=97){
        System.out.println("Remarks                   : With High Honors");
        }else if (av>= 90&& av<=94){
        System.out.println("Remarks                   : With Honors");
        }else if (av>= 75&& av<=89){
        System.out.println("Remarks                   : Passed");
        }else {
        System.out.println("Remarks                   : Failed!");
        }
        }
}

