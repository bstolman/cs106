import java.io.*;

/**
 * @author BenStolman
 * @throws FilNotFoundException
 */
public class HipHipHorrayforArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		MusicLibrary library = new MusicLibrary();
		library.readFile("src/Mothership.txt");
		library.analyze();
	}
}
