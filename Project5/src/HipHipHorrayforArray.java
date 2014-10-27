import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author BenStolman
 *
 */
public class HipHipHorrayforArray {

	/**
	 * @param args
	 */
	private Scanner fileReader;

	public void openFile() {
		try {
			fileReader = new Scanner(new File("src/Mothership.txt"));
		} catch (Exception e) {
			System.out.println("File Does Not Exist");
		}
	}

	public void readFile() {
		while (fileReader.hasNext()) {

			String number = fileReader.nextLine();
			String time   = fileReader.nextLine();
			String artist = fileReader.nextLine();
			String song	  =	fileReader.nextLine();

			System.out.printf("%s\n%s\n%s\n%s\n", number, time, artist, song);
			
		}
	}

	public void closeFile() {
		fileReader.close();

	}
}


