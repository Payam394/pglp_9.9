package actions;
import java.util.ArrayList;

public class ActionExecuteur {
	
	private final ArrayList<Command> AllCommands = new ArrayList<Command>();
	
	public void executeCommand(Command cmd) {
		AllCommands.add(cmd);
        cmd.execute();
    }

}
