import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Item;

/**
 * Drops burnt food from the backpack
 * 
 * @author Andrew
 *
 */
public class BurntDrop extends Duty<ClientContext> {
	// holds the Ids of the burnt fish to drop
	private String[] burntFish = { "Burnt fish", "Burnt Shrimp" };

	/**
	 * Constructor function. Sets up initial state.
	 * 
	 * @param ctx
	 *            gets the API methods
	 */
	public BurntDrop(ClientContext ctx) {
		super(ctx);
	}

	@Overide
	/**
	 * checks for initial conditions to be able to drop the food
	 * 
	 * @return true if there is burnt fish in inventory, player is doing nothing
	 */
	public boolean activate() {
		// checks to see if there is/were (a) burnt fish
		return !ctx.backpack.select().name(burntFish).isEmpty() &&
		// checks to see if my character is doing nothing
				ctx.players.local().animation() == -1;
	}

	@Overide
	/**
	 * drops food if initial conditions are met
	 */
	public void execute() {
		// drops the burnt food
		for (Item i : ctx.backpack.name(burntFish)) {
			i.interact("Drop");
		}
	}

}
