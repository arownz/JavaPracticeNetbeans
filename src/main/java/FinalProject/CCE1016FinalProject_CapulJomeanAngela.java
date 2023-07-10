package FinalProject;
import java.util.Scanner;

public class CCE1016FinalProject_CapulJomeanAngela {

public static int total_quantity=0;

public static String[] products = {null,
"1. BRIAN'S RIBS (SOLO)\t\t\t\t\t\t\t\t\t\t\t\t\t₱228.00",
"2. BRIAN'S RIBS (REGULAR)\t\t\t\t\t\t\t\t\t\t\t\t₱335.00"
+"\nOur best seller! Baked pork ribs in a sweet,"
+ "\ntangy piquet sauce served with rice and corn & carrots.",
"\n3. TING TING'S TAVERN SHRIMPS\t\t\t\t\t\t\t\t\t\t\t\t₱305.00"
+ "\nDelicious shrimp butterflied and lightly crusted in"
+ "\nbreadcrumbs and fried until golden. Served with our own"
+ "\ntartar sauce paired with harvest rice and seasoned vegetables.",
"\n4. FISH & FRIES\t\t\t\t\t\t\t\t\t\t\t\t\t\t₱270.00"
+ "\nTender white fish fillet breaded and fried to golden perfection,"
+ "\nServed with tartar sauce and french fries.",
"\n5. TRICIA ALA POBRE\t\t\t\t\t\t\t\t\t\t\t\t\t₱258.00"
+ "\nGrilled fish fillet topped with garlic bits together with"
+ "\nwhite rice and vegetable medley.",
"\n6. ROASTED CHICKEN\t\t\t\t\t\t\t\t\t\t\t\t\t₱280.00"
+ "\nChicken quarter spiced with our secret spices, roasted and"
+ "\nserved with mashed potatoes and vegetable medley.",
"\n7. BUFFALO WINGS\t\t\t\t\t\t\t\t\t\t\t\t\t₱225.00"
+ "\nBreaded chicken wings fried until golden and tossed in our "
+ "\nwinger sauce and served with bleu cheese dressing.",
"\n8. THERESE'S PIECES\t\t\t\t\t\t\t\t\t\t\t\t\t₱265.00"
+ "\nPlump chicken tenderloins,double breaded and fried until golden "
+ "\nServed with our home-made honey mustard. ",
"\n9. VICTORIA'S SECRET SPAGHETTI\t\t\t\t\t\t\t\t\t\t\t\t₱225.00"
+ "\nHome-made meat sauce topped with oozing cheese, "
+ "\nA treat for the young and old.",
"\n10. CASA VERDE BURGER\t\t\t\t\t\t\t\t\t\t\t\t\t₱258.00"
+ "\nOur signature burger. This has everything on it: "
+ "\nonions,tomatoes,American cheese,lettuce,bacon and a fried egg.",
"\n11. COUNTRY FRIED RIBS\t\t\t\t\t\t\t\t\t\t\t\t\t₱335.00"
+ "\nCrispy and flavorful ribs,fried country style "
+ "\nComes with white rice,corn&carrots and gravy.",
"\n12. COUNTRY FRIED CHICKEN WITH BISCUITS AND FRIES\t\t\t\t\t\t\t\t\t₱238.00"
+ "\nJuicy,crispy country fried chicken served with"
+ "\nhome-made biscuits and fries."};

public static String[] product = {null,
"BRIAN'S RIBS (SOLO)\t\t\t\t\t" , "BRIAN'S RIBS (REGULAR)\t\t\t\t" , "TING TING'S TAVERN SHRIMPS\t\t\t\t" ,
"FISH & FRIES\t\t\t\t\t\t" , "TRICIA ALA POBRE\t\t\t\t\t" , "ROASTED CHICKEN\t\t\t\t\t" ,
"BUFFALO WINGS\t\t\t\t\t" , "THERESE'S PIECES\t\t\t\t\t" , "VICTORIA'S SECRET SPAGHETTI\t\t\t\t" , "CASA VERDE BURGER\t\t\t\t\t" , "COUNTRY FRIED RIBS\t\t\t\t\t",
"COUNTRY FRIED CHICKEN WITH BISCUITS AND FRIES\t"};

public static int[] product_price ={0,228,335,305,270,258,280,225,265,225,258,335,238};
public static int[] final_qty=new int[13];
public static void main(String[] args)
{

Scanner ja = new Scanner(System.in);
int choose, quantity;
int p1=0;
int p2=0;
int p3=0;
int p4=0;
int p5=0;
int p6=0;
int p7=0;
int p8=0;
int p9=0;
int p10=0;
int p11=0;
int p12=0;
char decision;
System.out.println("\t\t\t\t\t\t\t\t WELCOME TO CASA VERDE\n");
Scanner signin = new Scanner(System.in);
System.out.print("Enter name: ");
String userName = signin.nextLine();
System.out.print("Enter number: ");
String usercontact = signin.nextLine();
System.out.print("Enter Address: ");
String useraddress = signin.nextLine();

System.out.println("\t\t\t\t\t\t\t\t ALA CARTE\n\t\t\t\t\t A mix of our all time best sellers and signature dishes\n\t\t\t\t\t\t\t\t (free Delivery)");
System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t PRICE\n");
for(int i = 0; i < products.length; i++)
if(products[i] != null)
System.out.println(products[i]);
do
{
System.out.print("\nChoose any Item: ");
choose=ja.nextInt();
System.out.print("Enter Quantity: ");
quantity=ja.nextInt();

switch(choose)
{
case 1:
p1 += quantity;
final_qty[1] = p1;
break;

case 2:
p2 += quantity;
final_qty[2]= p2;
break;

case 3:
p3 += quantity;
final_qty[3]= p3;
break;

case 4:
p4 += quantity;
final_qty[4]= p4;
break;

case 5:
p5 += quantity;
final_qty[5]= p5;
break;

case 6:
p6 += quantity;
final_qty[6]= p6;
break;

case 7:
p7 += quantity;
final_qty[7]= p7;
break;

case 8:
p8 += quantity;
final_qty[8]= p8;
break;

case 9:
p9 += quantity;
final_qty[9]= p9;
break;

case 10:
p10 += quantity;
final_qty[10]= p10;
break;

case 11:
p11 += quantity;
final_qty[11]= p11;
break;

case 12:
p12 += quantity;
final_qty[12]= p12;
break;
}

System.out.print("Would you like to order again? y/n: ");
decision=ja.next().charAt(0);
}while(decision != 'n' && decision != 'N');

System.out.println("--------------------------------------------------------------------------------");
System.out.println("\t\t\t\tGot your Order " + userName);
System.out.println("Name: " + userName);
System.out.println("Number: " + usercontact);
System.out.println("Delivery Address: " + useraddress);
System.out.println("\nOrder Details");

int sum=0;
for(int i=0; i < final_qty.length; i++)
{
if(final_qty[i] != 0)
{
System.out.println( final_qty[i]+""+"x" + " " + product[i] + "₱" + final_qty[i]*product_price[i] + ".00" /*final_qty[i]*//*+final_qty[i]*product_price[i]*/);
sum = sum + final_qty[i]*product_price[i];
}
}
System.out.println("\nSubtotal\t\t\t\t\t\t"+ "₱" + sum + ".00" );
int payment=0;
do
{
System.out.print("Enter Payment: ");
payment=ja.nextInt();
}while(sum > payment);
System.out.println("Change: " +(payment-sum));
System.out.println("\n\t\t\t THANK YOU FOR BUYING!");
System.out.println("\t\t\tEstimated Delivery time is 20-30 mins");
System.out.println("--------------------------------------------------------------------------------");

}
}