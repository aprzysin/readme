/**
 * 
 */

/**
 * @author Andrew
 *
 */
import java.io.*;
import java.util.*;

public class Fun_Project {

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
		int	lineCounter = 0;
		String[] dates = new String[lineCounter];
		String[] accounts = new String[lineCounter];
		String[] transactions = new String[lineCounter];
		double[] amounts = new double[lineCounter];
		int i = 0;
		double checking = 0.0;
		double savings = 0.0;
		double credit = 0.0;
		for (i = 0; i < dates.length; i++) {
			if (accounts[i].equals("Checking")){
				if (transactions[i].equals("Withdrawal")) {
					checking -= amounts[i];
				}
			if (accounts[i].equals("Savings")){
				if (transactions[i].equals("Withdrawal")) {
						checking -= amounts[i];
				}
			if (accounts[i].equals("Credit")){
				if (transactions[i].equals("Withdrawal")) {
						checking -= amounts[i];
				}
			if (accounts[i].equals("Checking")){
				if (transactions[i].equals("Deposit")) {
					checking -= amounts[i];
					}
			if (accounts[i].equals("Savings")){
				if (transactions[i].equals("Deposit")) {
						checking -= amounts[i];
				}
			if (accounts[i].equals("Credit")){
				if (transactions[i].equals("Deposit")) {
							checking -= amounts[i];
					}
			if (accounts[i].equals("Checking")){
				if (transactions[i].equals("Opening")) {
					checking += amounts[i];
				}
			if (accounts[i].equals("Savings")){
				if (transactions[i].equals("Opening")) {
						checking += amounts[i];
				}
			if (accounts[i].equals("Credit")){
				if (transactions[i].equals("Opening")) {
						checking += amounts[i];
				}
				}
			}
		while (fileReader.hasNextLine()) {
			fileReader.nextLine();
			lineCounter ++;
		}
		while (fileReader.hasNext()) {
			dates[i] = fileReader.next();
			if (accounts[i].equals("Credit")) {
				accounts[i] = accounts[i] + " " + fileReader.next();
			}
			transactions[i] = fileReader.next();
			if (transactions[i].equals("Opening")){
				transactions[i] = transactions[i] + " " + fileReader.next();
				
			}
			amounts[i] = fileReader.nextDouble();
			i++;
			System.out.println()
		}


			}
		}
		for (i = 0; i < dates.length; i++) {

		System.out.println("Lines in input.txt: " + lineCounter);
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
