	// Skeleton
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt6.*; //RS3
//For OSRS, change "rt6" to "rt4".




@Script.Manifest(name="Rat Killer", description="Kills Rats and gets and eats food")
public class Main extends PollingScript<ClientContext> {
	private List<Duty> dutyList = new ArrayList<Duty>();
	//Things that run as soon as the script begins.
public void start() {
	dutyList.addAll(Arrays.asList(new KillRat(ctx), new BurntDrop(ctx), new LumbridgeBank(ctx)));
	
}
@Override
public void poll() {
	for (Duty duty : dutyList) {
        if (duty.activate()) {
            duty.execute();
        }
    }
	
	}


@Override
public void stop() {
//Things that run when ctx.controller.stop(); is called.
}

}