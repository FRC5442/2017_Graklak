package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Drive_Command;
import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;
import org.usfirst.frc.team5442.robot.commands.Timer_Command;

import baseCommands.DriveStraightCmd;
import baseCommands.TurnToAngleCmd;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Blue3_Gear extends CommandGroup{

	public Blue3_Gear() {
		addSequential(new DriveStraightCmd(17, -.6, 2));
		addParallel(new TurnToAngleCmd(.6, -57));
		addSequential(new Timer_Command(4));
		addSequential(new Drive_Command(7.5, -.65, -.65));
		addSequential(new Gear_Arms_Out(4));
		addSequential(new Drive_Command(5, .6, .6));
	}
}
