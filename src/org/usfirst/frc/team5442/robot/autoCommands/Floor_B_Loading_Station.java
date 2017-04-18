package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.GearLift;
import baseCommands.DriveStraightCmd;
import baseCommands.Timer_Command;
import baseCommands.TurnToAngleCmd;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Floor_B_Loading_Station extends CommandGroup{
	
	public Floor_B_Loading_Station(){
		//drive forward
		addSequential(new DriveStraightCmd(20, .4, 2, 1));
		//turn
		addParallel(new TurnToAngleCmd(.425, -51));
		//keeps it from going too early
		addSequential(new Timer_Command(2));
		//lift gear as you drive
		addParallel(new GearLift(.5, 1));
		//drive forward
		addSequential(new DriveStraightCmd(3.5, .275, -.4, 1));
		//backward
		addSequential(new DriveStraightCmd(5, -.4, -.4, -1));
	}

}
