import java.io.File;
import java.io.FileNotFoundException;
import com.opencsv.CSVReader;
/**
 * @author BenStolman
 *
 */
public class Final {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// Creating Object Class
		Stock library = new Stock();
		// Reads file
		library.readFile("src/S&P 500.csv");
		
		
		}
		
		
	}

	

