package org.usfirst.frc.team5442.robt.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Drive_Command;
import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;
import org.usfirst.frc.team5442.robot.commands.Timer_Command;

import baseCommands.TurnToAngleCmd;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Red1_Gear extends CommandGroup{

	public Red1_Gear() {
		addSequential(new Drive_Command(15, -.7, -.7));
		addParallel(new Timer_Command(3));
		addSequential(new TurnToAngleCmd(.5, 60));
		addSequential(new Drive_Command(5, -.65, -.65));
		addSequential(new Gear_Arms_Out(5));
		addSequential(new Drive_Command(5, .6, .6));
	}

}
