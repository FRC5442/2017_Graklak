package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;

import baseCommands.DriveStraightCmd;
import baseCommands.Drive_Command;
import baseCommands.Timer_Command;
import baseCommands.TurnToAngleCmd;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Blue3_Gear extends CommandGroup{

	public Blue3_Gear() {
		addSequential(new DriveStraightCmd(19.5, -.4, 2));
		addParallel(new TurnToAngleCmd(.3, -51));
		addSequential(new Timer_Command(2));
		addSequential(new DriveStraightCmd(3.75, -.35, -.4));
		addSequential(new Gear_Arms_Out(2));
		addSequential(new Drive_Command(5, .4, .4));
	}
}