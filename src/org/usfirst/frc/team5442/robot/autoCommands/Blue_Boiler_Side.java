package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;

import baseCommands.DriveStraightCmd;
import baseCommands.Timer_Command;
import baseCommands.TurnToAngleCmd;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Blue_Boiler_Side extends CommandGroup{

	public Blue_Boiler_Side() {
	  //addSequential(new DriveStraightCmd(Distance, Speed, Time) Time doesnt matter
		addSequential(new DriveStraightCmd(20, -.4, 2, -1));
		addParallel(new TurnToAngleCmd(.425, 51));
		addSequential(new Timer_Command(2));
		addSequential(new DriveStraightCmd(3.5, -.275, -.4, -1));
		addSequential(new Gear_Arms_Out(1.5));
		addSequential(new DriveStraightCmd(5, .4, .4, 1));
	}

}
