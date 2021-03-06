import java.util.Scanner; // for Scanner

/**
 * @author Andrew
 *
 */
public class Project_3 {

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
		int question1 = 0;
		while (question1 <= 0 || question1 > 4) {
			if (console.hasNextInt()) {
				// prompt user for input
				question1 = console.nextInt();
				if (question1 <= 0 || question1 > 4) {
					// response if the input isn't in the right range
					System.out.println("Enter 1, 2, 3, 4");
				}
			} else {
				// response if the input isn't an integer
				System.out.println("Enter 1, 2, 3, 4");
				console.next();
			}
		}
		// second question
		System.out.println("Which animal do you prefer?");
		System.out.println("1. Rat");
		System.out.println("2. Lemur");
		System.out.println("3. Wolf");
		System.out.println("4. Hippo");
		// input of the second question
		int question2 = 0;
		while (question2 <= 0 || question2 > 4) {
			if (console.hasNextInt()) {
				// prompt user for input
				question2 = console.nextInt();
				if (question2 <= 0 || question2 > 4) {
					// response if the input isn't in the right range
					System.out.println("Enter 1, 2, 3, 4");
				}
			} else {
				// response if the input isn't an integer
				System.out.println("Enter 1, 2, 3, 4");
				console.next();
			}
		}
		// third question
		System.out.println("Which device do you like the best?");
		System.out.println("1. Mini-Tablet");
		System.out.println("2. Tablet");
		System.out.println("3. Laptop");
		System.out.println("4. Computer");
		// input of the third question
		int question3 = 0;
		while (question3 <= 0 || question3 > 4) {
			if (console.hasNextInt()) {
				// prompt user for input
				question3 = console.nextInt();
				if (question3 <= 0 || question3 > 4) {
					// response if the input isn't in the right range
					System.out.println("Enter 1, 2, 3, 4");
				}
			} else {
				// response if the input isn't an integer
				System.out.println("Enter 1, 2, 3, 4");
				console.next();
			}
		}
		// fourth question
		System.out.println("Which gun do you prefer?");
		System.out.println("1. Glock");
		System.out.println("2. Uzi");
		System.out.println("3. AK-47");
		System.out.println("4. M249");
		// input of the fourth question
		int question4 = 0;
		while (question4 <= 0 || question4 > 4) {
			if (console.hasNextInt()) {
				// prompt user for input
				question4 = console.nextInt();
				if (question4 <= 0 || question4 > 4) {
					// response if the input isn't in the right range
					System.out.println("Enter 1, 2, 3, 4");
				}
			} else {
				// response if the input isn't an integer
				System.out.println("Enter 1, 2, 3, 4");
				console.next();
			}
		}
		// fifth question
		System.out.println("Which toy do you prefer?");
		System.out.println("1. Rubik's Cube");
		System.out.println("2. Skateboard");
		System.out.println("3. Mountain Bike");
		System.out.println("4. Bounce House");
		// input of the fifth question
		int question5 = 0;
		while (question5 <= 0 || question5 > 4) {
			if (console.hasNextInt()) {
				// prompt user for input
				question5 = console.nextInt();
				if (question5 <= 0 || question5 > 4) {
					// response if the input isn't in the right range
					System.out.println("Enter 1, 2, 3, 4");
				}
			} else {
				// response if the input isn't an integer
				System.out.println("Enter 1, 2, 3, 4");
				console.next();
			}
		}
		// retrieves and prints the questionnaire results
		questionResults(question1, question2, question3, question4, question5);
	}

	/**
	 * Adds the question values and computes it into what dog the user is and
	 * prints that result
	 * 
	 * @param question1
	 *            The question 1 value
	 * @param question2
	 *            The question 2 value
	 * @param question3
	 *            The question 3 value
	 * @param question4
	 *            The question 4 value
	 * @param question5
	 *            The question 5 value
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
		}
	}
}
