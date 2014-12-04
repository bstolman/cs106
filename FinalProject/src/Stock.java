import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import com.opencsv.CSVReader;

public class Stock {
	// declare a variable to store an array of Stock objects
		Define[] defines;
		// Create a load method to load the defines from a file
	public void readFile(String filepath) 
		// TODO Auto-generated method stub
		 throws FileNotFoundException {
			int i = 0;
			// Scanner
			Scanner fileReader = new Scanner(new File("src/S&P 500.csv"));
			
			while (fileReader.hasNext()) {
				
				String ticker = fileReader.next();
				String company = fileReader.next();
				String sector = fileReader.next();
				String country = fileReader.next();
				int marketCap = fileReader.nextInt();
				int PE = fileReader.nextInt();
				int price = fileReader.nextInt();
				int change = fileReader.nextInt();
				int volume = fileReader.nextInt();
				// Creates a Track Object
				this.defines[i] = new Define(ticker, company, sector, country,
						marketCap, PE, price, change, volume);

				System.out.println(defines[i] + "");
				i++;
				
				
			}

	}
}