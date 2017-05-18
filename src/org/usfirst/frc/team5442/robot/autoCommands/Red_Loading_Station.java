package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.DriveStraightCmd;
import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;
import org.usfirst.frc.team5442.robot.commands.Timer_Command;
import org.usfirst.frc.team5442.robot.commands.TurnToAngleCmd;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Red_Loading_Station extends CommandGroup{

	public Red_Loading_Station() {
		addSequential(new DriveStraightCmd(20, -.4, 2, -1));
		addParallel(new TurnToAngleCmd(.425, 51));
		addSequential(new Timer_Command(2));
		addSequential(new DriveStraightCmd(4, -.275, -.4, -1));
		addSequential(new Gear_Arms_Out(1));
		addSequential(new DriveStraightCmd(5, .4, .4, 1));
		//new stuff
		//addParallel(new TurnToAngleCmd(.425, -51));
		//addSequential(new Timer_Command(2));
		//addSequential(new DriveStraightCmd(10, -4, 2, -1));
	}
}
