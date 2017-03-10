package baseCommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Driveandturnanddrive extends CommandGroup{
	
	public Driveandturnanddrive(){
		addSequential(new DriveStraightCmd(0, .5, 3));
		addSequential(new TurnToAngleCmd(.35, 90));
		addSequential(new DriveStraightCmd(0, .5, 3));
		
	}

}
