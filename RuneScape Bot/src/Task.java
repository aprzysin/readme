import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;

// @see http://www.powerbot.org/community/topic/1182786-the-rsbot-cookbook-writing-your-first-script-using-tasks/
// Organizes and runs the tasks
public abstract class Task extends ClientAccessor {
	// gets the api methods for Task
	public Task(ClientContext ctx) {
        super(ctx);
    }
	
	// any class extended from Task needs an activate and execute method
	// checks to see if conditions are right to execute the execute method
	public abstract boolean activate();
	// what happens if the activate check is good
    public abstract void execute();

}
