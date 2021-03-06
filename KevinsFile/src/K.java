


	import java.io.*;
	import java.util.*;
	
	/**
	 * A program to process an input file of Transactions and calculate totals.
	 *
	 * @author Kevin Fodness <kevin@kevinfodness.com>
	 */

	public class K {
		/**
		 * The main method. Does all the things.
		 * 
		 * @param args Arguments passed to the program.
		 * 
		 * @throws FileNotFoundException
		 * 
		 * @return void
		 */
		public void main(String[] args) throws FileNotFoundException {
	
			/* Count the number of lines in the file. */
			int numLines = 0;
			Scanner fileReader = new Scanner(new File("src/input.txt"));
			while (fileReader.hasNextLine()) {
				fileReader.nextLine();
				numLines++;
			}
			fileReader.close();
	
			/* Provision an array of Transactions objects to hold the values based on the number of lines in the file. */
			Transactions[] Transactions = new Transactions[numLines];
	
			/* Populate the array from the file. */
			int i = 0;
			fileReader = new Scanner(new File("src/input.txt"));
			while (fileReader.hasNext()) {
				
				/* Get the date (first element). */
				String date = fileReader.next();
				
				/* Get the account type. */
				String account = fileReader.next();
				
				/* If the account type is Credit, also add the next word ("Card") */
				if (account.equals("Credit")) {
					account = account + " " + fileReader.next();
				}
				
				/* Get the Transactions type. */
				String Transactions = fileReader.next();
				
				/* If the Transactions type is Opening, also add the next word ("Balance") */
				if (Transactions.equals("Opening")) {
					Transactions = Transactions + " " + fileReader.next();
				}
				
				/* Get the amount. */
				double amount = fileReader.nextDouble();
				
				/* Add a Transactions object to the array with the values we just pulled. */
				Transactions[i] = new Transactions(date, account, Transactions, amount);
				
				/* Increment index. */
				i++;
			}
			fileReader.close();
			
			/* Declare variables to track the totals in each account. */
			double checking = 0.0;
			double savings = 0.0;
			double credit = 0.0;
	
			/* Calculate totals. */
			for (Transactions t : Transactions) {
				
				/* Fork for the account type, to increment the proper variable. */
				if (t.accountType.equals("Checking")) {
					checking += t.getAmount();
				} else if (t.accountType.equals("Savings")) {
					savings += t.getAmount();
				} else {
					credit += t.getAmount();
				}
			}
			
			/* Print totals to the screen. */
			System.out.println("Checking balance: $" + checking);
			System.out.println("Savings balance: $" + savings);
			System.out.println("Credit Card balance: $" + credit);
		}
	}