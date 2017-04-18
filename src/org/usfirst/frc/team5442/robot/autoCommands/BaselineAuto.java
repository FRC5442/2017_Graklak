package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.DriveStraightCmd;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class BaselineAuto extends CommandGroup{

	public BaselineAuto() {
		addSequential(new DriveStraightCmd(14, -.4, -.4, -1));
	}
}
