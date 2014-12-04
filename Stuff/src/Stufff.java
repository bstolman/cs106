import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.io.*;
import java.util.Scanner;

public class Stufff {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Ben");
		name.add("Stolman");

		for (String b : name) {
			System.out.println(b);

			LinkedList<String> mane = new LinkedList<String>();
			mane.add("A");
			mane.add("B");
			mane.add("C");
			mane.add("D");
			Iterator<String> s = name.iterator();
			while (s.hasNext()) {
				System.out.println(s.next());
			}
		}

	}

}
