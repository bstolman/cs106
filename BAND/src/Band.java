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
		// Set up variables in main method
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
		// Loops if you answer false to the first question.

		if (likesrock == true) {
		}
		System.out.println("I respect that!");
		
		// 1 'point' will be assigned to the following bands if user enters true or false
		
		rollingstones++;
		ledzeppelin++;
		redhotchilipeppers++;
		thewho++;
		
		// If user answers true, he or she goes onto question two.

		System.out.println("Is most of your band alive?");
		likesrock = console.nextBoolean();
		if (likesrock == true) {
			redhotchilipeppers++;
		} else {
			rollingstones++;
			ledzeppelin++;
			thewho++;
		}
		
		// The Red Hot Chili Peppers have the most members that are alive
		
		System.out.println("Does your guitarist have long hair?");
		likesrock = console.nextBoolean();
		if (likesrock == true) {
			redhotchilipeppers++;
			rollingstones++;
			ledzeppelin++;
		} else {
			thewho++;
		// All guitarists have long hair except for Pete Townshend
		}
		System.out.println("Does your band have more than 10 studio albums?");
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
		//All of the bands formed in the 60's except for the Red Hot Chili Peppers
		System.out.println("Does your band have more than 3 top 10 hits in the US ?");
		likesrock = console.nextBoolean();
		if (likesrock == true) {
			rollingstones++;

		} else {
			redhotchilipeppers++;
			ledzeppelin++;
			thewho++;
		}
			
		// The Rolling Stones had the most - 28!	
		System.out.println(getResults(ledzeppelin, rollingstones, redhotchilipeppers, thewho));
			}
		
	// The program returns answers to getResults method above
	public static String getResults(double ledzeppelin, double rollingstones, double redhotchilipeppers, double thewho){
		
		if (ledzeppelin > redhotchilipeppers & ledzeppelin > rollingstones
				&& ledzeppelin > thewho) {
			return ("You are Led Zeppelin");

		} else if (redhotchilipeppers > ledzeppelin & redhotchilipeppers > rollingstones
				&& redhotchilipeppers > thewho) {
			return ("You are The Red Hot Chili Peppers");

		} else if (thewho > redhotchilipeppers & thewho > rollingstones
				&& thewho > ledzeppelin) {
			return ("You are The Who");

		} else if (rollingstones > redhotchilipeppers & rollingstones > thewho && rollingstones > ledzeppelin) {
			return ("You are The Rolling Stones");
		} else{
			return ("The results are inconclusive, please insert 50 cents and try again.");

		
		}
		
		//return "";
	}
}

