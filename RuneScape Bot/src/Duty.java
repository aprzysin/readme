import org.powerbot.script.ClientAccessor;
import org.powerbot.script.ClientContext;

/**
 * Sets the class skeleton for duties and links the duties to the main method
 * with the right libraries
 * 
 * @see http 
 *      ://www.powerbot.org/community/topic/1182786-the-rsbot-cookbook-writing
 *      -your-first-script-using-tasks/
 * 
 * @author Andrew
 *
 * @param <C>
 *            Used for compatibility for both rt4 and rt6 versions
 */
public abstract class Duty<C extends ClientContext> extends ClientAccessor<C> {
	/**
	 * Constructor function. Sets up initial state.
	 * 
	 * @param ctx
	 *            Class that contains all the api methods for programming RSBot
	 */
	public Duty(C ctx) {
		super(ctx);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Contains the initial conditions that are required for the execute method
	 * to run
	 * 
	 * @return retrieves info on the initial conditions to determine if the
	 *         execute method should run
	 */
	public abstract boolean activate();

	/**
	 * Runs duties in RSbot if the activate method returns true
	 */
	public abstract void execute();
}
