import java.util.Scanner; 
/*
 * @param 
 */
public class Stringtttt {
	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);	
System.out.println("Total Meal Amount");
System.out.print("$");
double total = in.nextDouble();
System.out.println("How much would you like to tip?");
for (double i1 = 15; i1 <=20; i1++) {
	System.out.println("%" + i1 + "?");}
System.out.print("%");
double tip = in.nextDouble(); {
	
	System.out.println("$" + total * tip/100);
System.out.println("Your total is...");
System.out.println("$" + ((total * tip/100) + total));	
System.out.print("Here is a mint!");
	
	
		}
	}
}
