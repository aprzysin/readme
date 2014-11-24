import org.powerbot.script.ClientAccessor;
import org.powerbot.script.ClientContext;

@see http://www.powerbot.org/community/topic/1182786-the-rsbot-cookbook-writing-your-first-script-using-tasks/
public abstract class Duty<C extends ClientContext> extends ClientAccessor<C> {
	public Duty(C ctx) {
		super(ctx);
		// TODO Auto-generated constructor stub
	}

	public abstract boolean activate();
	
	public abstract void execute();
}
