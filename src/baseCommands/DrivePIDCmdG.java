package baseCommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DrivePIDCmdG extends CommandGroup{
	
	public DrivePIDCmdG(){
		addSequential(new DriveStraightCmd(5, .75, 5, 1));
	}
}
