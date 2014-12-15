import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt6.*; //RS3
//Skeleton
//For OSRS, change "rt6" to "rt4".

@Script.Manifest(name = "Rat Killer", description = "Kills Rats and gets, drops (burnt food) and eats food")
/**
 * Kills level 1 rats in RSBot and does tasks related to this objective
 * 
 * @author Andrew
 *
 */
public class Main extends PollingScript<ClientContext> {
	// used to list out all the duties used in this bot
	private List<Duty> dutyList = new ArrayList<Duty>();

	/**
	 * Things that run as soon as the script begins.
	 */
	public void start() {
		// tells the program what duties to run at the start of the script
		dutyList.addAll(Arrays.asList(new KillRat(ctx), new BurntDrop(ctx),
				new LumbridgeBank(ctx), new FoodBank(ctx), new LumbridgeRats(
						ctx), new Eater(ctx)));

	}

	@Override
	/**
	 * When logged in, this method keeps the code in it looping and makes execute only run if the activate method is true
	 */
	public void poll() {
		// runs the execute method if the activate method returns true for each
		// individual duty
		for (Duty duty : dutyList) {
			if (duty.activate()) {
				duty.execute();
			}
		}

	}

	@Override
	/**
	 * Things that run when ctx.controller.stop(); is called.
	 */
	public void stop() {
	}

}