import java.io.*;
import java.util.Scanner;
/**
 * 
 */

/**
 * @author BenStolman
 *
 */
public class ProjectNewFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Scanner fileReader = new Scanner(new File("src/input.txt"));
double balance = 0;
double deposit = 0;
double withdrawl = 0;
while (fileReader.hasNext()) {
	deposit += fileReader.nextDouble(); 
	System.out.println(fileReader.nextLine());
fileReader.close();
	



	
	}
} }