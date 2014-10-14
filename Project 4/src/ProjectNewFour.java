import java.io.*;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author BenStolman
 * @param creditCard
 * @param savings
 * @param checkings
 * @throws FileNotFoundException
 * @return final variables to output file: "src/output.txt"
 */
public class ProjectNewFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// TODO Auto-generated method stub
		//Scanner - scans files
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		//PrintStream - writes files
		PrintStream output = new PrintStream(new File("src/output.txt"));
		
		//Define initial variables
		double creditCard = 0;
		double savings = 0;
		double checking = 0;

		// While loop - which includes all if statements
		while (fileReader.hasNextLine()) {
			// Identifies first string as "date"
			String date = fileReader.next();
			// Identifies second string as "variable"
			String variable = fileReader.next();
			// If the second string is "credit"
			if (variable.equals("Credit")) {
				// Define the string as "card"
				String card = fileReader.next();
			}
			// Identifies third string as "variable2"
			String variable2 = fileReader.next();
			//If the third string is "opening"
			if (variable2.equals("Opening")) {
				//Define that string as "balance"	
				String balance = fileReader.next();
			}
			// The last string to be read in is a numerical value hence the double
			double value = fileReader.nextDouble();
			
			//If the variable is checking
			if (variable.equals("Checking")) {
				//And the next string is withdrawal
				if (variable2.equals("Withdrawal")) {
				//Subtract the value from checking	
					checking -= value;
				//If the first variable is checking, but the second variable isn't withdrawal then we move onto deposit	
				} else if (variable2.equals("Deposit")) {
				//Add the value to checking	
					checking += value;
				//If the first variable is checking, but the second variable isn't withdrawal or deposit we move to opening
				} else if (variable2.equals("Opening")) {
				//Add the value to checking	
					checking += value;
				}
			//If the variable isn't Checking and is Savings
			} else if (variable.equals("Savings")) {
				//And the next string is withdrawal
				if (variable2.equals("Withdrawal")) {
				//Subtract the value from savings
					savings -= value;
				//If the first variable is savings, but the second variable isn't withdrawal then we move onto deposit	
				} else if (variable2.equals("Deposit")) {
				//Add the value to deposit
					savings += value;
				//If the first variable is Savings, but the second variable isn't withdrawal or deposit we move to opening
				} else if (variable2.equals("Opening")) {
				//Adds the value
					savings += value;
				}
			//If the variable isn't Checking or Savings and is Credit
			} else if (variable.equals("Credit")) {
				//And the next string is withdrawal
				if (variable2.equals("Withdrawal")) {
				//Subtract the value from credit
					creditCard -= value;
				//If the first variable is Credit, but the second variable isn't withdrawal then we move onto deposit	
				} else if (variable2.equals("Deposit")) {
				//Add the value	to deposit
					creditCard += value;
				//If the first variable is Credit, but the second variable isn't withdrawal or deposit we move to opening
				} else if (variable2.equals("Opening")) {
				//Adds the value	
					creditCard += value;
				}
			}
		}
		//All files have been read - ends fileReader
		fileReader.close();
		//Prints out the balance for checking, saving, and crediCard
		System.out.println("Your checkings balance is $" + checking);
		System.out.println("Your savings balance is $" + savings);
		System.out.println("Your credit card balance is $" + creditCard);
		
		//Sends values for checking, savings, and creditCard to output 
		output.println("Your checkings balance is $" + checking);
		output.println("Your savings balance is $" + savings);
		output.println("Your credit card balance is $" + creditCard);
		
		//Closes output
		output.close();
		
	}

}
