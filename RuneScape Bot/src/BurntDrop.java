import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.GameObject;
import org.powerbot.script.rt6.Item;


public class BurntDrop extends Duty<ClientContext> {
	// holds the Ids of the things to drop
	private int burntId = 7954;
	// gets the api methods for KillRat
	public BurntDrop(ClientContext ctx) {
        super(ctx);
	}
	@Overide
	// checks for initial conditions to be able to drop the food
	public boolean activate() {
		// checks to see if there is a lvl 1 rat
		return !ctx.backpack.select().id(burntId).isEmpty()
				&&
		// checks to see if my character is doing nothing
		ctx.players.local().animation() == -1;
	}
	@Overide
    public void execute() {
		for(Item i : ctx.backpack.id(burntId)) {
		    i.interact("Drop");
		}
	}
    

}
