import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A class which represents the player info from the filePath file
 * 
 * @author Andrew
 *
 */
public class Data {
	// variable to track the players rank
	private double playerRank;
	// variable to track the players score
	private double playerScore;

	/**
	 * Constructor function. Sets the starting values based on the provided
	 * values
	 * 
	 * @param startPlayerRank
	 *            - variable used in the constructor to represent the player's
	 *            rank
	 * @param startPlayerScore
	 *            - variable used in the constructor to represent the player's
	 *            score
	 * @throws FileNotFoundException
	 *             - makes the program not crash if a file is not found
	 */
	public Data(double startPlayerRank, double startPlayerScore)
			throws FileNotFoundException {

		// makes the playerRank variable equal to startPlayerRank
		this.playerRank = startPlayerRank;
		// makes the playerScore variable equal to startPlayerScore
		this.playerScore = startPlayerScore;
	}

	/**
	 * A method to convert this object into a string
	 * 
	 * @return String from the stringified object
	 */
	public double playerScore() {
		// TODO Auto-generated method stub
		return this.playerScore;
	}

	/**
	 * A method to convert this object into a sting
	 * 
	 * @return String from the stringified object
	 */
	public double playerRank() {
		// TODO Auto-generated method stub
		return this.playerRank;
	}

}
