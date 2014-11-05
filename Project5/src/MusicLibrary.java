import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MusicLibrary {
	// declare a variable to store an array of Track objects
	Track[] tracks;

	// Create a load method to load the tracks from a file

	public void readFile(String filepath) throws FileNotFoundException {
		int i = 0;
		// Scanner
		Scanner fileReader = new Scanner(new File("src/Mothership.txt"));
		// While the file reader has a next line to read it will continue
		while (fileReader.hasNext()) {
			int number = fileReader.nextInt();
			int time = fileReader.nextInt();
			String artist = fileReader.next();
			String song = fileReader.next();
			// Creates a Track Object
			this.tracks[i] = new Track(number, time, artist, song);

			System.out.println(tracks[i]);
			i++;
		}
		fileReader.close();
	}

	// Create a numLines method to calculate number of lines in the file
	public MusicLibrary() throws FileNotFoundException {
		int numLines = 0;
		Scanner fileReader = new Scanner(new File("src/Mothership.txt"));
		{
			while (fileReader.hasNextLine()) {
				fileReader.nextLine();
				numLines++;
			}
			System.out.println(numLines);
			fileReader.close();

		}
		// Sizing Array
		this.tracks = new Track[numLines];
	}

	// Create an analyze method to analyze the data in the array
	public int getMaxValue() throws FileNotFoundException {
		int maxValue = 0;
		// Find longest track in mothership
		for (int i = 0; i < tracks.length; i++) {
			if (tracks[i].getTime() > maxValue) {
				maxValue = tracks[i].getTime();
				tracks[i].getTime();
			}
		}

		return maxValue;

	}
}
	