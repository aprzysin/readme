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
		// creates a file input.txt in src and creates a scanner to read this
		// file
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		// declare variables
		// how much is in the checking account
		double checkingAmount = 0.0;
		// how much is on the credit card
		double creditCardAmount = 0.0;
		// how much is in the savings
		double savingsAmount = 0.0;

		// where the account information is read and processed
		while (fileReader.hasNext()) {

			// skips the date
			fileReader.next();
			// reads and displays part of the line where input.txt says
			// "Credit Card"
			if (fileReader.hasNext("Credit")) {
				System.out.println("Credit Card");
				fileReader.next();
				fileReader.next();
				// reads and displays part of the line were input.txt says
				// "Opening Balance"
				if (fileReader.hasNext("Opening")) {
					System.out.println("Opening Balance");
					fileReader.next();
					fileReader.next();
					// adds the opening balance amount to the credit card
					creditCardAmount += fileReader.nextDouble();
					// reads and displays part of the line where input.txt says
					// "Withdrawal"
				} else if (fileReader.hasNext("Withdrawal")) {
					System.out.println("Withdrawal");
					fileReader.next();
					// subtracts the withdrawal amount from the credit card
					creditCardAmount -= fileReader.nextDouble();
					// reads and displays part of the line where input.txt says
					// "Deposit"
				} else if (fileReader.hasNext("Deposit")) {
					System.out.println("Deposit");
					fileReader.next();
					// adds the deposit to the credit card
					creditCardAmount += fileReader.nextDouble();
				}
				// reads and displays part of the line where input.txt says
				// "Savings"
			} else if (fileReader.hasNext("Savings")) {
				System.out.println("Savings");
				// skips the date
				fileReader.next();
				// reads and displays part of the line were input.txt says
				// "Opening Balance"
				if (fileReader.hasNext("Opening")) {
					System.out.println("Opening Balance");
					fileReader.next();
					fileReader.next();
					// adds the opening balance amount to the savings
					savingsAmount += fileReader.nextDouble();
					// reads and displays part of the line were input.txt says
					// "Withdrawal"
				} else if (fileReader.hasNext("Withdrawal")) {
					System.out.println("Withdrawal");
					fileReader.next();
					// subtracts the withdrawal amount from the savings
					savingsAmount -= fileReader.nextDouble();
					// reads and displays part of the line were input.txt says
					// "Deposit"
				} else if (fileReader.hasNext("Deposit")) {
					System.out.println("Deposit");
					fileReader.next();
					// adds the deposit amount to the savings
					savingsAmount += fileReader.nextDouble();
				}
				// reads and displays part of the line where input.txt says
				// "Checking"
			} else if (fileReader.hasNext("Checking")) {
				System.out.println("Checking");
				// skips the date
				fileReader.next();
				// reads and displays part of the line were input.txt says
				// "Opening Balance"
				if (fileReader.hasNext("Opening")) {
					System.out.println("Opening Balance");
					fileReader.next();
					fileReader.next();
					// adds the opening balance amount to the checking account
					checkingAmount += fileReader.nextDouble();
					// reads and displays part of the line were input.txt says
					// "Withdrawal"
				} else if (fileReader.hasNext("Withdrawal")) {
					System.out.println("Withdrawal");
					fileReader.next();
					// subtracts the withdrawal amount from the checking account
					checkingAmount -= fileReader.nextDouble();
					// reads and displays part of the line were input.txt says
					// "Deposit"
				} else if (fileReader.hasNext("Deposit")) {
					System.out.println("Deposit");
					fileReader.next();
					// adds the deposit amount to the checking account
					checkingAmount += fileReader.nextDouble();
				}

			}
		}
		// makes the print stream output to print data to the path
		// src/output.txt
		PrintStream output = new PrintStream(new File("src/output.txt"));
		// prints the credit card total, savings total, and checking total to
		// src/output.txt
		output.println("Credit Card Total: " + creditCardAmount);
		output.println("Savings Total: " + savingsAmount);
		output.println("Checking Total: " + checkingAmount);
		// closes the fileReader scanner
		fileReader.close();
		// closes the output print stream
		output.close();
	}

	// TODO Auto-generated method stub

}
