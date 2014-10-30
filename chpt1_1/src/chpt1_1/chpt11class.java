/**
 * 
 */
package chpt1_1;

import java.util.Scanner;
import java.io.*;

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
		// creates a file input.txt in src and creates a scanner to read this
		// file
		Scanner fileReader = new Scanner(new File("src/rank.txt"));
		Double rank = 0.0;
		while(fileReader.hasNext()) {
			fileReader.next();
			rank = fileReader.nextDouble();
		// @see pg 97
		for ( int i = 1; i <= 25; i++) {
			for (int x = 1; x <= i; x++) {
			// user prompt for ranking up
			String n = console.nextLine();
			System.out.print(n);
			System.out.print(i);
			System.out.print(",");
		}
			System.out.println();
	}
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
