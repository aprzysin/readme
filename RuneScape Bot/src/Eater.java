import org.powerbot.script.Condition;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Item;

import java.util.concurrent.Callable;

/**
 * Eats food when health is at or less than 99%
 * 
 * @author Andrew Przysinda
 *
 */
public class Eater extends Duty<ClientContext> {
	// used to recognize the food in the backpack
	private int food = 315;
	// used to represent the players health percent for determining when to eat
	private double percent;

	/**
	 * Constructor function. Sets up initial state.
	 * 
	 * @param ctx
	 *            gets the API methods
	 */
	public Eater(ClientContext ctx) {
		super(ctx);
	}

	@Overide
	/**
	 * checks for initial conditions to be able to eat the food
	 * 
	 * @see http://www.powerbot.org/community/topic/1232790-healthpercent-doesnt-work-for-rs6/
	 * 
	 * @return true if players health is at or below 99%, player is alive, food in backpack
	 */
	public boolean activate() {
		// makes the percent variable an actual percent of the players HP
		percent = (double) ctx.combatBar.health()
				/ ctx.combatBar.maximumHealth() * 100;
		// returns the values that need to be true to start the execute method
		return

		// checks to see if my health is at or below 99%
		percent <= 99 &&
		// checks to see if my character is alive
				percent > 0 &&
				// prevents this duty when there is no food
				ctx.backpack.select().id(food).count() > 0;

	}

	@Overide
	/**
	 * executes the eating of the food if the initial conditions are met
	 * 
	 * @see https://www.powerbot.org/community/topic/1231541-how-to-stop-multiple-eatings-and-long-pauses/
	 */
	public void execute() {
		// used to recognize the food id in the backpack
		final Item edible = ctx.backpack.select().id(food).poll();
		// scrolls down the backpack to the food
		ctx.backpack.scroll(edible);
		// Eats the food
		edible.interact("Eat");
		// makes the method wait to prevent excessive food eating
		Condition.wait(new Callable<Boolean>() {
			@Override
			public Boolean call() throws Exception {
				return !edible.valid();
			}
		});

	}
}
