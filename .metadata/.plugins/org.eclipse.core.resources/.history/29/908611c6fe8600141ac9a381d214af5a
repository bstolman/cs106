import java.io.*;

import com.opencsv.CSVReader;

import au.com.bytecode.opencsv.*;
import au.com.bytecode.opencsv.bean.*;


public class StockID {
	// Defining each value in relation to its function (integer or String).
	public static int values;
	String ticker;
	String company;
	String industry;
	String sector;
	String country;
	double marketCap;
	double PE;
	double price;
	double change;
	int volume;

	public StockID(String ticker, String company,String industry, String sector, String country,
			double marketCap, double PE, double price, double change, int volume) {
		this.ticker = ticker;
		this.company = company;
		this.industry = industry;
		this.sector = sector;
		this.country = country;
		this.marketCap = marketCap;
		this.PE = PE;
		this.price = price;
		this.change = change;
		this.volume = volume;

	}

	public StockID() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return this.ticker + "\t" + "\t" + this.company + "\t" + "\t" + this.industry + "\t" + "\t"  + "\t" + this.sector + "\t"
				 + "\t" + this.country + "\t" + "\t" + this.marketCap + "\t" + "\t" + this.PE + "\t" + "\t"
				+ this.price + "\t" + "\t" + this.change + "\t" + "\t" + this.volume + "\t" + "\t";

	}

	public void readFile(String string) {
		// TODO Auto-generated method stub

	}

}
//loop through and call to string directly from stock reader "stock class currently"
//goal find the best stock - according to preset conditions ie lowest pe
