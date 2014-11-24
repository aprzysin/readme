import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.GameObject;
import org.powerbot.script.rt6.Npc;
/**
 * kills lvl 1 rats
 * 
 * @author Andrew Przysinda
 *
 */
public class KillRat extends Duty<ClientContext> {
	// gets the api methods for KillRat
	public KillRat(ClientContext ctx) {
        super(ctx);
	}
	@Overide
	// checks for initial conditions to be able kill the rat
	public boolean activate() {
		// checks to see if there is a lvl 1 rat
		return !ctx.npcs.select().id(47).isEmpty()
				&&
		// checks to see if my character is doing nothing
		ctx.players.local().animation() == -1;
	}
	@Overide
	// executes the programs if the initial conditions are met
    public void execute() {
		// declares rat as a GameObject which is also the nearest rat
		Npc rat = ctx.npcs.nearest().poll();
		// locates and attacks a rat
		if(rat.inViewport()) {
		// kills the rat on the screen
			rat.interact("Attack");
			// locates the rat if it's not on the screen
		} else {
			// moves to the rat
			ctx.movement.step(rat);
			// turns to the rat
			ctx.camera.turnTo(rat);
		}
	}
    

}
