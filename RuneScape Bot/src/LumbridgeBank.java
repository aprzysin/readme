import org.powerbot.script.Locatable;
import org.powerbot.script.rt6.Bank;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.GameObject;
import org.powerbot.script.rt6.Npc;
/**
 * Goes to and gets food from the Lumbridge bank
 * 
 * @author Andrew
 *
 */
public class LumbridgeBank extends Duty<ClientContext> {
	private int food = 315;
	private int[] stairs = {36773, 36774, 36775};
	// gets the api methods for KillRat
	public LumbridgeBank(ClientContext ctx) {
        super(ctx);
	}
	@Overide
	// checks for initial conditions to be able to get the food
	public boolean activate() {
		// checks to see if there is food in the backpack
		return ctx.backpack.select().id(food).count() == 0
				&&
		// checks to see if my character is doing nothing
		ctx.players.local().animation() == -1;
	}
	@Overide
	// gets food from the bank if the initial conditions are met
    public void execute() {
		// declares bank as a GameObject which is also the nearest bank
		Bank bank = ctx.bank;
		// locates and opens the bank account
		if(bank.inViewport()) {
		// opens bank account
			bank.interact("Bank");
			// locates the bank if it's not on the screen
		} else {
			// moves to the rat
			ctx.movement.step((Locatable) bank);
			// turns to the rat
			ctx.camera.turnTo(bank);
		}
	}
    

}
