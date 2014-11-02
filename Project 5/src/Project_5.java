/**
 * 
 */

/**
 * @author Andrew
 *
 */
import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
/**
 * 
 * @author Andrew Przysinda
 *
 */
public class Project_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Server s = new Server();
		// gets the load method from Server.java and uses src/blackops as the file path
		s.load("src/blackops");
		// gets the analyze method from Server.java
		s.analyze();

		// TODO Auto-generated method stub

	}

}
