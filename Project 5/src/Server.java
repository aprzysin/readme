import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Andrew
 *
 */
public class Server {
	// declare datas array from Data.java for the values in blackops.txt
	private Data[] datas;
	//declare file for the file path src/blackops
	private File file;
	/**
	 * 
	 * @param filePath
	 * @throws FileNotFoundException
	 */
	public void load(String filePath) throws FileNotFoundException  {
		this.file = new File(filePath);
		this.datas = new Data[this.numLines()];
		Scanner fileReader = new Scanner(this.file);
		int i = 0;
		while (fileReader.hasNext()) {
			this.datas[i] = new Data(fileReader.nextDouble(), fileReader.nextDouble());
			i++;
		}
	}
	/**
	 * 
	 * @return
	 * @throws FileNotFoundException
	 */
	private int numLines() throws FileNotFoundException  {
		Scanner lineReader = new Scanner(this.file);
		int lines  = 0;
		while (lineReader.hasNextLine()) {
			lineReader.nextLine();
			lines++;
		}
		return lines;
	}
	double totalScore = 0.0;
	double totalRank = 0.0;
	/**
	 * 
	 * @throws FileNotFoundException
	 */
	public void analyze() throws FileNotFoundException {

		for (Data d : datas) {
			totalScore += d.playerScore();
			totalRank += d.playerRank();
			
		}
		System.out.println("Total Amount Of The Player's Scores: " + totalScore);
		System.out.println("Average Player Score: " + totalScore / datas.length);
		System.out.println("Average Player Rank: " + totalRank / datas.length);
	}
	

}
