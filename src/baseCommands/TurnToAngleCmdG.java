package baseCommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TurnToAngleCmdG extends CommandGroup{
	
	public TurnToAngleCmdG(){
		addSequential(new TurnToAngleCmd(0.25, -90.0));
	}

}
