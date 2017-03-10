package org.usfirst.frc.team5442.robt.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Drive_Command;
import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Red2 extends CommandGroup{

	public Red2() {
		addSequential(new Drive_Command(20, -.6, -.6));
		addSequential(new Gear_Arms_Out());
	}

}
