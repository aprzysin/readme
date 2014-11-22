import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.GameObject;


public abstract class KillRat extends Task<ClientContext> {
	// gets the api methods for KillRat
	public KillRat(ClientContext ctx) {
        super(ctx);
	}
	@Overide
	// checks for initial conditions to be able kill the rat
	public boolean activate() {
		// checks to see if there is a lvl 1 rat
		return !ctx.objects.select().id(47).isEmpty()
				&&
		// checks to see if my character is doing nothing
		ctx.players.local().animation() == -1;
	}
	@Overide
    public void execute() {
		// declares rat as a GameObject which is also the nearest rat
		GameObject rat = ctx.objects.nearest().poll();
		// locates and attacks a rat
		if(rat.inViewport()) {
		// rat on screen then kill it
			rat.interact("KillRat");
		} else {
			// locate the rat
			ctx.movement.step(rat);
			ctx.camera.turnTo(rat);
		}
	}
    

}
