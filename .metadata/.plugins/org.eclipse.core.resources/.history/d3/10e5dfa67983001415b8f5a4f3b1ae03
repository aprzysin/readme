import java.util.ArrayList;
import java.util.List;

import org.powerbot.script.Locatable;
import org.powerbot.script.rt6.Bank;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.GameObject;
import org.powerbot.script.rt6.Npc;
/**
 * Goes from the rats to the Lumbridge bank
 * 
 * @author Andrew
 *
 */
public class LumbridgeBank extends Duty<ClientContext> {
	// used to recognize the food in the backpack
	private int food = 315;
	/**
	 * Constructor function. Sets up initial state.
	 * 
	 * @param ctx gets the API methods
	 */
	public LumbridgeBank(ClientContext ctx) {
        super(ctx);
	}
	@Overide
	/**
	 * checks for initial conditions to be able to go to the bank
	 * 
	 * @return food in the backpack, animation state of character
	 */
	public boolean activate() {
		// checks to see if there is food in the backpack
		return ctx.backpack.select().id(food).count() == 0
				&&
		// checks to see if my character is doing nothing
		ctx.players.local().animation() == -1;
	}
	@Overide
	// goes to the bank if the initial conditions are met
	/**
	 * if initial conditions are met this method goes to the bank
	 */
    public void execute() {
		// used to get me to the bank
		GameObject bank = ctx.objects.select().id(36786).nearest().poll();
		// used for climbing up the stairs
		GameObject stairs1 = ctx.objects.select().id(36773).nearest().poll();
		GameObject stairs2 = ctx.objects.select().id(36774).nearest().poll();
			// climbs from floor 1 to 2
		 if (stairs1.inViewport()) {
			stairs1.interact("Climb-up");
			// climbs from floor 2 to 3
		} if (stairs2.inViewport()) {
			stairs2.interact("Climb-up");
		}
		// moves and turns to places that may not be in view
		else {
			// moves to the stairs
			ctx.movement.step(stairs1);
			// turns to the stairs
			ctx.camera.turnTo(stairs1);
			// moves to the bank
			ctx.movement.step(bank);
			// turns to the stairs
			ctx.camera.turnTo(bank);
		}
	}
    

}
