/**
 * 
 */

/**
 * @author Andrew
 *
 */
import java.util.*;

public class chpt3test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i =1; i <= 20; i++) {
			// @see book pg 154
			double random = Math.random();
			writeSpaces(3);
			System.out.print(random);

		}
		System.out.println();
		int answer = sum(100);
		System.out.print(answer);
		// @see pg 160 and 166
		String s1 = " yo noob";
		System.out.println(s1);
		System.out.println(s1.length());
		// @see pg 167
		Scanner console = new Scanner(System.in);
		double exponet = console.nextDouble();
		double bigNumber = console.nextDouble();
		
		double answer2 = bigNumber + exponet;
		
		System.out.println(answer);
		
		
		}
		public static void writeSpaces(int number) {
			for (int i =1; i <= number; i++){
				System.out.print(" ");
			}
	}
		public static int sum(int n){
			return (n+1) * n / 2;
		}
		}
		// TODO Auto-generated method stub

	


