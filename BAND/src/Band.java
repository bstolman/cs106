import java.io.PrintStream;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author BenStolman
 *
 */
public class Band {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
		
		double rollingstones = 0;
		double ledzeppelin = 0;
		double redhotchillipeppers = 0;
		double thewho = 0;

		System.out.println("WHICH FAMOUS BAND ARE YOU?");
	
		String likesrock = "false";
		while(likesrock.equals("false"))  {
		System.out.println("Do you like rock music? (Answer True of False)");

		boolean band = console.nextBoolean();
		if (band == true) {
			System.out.println("I respect that");
			rollingstones++;
			ledzeppelin++;
			redhotchillipeppers++;
			thewho++;
		} else {
			
			System.out.println("You have failed the quiz");

		System.out.println("Is most of your band alive?");
		if (band == true) {
			redhotchillipeppers++;
		} else {
			rollingstones++;
			ledzeppelin++;
			thewho++;
		
		}
	}
}
	}
}
