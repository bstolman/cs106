import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



	/**
	 * @param args
	 */
public class pf {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner fileReader = new Scanner(new File("src/input.txt"));
		//integer list starts at 0
		int list = 0;
		//While there is a line to be read
		while(fileReader.hasNextLine()) {
		//Add one to list
		list ++; 
		//Store the value
		fileReader.nextLine();
		}
		
		fileReader.close();
		
		fileReader = new Scanner(new File("src/input.txt"));
		
		String[] dates = new String[list]; 
		String[] accounts = new String[list]; 
		String[] transactions = new String[list];
		double[] amounts = new double[list];
		
		int i = 0;
		
		while(fileReader.hasNextLine()) {
			dates[i] = fileReader.next();
			accounts[i] = fileReader.next();
			if (accounts[i].equals("Credit")) {
				accounts[i] = accounts[i] + "Card";
				String card = fileReader.next();
			}
			transactions[i] = fileReader.next();
			if (transactions[i].equals("Opening")) {
				transactions[i] = transactions[i] + "Balance";
				String balance = fileReader.next();
			}
			amounts[i] = fileReader.nextDouble();
			i ++;
		}	
		fileReader.close();	
		for (i = 0; i< amounts.length; i ++) {
				
				System.out.println(dates[i] + accounts[i] + transactions[i] + amounts[i]);
		
				double creditCard = 0;
				double savings = 0;
				double checking = 0;
		
		}
		
	}
}
	
