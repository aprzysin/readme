import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A class that represents a parser for the player info in the blackops file
 * 
 * @author Andrew Przysinda
 *
 */
public class Server {
	// declares the array datas
	private Data[] datas;
	// declares the array file
	private File file;

	/**
	 * A method to convert the filePath file info into an array of objects
	 * 
	 * @param filePath
	 *            The path to the file that is being read (src/blackops in this
	 *            case)
	 * @throws FileNotFoundException
	 *             makes the program not crash if a file is not found
	 */
	public void load(String filePath) throws FileNotFoundException {
		// adds the file path into the file array
		this.file = new File(filePath);
		// makes the datas array to have the same amount of array values as the
		// amount of lines in the filePath file
		this.datas = new Data[this.numLines()];
		// scanner for reading the filePath file info
		Scanner fileReader = new Scanner(this.file);
		// variable to represent what object the array is on
		int i = 0;
		// reads all the lines and puts them into the datas array
		while (fileReader.hasNext()) {
			// reads one line and adds it to the datas array
			this.datas[i] = new Data(fileReader.nextDouble(),
					fileReader.nextDouble());
			// adds one to i to switch the array object
			i++;
		}
	}

	/**
	 * A method to determine the amount of lines that is in the filePath file
	 * 
	 * @return returns the amount of lines in the filePath file
	 * @throws FileNotFoundException
	 *             makes the program not crash if a file is not found
	 */
	private int numLines() throws FileNotFoundException {
		// scanner for reading the file info
		Scanner lineReader = new Scanner(this.file);
		// variable that represents the amount of lines in the filePath file
		int lines = 0;
		// determines the amount of lines in the filePath file
		while (lineReader.hasNextLine()) {
			// reads a line in the filePath file
			lineReader.nextLine();
			// adds one to lines to determine the amount of lines
			lines++;
		}
		return lines;
	}

	// variable that represents all the scores added up
	double totalScore = 0.0;
	// variable that represents all the ranks added up
	double totalRank = 0.0;

	/**
	 * A method that performs additive calculations on the filePath file info
	 * for analysis
	 * 
	 * @throws FileNotFoundException
	 *             makes the program not crash if a file is not found
	 */
	public void analyze() throws FileNotFoundException {
		for (Data d : datas) {
			// adds one of the datas array values for playerScore to totalScore
			totalScore += d.playerScore();
			// adds one of the datas array values for playerRank to totalRank
			totalRank += d.playerRank();

		}
		// displays the total amount of the player's score
		System.out
				.println("Total Amount Of The Player's Scores: " + totalScore);
		// calculates and displays the average player score
		System.out
				.println("Average Player Score: " + totalScore / datas.length);
		// calculates and displays the average player rank
		System.out.println("Average Player Rank: " + totalRank / datas.length);
	}

}
