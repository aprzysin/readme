import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.GameObject;

/**
 * gets food from the bank
 * 
 * @author Andrew Przysinda
 *
 * @see https://gist.github.com/anonymous/f7e84a2c3a8bce55f441
 */
public class FoodBank extends Duty<ClientContext> {
	// used to recognize the food in the backpack
	private int food = 315;

	/**
	 * Constructor function. Sets up initial state.
	 * 
	 * @param ctx
	 *            gets the API methods
	 */
	public FoodBank(ClientContext ctx) {
		super(ctx);
	}

	@Overide
	/**
	 * checks for initial conditions to be able kill the rat
	 * 
	 * @return true if there is a bank on the map, no food in the backpack
	 */
	public boolean activate() {
		// checks to see if there is a bank
		return !ctx.objects.select().id(36786).isEmpty() &&
		// checks to see if there is no food in the backpack
				ctx.backpack.select().id(food).count() == 0;
	}

	@Overide
	/**
	 * executes the programs if the initial conditions are met
	 */
	public void execute() {
		// used for getting food from and confirming the local player is in the
		// right location
		GameObject bank = ctx.objects.select().id(36786).nearest().poll();
		// moves to, turns to and opens the bank
		if (bank.inViewport()) {
			// moves to the bank
			ctx.movement.step(bank);
			// turns to the bank
			ctx.camera.turnTo(ctx.bank.nearest());
			// opens the bank
			ctx.bank.open();
			// brings up the deposit window
			if (ctx.bank.open()) {
				ctx.bank.depositInventory();
				// withdraws 28 food
				if (ctx.bank.depositInventory()) {
					// withdraws 28 food
					ctx.bank.withdraw(food, 28);
					// closes the bank once the food is withdrawn
					if (ctx.backpack.select().id(food).count() == 28) {
						// close it
						ctx.bank.close();

					}
				}
			}
			// if we can't see the bank move and turn to it
		} else {
			// moves towards the bank
			ctx.movement.step(ctx.bank.nearest());
			// turns to the bank
			ctx.camera.turnTo(ctx.bank.nearest());

		}
	}
}
