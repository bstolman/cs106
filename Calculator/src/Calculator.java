/**
 * 
 */

/**
 * @author BenStolman
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//variables need
		double cost;
		double percentage;
		double tip;
		
		
	//input values
		cost = 200;
		percentage = .20;
		tip = (cost * percentage);
		
		//tip amount
		System.out.print("Your tip is ");
		System.out.println(tip);
		System.out.println("Your new total is $240");
	
	fancy(args);
	}
		public static void fancy(String[] args) {
		double cost;
		double percentage;
		double tip;
		
		
	//input values
		cost = 200;
		percentage = .25;
		tip = (cost * percentage);
		
		//tip amount
		
		System.out.print("Your tip is ");
		System.out.println(tip);
		System.out.print("Your new total is $250");}
	}

