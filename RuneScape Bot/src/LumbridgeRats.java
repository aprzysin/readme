import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.GameObject;

/**
 * Goes from the bank to the rats
 * 
 * @author Andrew
 *
 */
public class LumbridgeRats extends Duty<ClientContext> {
	// used to recognize the food in the backpack
	private int food = 315;

	/**
	 * Constructor function. Sets up initial state.
	 * 
	 * @param ctx
	 *            gets the API methods
	 */
	public LumbridgeRats(ClientContext ctx) {
		super(ctx);
	}

	@Overide
	/**
	 * checks for initial conditions to be able to return to the rats
	 * 
	 * @return true if there is food in the backpack, character is on a level other than the rat level
	 */
	public boolean activate() {
		// checks to see if there is food in the backpack
		return ctx.backpack.select().id(food).count() >= 1 &&
		// checks to see if my character is not on the rat level
				ctx.objects.select().id(36773).isEmpty();
	}

	@Overide
	/**
	 * climbs down the stairs from the bank to the rat level
	 */
	public void execute() {
		// stairs gets me to the ground level
		GameObject stairs2 = ctx.objects.select().id(36774).nearest().poll();
		GameObject stairs3 = ctx.objects.select().id(36775).nearest().poll();
		// Climbs from the 3rd to 2nd floor
		if (stairs3.inViewport()) {
			stairs3.interact("Climb-down");
			// Climbs from the 2nd to ground level
		}
		if (stairs2.inViewport()) {
			stairs2.interact("Climb-down");
		}

		// goes from the bank to the stairs and looking at the stairs
		else {
			// moves to the rat
			ctx.movement.step(stairs3);
			// turns to the rat
			ctx.camera.turnTo(stairs3);
		}

	}
}
