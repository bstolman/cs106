/*
 * @throws FileNotFoundException
 * @param agrs
 */
import java.io.*;
import java.util.*;

public class Exceptions {
//new means object

public static void main(String[] args) throws FileNotFoundException {
	Scanner fileReader = new Scanner(new File("src/input.txt"));
	while(fileReader.hasNext()) {
		System.out.println(fileReader.nextLine());
	fileReader.close();
	
/* .hasNext() can be used to determine when we hit the end of a file
 * token is a things that separates stuff
 * to access a file in src use src/filename.ext
 * to access files on the filesystem use absolute paths
 * eg. C:\etc or /Users/etc
 * ../ to move file directories
 */
	}
}

}
