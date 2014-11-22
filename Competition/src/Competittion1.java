/**
 * 
 */
import java.util.Scanner;
/**
 * @author Andrew
 *
 */
public class Competittion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		while (!console.hasNext("EOI")) {
			if (console.hasNext("nemo")) {
				console.next();
				// prompt user for input
				System.out.println("Found");
				}
				else {
					console.next();
				System.out.println("Missing");
			}

		}
	}

}

