package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.DriveStraightCmd;
import org.usfirst.frc.team5442.robot.commands.TurnToAngleCmd;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Driveandturnanddrive extends CommandGroup{
	
	public Driveandturnanddrive(){
		addSequential(new DriveStraightCmd(5, .5, 3, 1));
		addSequential(new TurnToAngleCmd(.35, 90));
		addSequential(new DriveStraightCmd(5, .5, 3, 1	));
		
	}

}
