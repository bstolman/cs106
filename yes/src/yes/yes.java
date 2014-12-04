package yes;




import java.util.Scanner;
import java.util.Scanner; 
/*
 * @BenStolman
 */
public class yes  {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);	

		System.out.print("$");

		double total = console.nextDouble();
		System.out.print("$");
		

		double total2 = console.nextDouble();
		System.out.print("$");

		double total3 = console.nextDouble();
		System.out.print("$");

		
		
		System.out.println("How much would you like to tip?");
		for (double i1 = 15; i1 <=20; i1++) {
			System.out.println("%" + i1 + "?");}

		System.out.print("%");

		double tip = console.nextDouble(); 

System.out.println("Your tip is...");	
System.out.println("$" + total * money(tip));
System.out.println("Your total is...");
System.out.println("$" + ((total * money(tip)) + total));	
System.out.print("Here is a mint!");

	}
	public static double money(double tip) {
		return tip/100;
	}
}

}
