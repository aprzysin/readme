/**
 * 
 */
package chpt1_1;

/**
 * @author Andrew
 *
 */
public class Project_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// @see Book Pg 34
		prestigeCalculator();
	  
		// TODO Auto-generated method stub
	}
	/** 
	 * @see Book Pg 34 
	 */
	public static void prestigeCalculator() {
		// declare variables
		int currentExp;
		int currentPrestige;
		int prestigeGoal;
		int expTillPrestige;
		int expTillPrestigeGoal;
		  
		//user input
		/**
		 * @see Book Pg 77
		 */
		currentExp = 1000000;
		currentPrestige = 3;
		prestigeGoal = 5;
		//compute
		expTillPrestige = 1202800 - currentExp;
		expTillPrestigeGoal = (1202800*prestigeGoal) - (1202800*currentPrestige) - currentExp;
		  
		//print results
		/**
		 * @see Book Pg 9
		 */
		System.out.print("Exp Needed To Pretige: ");
		System.out.println(expTillPrestige);
		System.out.print("Exp Needed For Pretige Level ");
		System.out.print(prestigeGoal);
		System.out.print(": ");
		System.out.print(expTillPrestigeGoal);

}
}
