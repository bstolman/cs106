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
	 * @param console
	 *            The scanner object to use for user input
	 * @param rollingstones
	 *            Rock Band Number 1
	 * @param ledzeppelin
	 *            Rock Band Number 2
	 * @param redhotchilipeppers
	 *            Rock Band Number 3
	 * @param thewho
	 *            Rock Band Number 4
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);

		double rollingstones = 0;
		double ledzeppelin = 0;
		double redhotchilipeppers = 0;
		double thewho = 0;

		System.out.println("WHICH FAMOUS BAND ARE YOU?");

		boolean likesrock = false;
		while (likesrock == false) {
			System.out.println("Do you like rock music? (Answer True or False)");
			likesrock = console.nextBoolean();
		}
		// Loops if you answer no to the first question.

			if (likesrock == true) {
		}
			System.out.println("I respect that!");
			rollingstones++;
			ledzeppelin++;
			redhotchilipeppers++;
			thewho++;
			// If true goes to question two.
			
			System.out.println("Is most of your band alive?");
			likesrock = console.nextBoolean();
			if (likesrock == true) {
				redhotchilipeppers++;
			} else {
				rollingstones++;
				ledzeppelin++;
				thewho++;
			}
				System.out.println("Does your guitarist have long hair?");
				likesrock = console.nextBoolean();
				if (likesrock == true) {
					redhotchilipeppers++;
					rollingstones++;
					ledzeppelin++;
				} else {
					thewho++;
				}	System.out.println("Does your band have more than 10 studio albums?");
					likesrock = console.nextBoolean();
					// The Rolling Stones have 29 studio albums
					// Led Zeppelin have 9 studio albums
					// The Red Hot Chili Peppers have 10 studio albums
					// The Who have 11 studio albums
					if (likesrock == true) {
						thewho++;
						rollingstones++;
					} else {
						redhotchilipeppers++;
						ledzeppelin++;
					}
					System.out.println("Did your band form in the 60's ?");
					likesrock = console.nextBoolean();
					if (likesrock == true) {
						rollingstones++;
						ledzeppelin++;
						thewho++;
					} else {
						redhotchilipeppers++;
					}
					System.out.println("Does your band have more than 3 top 10 hits in the US ?");
					likesrock = console.nextBoolean();
					if (likesrock == true) {
						rollingstones++;
						
					} else {
						redhotchilipeppers++;
						ledzeppelin++;
						thewho++;
					}
					if  (ledzeppelin > redhotchilipeppers & ledzeppelin > rollingstones && ledzeppelin > thewho) {
						System.out.print ("You are Led Zeppelin"); 
					
					} else if (redhotchilipeppers > ledzeppelin & redhotchilipeppers > rollingstones && redhotchilipeppers > thewho) { 
						System.out.print ("You are The Red Hot Chili Peppers");
							
					} else if (thewho > redhotchilipeppers & thewho > rollingstones && thewho > ledzeppelin) { 
						System.out.print ("You are The Who");
					
					}else if (rollingstones > redhotchilipeppers & rollingstones > thewho && rollingstones > ledzeppelin) { 
						System.out.print ("You are The RollingStones");
					}	
				}
			}
		


			

