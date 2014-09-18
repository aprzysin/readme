/**
 * 
 */
package chpt1_1;

import java.util.Scanner; // for Scanner

/**
 * @author Andrew
 *
 */
public class Project_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//user input
		// @see Book Pg 167
		Scanner console = new Scanner(System.in);
		//user input
		
		System.out.println("What are your current experience points? ");
		int currentExp = console.nextInt();
		System.out.println("What is your current prestige level? ");
		int currentPrestige = console.nextInt();
		System.out.println("What pretige level do you want to get to? ");
		int prestigeGoal = console.nextInt();
		// @see Book Pg 34
		//print results
		/**
		 * @see Book Pg 9
		 */
		System.out.print("Exp Needed To Pretige: ");
		int expTillPrestige = prestigeCalculator2(currentExp, currentPrestige, prestigeGoal);
		System.out.println(expTillPrestige);
		System.out.print("Exp Needed For Pretige Level ");
		System.out.print(prestigeGoal);
		System.out.print(": ");
		int expTillPrestigeGoal = prestigeCalculator(currentExp, currentPrestige, prestigeGoal);
		System.out.print(expTillPrestigeGoal);
	  
		// TODO Auto-generated method stub
	}
	/** 
	 * @return 
	 * @see Book Pg 34 
	 */
	public static int prestigeCalculator(int currentExp, int currentPrestige, int prestigeGoal) {
		// declare variables


		//compute
		
		return (1202800*prestigeGoal) - (1202800*currentPrestige) - currentExp;

}
	public static int prestigeCalculator2(int currentExp, int currentPrestige, int prestigeGoal) {
	// declare variables


	//compute
	return 1202800 - currentExp;
	
}
}