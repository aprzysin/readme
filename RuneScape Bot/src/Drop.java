import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Item;



	public abstract class Drop extends Task<ClientContext> {
		// gets the api methods for EatFood
		public Drop(ClientContext ctx) {
	        super(ctx);
		}
		@Overide
		// checks for initial conditions to be able kill the rat
		public boolean activate() {
			// checks to see if there is a lvl 1 rat
			return ctx.backpack.select().count() == 28
					&&
					// checks to see if my character is doing nothing
					ctx.players.local().animation() == -1;
		}
		@Overide
	    public void execute() {
			for(Item i : ctx.backpack.id(323)) {
			    i.interact("Drop");
			}
			
		}
	}
