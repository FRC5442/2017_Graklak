package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;

import baseCommands.DriveStraightCmd;
import baseCommands.Timer_Command;
import baseCommands.TurnToAngleCmd;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Blue_Loading_Station extends CommandGroup{

	public Blue_Loading_Station() {
		addSequential(new DriveStraightCmd(20.25, -.4, 2, -1));
		addParallel(new TurnToAngleCmd(.425, -51));
		addSequential(new Timer_Command(2));
		addSequential(new DriveStraightCmd(3.5, -.275, -.4, -1));
		addSequential(new Gear_Arms_Out(1.5));
		addSequential(new DriveStraightCmd(5, .4, .4, 1));
	}
}