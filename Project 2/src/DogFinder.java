import java.util.Scanner; // for Scanner

/**
 * @author Andrew
 *
 */
public class DogFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		// Question info
		System.out.println("What dog are you!?!?!?");
		System.out.println("Answer these questions to find out");
		System.out.println("Answer with a 1,2,3 or 4");
		// first question
		System.out.println("Which type of vehicle do you like the best?");
		System.out.println("1. Car");
		System.out.println("2. SUV");
		System.out.println("3. Pickup Truck");
		System.out.println("4. Monster Truck");
		// input of the first question
		int question1 = console.nextInt();
		// second question
		System.out.println("Which animal do you prefer?");
		System.out.println("1. Rat");
		System.out.println("2. Lemur");
		System.out.println("3. Wolf");
		System.out.println("4. Hippo");
		// input of the second question
		int question2 = console.nextInt();
		// third question
		System.out.println("Which device do you like the best?");
		System.out.println("1. Mini-Tablet");
		System.out.println("2. Tablet");
		System.out.println("3. Laptop");
		System.out.println("4. Computer");
		// input of the third question
		int question3 = console.nextInt();
		// fourth question
		System.out.println("Which gun do you prefer?");
		System.out.println("1. Glock");
		System.out.println("2. Uzi");
		System.out.println("3. AK-47");
		System.out.println("4. M249");
		// input of the fourth question
		int question4 = console.nextInt();
		// fifth question
		System.out.println("Which toy do you prefer?");
		System.out.println("1. Rubik's Cube");
		System.out.println("2. Skateboard");
		System.out.println("3. Mountain Bike");
		System.out.println("4. Bounce House");
		// input of the fifth question
		int question5 = console.nextInt();
		// retrieves and prints the questionnaire results
		questionResults(question1, question2, question3, question4, question5);
	}

	/**
	 * Adds the question values and computes it into what dog the user is and prints that result
	 * 
	 * @param question1
	 * 					The question 1 value
	 * @param question2
	 * 					The question 2 value
	 * @param question3
	 * 					The question 3 value
	 * @param question4 
	 * 					The question 4 value
	 * @param question5
	 * 					The question 5 value
	 */
	public static void questionResults(int question1, int question2,
			int question3, int question4, int question5) {
		// adding the results of the questionnaire
		int finalResults = question1 + question2 + question3 + question4
				+ question5;
		// determines and prints what kind of dog the user is
		if (5 <= finalResults && 8 >= finalResults) {
			System.out.println("You are a Poodle!");
		} else if (9 <= finalResults && 12 >= finalResults) {
			System.out.println("You are a Husky!");
		} else if (13 <= finalResults && 16 >= finalResults) {
			System.out.println("You are an Alaskan Malamute!");
		} else if (17 <= finalResults && 20 >= finalResults) {
			System.out.println("You are a Great Dane!");
		} else {
			System.out.println("You are a mutt!");
		}
	}
}
