package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;

import baseCommands.DriveStraightCmd;
import baseCommands.Drive_Command;
import baseCommands.Timer_Command;
import baseCommands.TurnToAngleCmd;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Red1_Gear extends CommandGroup{

	public Red1_Gear() {
		addSequential(new DriveStraightCmd(17, -.5, 2));
		addParallel(new TurnToAngleCmd(.3, -55));
		addSequential(new Timer_Command(2));
		addSequential(new Drive_Command(7.5, -.65, -.65));
		addSequential(new Gear_Arms_Out(2));
		addSequential(new Drive_Command(5, .6, .6));
	}

}
