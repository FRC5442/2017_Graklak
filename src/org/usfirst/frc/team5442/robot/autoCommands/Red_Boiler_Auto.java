package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Drive_Command;
import org.usfirst.frc.team5442.robot.commands.ShootAuto;
import org.usfirst.frc.team5442.robot.commands.Timer_Command;

import baseCommands.DriveStraightCmd;
import baseCommands.TurnToAngleCmd;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Red_Boiler_Auto extends CommandGroup{

	public Red_Boiler_Auto(){
		addSequential(new DriveStraightCmd(9, -.5, 2));
		addSequential(new TurnToAngleCmd(.3, -45));
		addSequential(new Timer_Command(.5));
		addSequential(new Drive_Command(13, .65, .65));
		addSequential(new ShootAuto(10));
		
	}
	
}
