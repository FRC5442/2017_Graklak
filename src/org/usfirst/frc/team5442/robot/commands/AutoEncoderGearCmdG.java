package org.usfirst.frc.team5442.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoEncoderGearCmdG extends CommandGroup{

	public AutoEncoderGearCmdG() {
		addSequential(new Drive_Command(8, .5, .5));
		addSequential(new Drive_Command(1, -.5, .5));
		addSequential(new Drive_Command(1, .5, .5));
		// TODO Auto-generated constructor stub
	}

}
