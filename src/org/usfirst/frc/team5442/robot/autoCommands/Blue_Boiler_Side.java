package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;

import baseCommands.DriveStraightCmd;
import baseCommands.Drive_Command;
import baseCommands.Timer_Command;
import baseCommands.TurnToAngleCmd;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Blue_Boiler_Side extends CommandGroup{

	public Blue_Boiler_Side() {
		addSequential(new DriveStraightCmd(20, -.4, 2));
		addParallel(new TurnToAngleCmd(.425, 51));
		addSequential(new Timer_Command(2));
		addSequential(new DriveStraightCmd(3.5, -.275, -.4));
		addSequential(new Gear_Arms_Out(2));
		addSequential(new DriveStraightCmd(5, .4, .4));
	}

}
