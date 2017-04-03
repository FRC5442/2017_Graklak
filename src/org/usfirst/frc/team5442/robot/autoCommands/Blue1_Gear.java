package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Drive_Command;
import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;
import org.usfirst.frc.team5442.robot.commands.Timer_Command;
import baseCommands.DriveStraightCmd;
import baseCommands.TurnToAngleCmd;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Blue1_Gear extends CommandGroup{

	public Blue1_Gear() {
		addSequential(new DriveStraightCmd(17.25, -.4, 2));
		addParallel(new TurnToAngleCmd(.3, 50));
		addSequential(new Timer_Command(2));
		addSequential(new DriveStraightCmd(5.75, -.35, -.65));
		addSequential(new Gear_Arms_Out(4));
		addSequential(new Drive_Command(5, .4, .4));
	}

}
