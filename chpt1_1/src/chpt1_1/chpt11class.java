/**
 * 
 */
package chpt1_1;

import java.util.Scanner;

/**
 * @author Andrew
 *
 */
public class chpt11class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// @see pg 167
		Scanner console = new Scanner(System.in);
		// @see pg 97
		for ( int i = 1; i <= 25; i++) {
			for (int x = 1; x <= i; x++) {
			String n = console.nextLine();
			System.out.print(n);
			System.out.print(i);
			System.out.print(",");
		}
			System.out.println();
	}
		// @return
	System.out.print("Total Numbers: ");
	System.out.print(sum(10));	
		// TODO Auto-generated method stub

	}
	// @see pg 156
	public static int sum(int n){
		return (n+1) * n / 2;
	}
}
