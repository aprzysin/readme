import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// should be player info w/o scanner that should be parser also should find the # of lines
public class Data {
	// variable to track the players rank
	private double playerRank;
	// variable to track the players score
	private double playerScore;
	// Constructor
	public Data(double startPlayerRank, double startPlayerScore) throws FileNotFoundException  {
		// creates a file input.txt in src and creates a scanner to read this
		// file
		//seperate to the parser Scanner fileReader = new Scanner(new File("src/blackops.txt"));
		//Scanner fileReader = new Scanner(new File("src/input.txt"));
		//startPlayerRank = fileReader.nextDouble();
		//startPlayerScore = fileReader.nextDouble();
		
		this.playerRank = startPlayerRank;
		this.playerScore = startPlayerScore;}
		//while (fileReader.hasNext()) {
		//	fileReader.nextDouble();
		//	fileReader.nextDouble();


		//}

	public double playerScore() {
		// TODO Auto-generated method stub
		return this.playerScore;
	}
	public double playerRank() {
		// TODO Auto-generated method stub
		return this.playerRank;
	}

}
