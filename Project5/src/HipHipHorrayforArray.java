import java.io.*;

/**
 * @author BenStolman
 * @throws FilNotFoundException
 */
public class HipHipHorrayforArray {

	/**
	 * @param args
	 */
	//Main method that throws exception if file isn't found
	public static void main(String[] args) throws FileNotFoundException {
		//Creating Object Class
		MusicLibrary library = new MusicLibrary();
		//Reads file
		library.readFile("src/Mothership.txt");
		//Analyzes method
		library.getMaxValue();
		System.out.println(library.getMaxValue());
	}
}
