import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MusicLibrary {
	// declare a variable to store an array of Track objects
	Track[] tracks;
	
	// Create a load method to load the tracks from a file
	private Scanner fileReader;

	public void readFile() {
		int i = 0;
		Track[] Music = new Track [i];
		
		while (fileReader.hasNext()) {
			int number = fileReader.nextInt();
			String time = fileReader.nextLine();
			String artist = fileReader.nextLine();
			String song = fileReader.nextLine();

			Music [i] = new Track(number, time, artist, song);
			System.out.print(i);
			}
	}
	
	// Create a numLines method to calculate number of lines in the file
	public static void main(String[] args) throws FileNotFoundException {
	int numLines = 0;
	Scanner fileReader = new Scanner(new File("src/Mothership.txt")); {
	while (fileReader.hasNextLine()) {
		fileReader.nextLine();
		numLines++;
		}
	System.out.print(numLines);
	fileReader.close();
			}
		}
	
	// Create an analyze method to analyze the data in the array
	private static void analyze() {
		// TODO Auto-generated method stub
		System.out.print("Yes");
	}
}