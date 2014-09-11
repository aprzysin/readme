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
		PrestigeCalc();
	  
	  
	  
	  
	  
		// TODO Auto-generated method stub

	}
	public static void PrestigeCalc() {
		// declare variables
		  int CurrentExp;
		  int CurrentPrestige;
		  int PrestigeGoal;
		  int ExpTillPrestige;
		  int ExpTillPrestigeGoal;
		  
		  	//user input
		  CurrentExp = 1000000;
		  CurrentPrestige = 3;
		  PrestigeGoal = 5;
		  	//compute
		  ExpTillPrestige = 1202800 - CurrentExp;
		  ExpTillPrestigeGoal = (1202800*PrestigeGoal) - (1202800*CurrentPrestige) - CurrentExp;
		  
		  //print results
		  System.out.print("Exp Needed To Pretige: ");
		  System.out.println(ExpTillPrestige);
		  System.out.print("Exp Needed For Pretige Level ");
		  System.out.print(PrestigeGoal);
		  System.out.print(": ");
		  System.out.print(ExpTillPrestigeGoal);

}
}
