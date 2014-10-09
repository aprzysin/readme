/**
 * 
 */

/**
 * @author Andrew
 *
 */
import java.io.*;
import java.util.*;

public class Project4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		double checkingAmount = 0.0;
		double creditCardAmount = 0.0;
		double savingsAmount = 0.0;
		
		while (fileReader.hasNext()) {

		fileReader.next();
		if (fileReader.hasNext("Credit")) {
			System.out.println("Credit Card");
			fileReader.next();
			fileReader.next();
			if (fileReader.hasNext("Opening")) {
				System.out.println("Opening Balance");
				fileReader.next();
				fileReader.next();
				creditCardAmount += fileReader.nextDouble();
			} else if (fileReader.hasNext("Withdrawal")) {
				System.out.println("Withdrawal");
				fileReader.next();
				creditCardAmount -= fileReader.nextDouble();
			} else if (fileReader.hasNext("Deposit")) {
				System.out.println("Deposit");
				fileReader.next();
				creditCardAmount += fileReader.nextDouble();
			}
		} else if (fileReader.hasNext("Savings")) {
			System.out.println("Savings");
			fileReader.next();
			if (fileReader.hasNext("Opening")) {
				System.out.println("Opening Balance");
				fileReader.next();
				fileReader.next();
				savingsAmount += fileReader.nextDouble();
			} else if (fileReader.hasNext("Withdrawal")) {
				System.out.println("Withdrawal");
				fileReader.next();
				savingsAmount -= fileReader.nextDouble();
			} else if (fileReader.hasNext("Deposit")) {
				System.out.println("Deposit");
				fileReader.next();
				savingsAmount += fileReader.nextDouble();
			}
		} else if (fileReader.hasNext("Checking")){
			System.out.println("Checking");
			fileReader.next();
			if (fileReader.hasNext("Opening")) {
				System.out.println("Opening Balance");
				fileReader.next();
				fileReader.next();
				checkingAmount += fileReader.nextDouble();
			} else if (fileReader.hasNext("Withdrawal")) {
				System.out.println("Withdrawal");
				fileReader.next();
				checkingAmount -= fileReader.nextDouble();
			} else if (fileReader.hasNext("Deposit")) {
				System.out.println("Deposit");
				fileReader.next();
				checkingAmount += fileReader.nextDouble();
			}

		}
		}
		PrintStream output = new PrintStream(new File("src/output.txt"));
		output.println("Credit Card Total: " + creditCardAmount);
		output.println("Savings Total: " + savingsAmount);
		output.println("Checking Total: " + checkingAmount);
		fileReader.close();
		output.close();
		}

		

		// TODO Auto-generated method stub

	}

