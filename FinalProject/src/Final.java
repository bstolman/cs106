import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

import au.com.bytecode.opencsv.*;
import au.com.bytecode.opencsv.bean.*;

/**
 * @author BenStolman
 * 
 */
public class Final {

	/**
	 * @param args
	 * @throws IOException
	 */
	//Objective - find the stock with the largest marketCap in the S&P 500
	public static void main(String[] args) throws IOException {
		// Creating Object Class
		Stock library = new Stock();
		// Reads file
		library.readFile("src/S&P 500.csv");
		System.out.println("The stock with the highest marketCap: \n" + library.stocks.get(library.getMaxValue(library.callumns)));
		
	}

}