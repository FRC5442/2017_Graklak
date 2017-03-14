package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Drive_Command;
import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;

import baseCommands.DriveStraightCmd;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Blue2_Red2_Gear extends CommandGroup{

	public Blue2_Red2_Gear() {
		addSequential(new DriveStraightCmd(16, -.6, -.6));
		addSequential(new Gear_Arms_Out(5));
		addSequential(new Drive_Command(5, .6, .6));
	}

}
