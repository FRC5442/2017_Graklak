package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;

import baseCommands.DriveStraightCmd;
import baseCommands.Timer_Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Blue2_Red2_Gear extends CommandGroup{

	public Blue2_Red2_Gear() {
		addSequential(new DriveStraightCmd(16.5, -.3, -.3));
		addSequential(new Timer_Command(.5));
		addSequential(new Gear_Arms_Out(2));
		addSequential(new DriveStraightCmd(5, .3, .3));
	}

}
