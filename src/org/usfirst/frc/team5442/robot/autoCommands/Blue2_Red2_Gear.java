package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Drive_Command;
import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;
import org.usfirst.frc.team5442.robot.commands.Timer_Command;

import baseCommands.DriveStraightCmd;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Blue2_Red2_Gear extends CommandGroup{

	public Blue2_Red2_Gear() {
		addSequential(new DriveStraightCmd(15.5, -.3, -.3));
		addSequential(new Timer_Command(.5));
		addSequential(new Gear_Arms_Out(2));
		addSequential(new DriveStraightCmd(5, .3, .3));
	}

}
