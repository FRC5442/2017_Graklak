package org.usfirst.frc.team5442.robt.autoCommands;

import org.usfirst.frc.team5442.robot.commands.Drive_Command;
import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Blue3_Gear extends CommandGroup{

	public Blue3_Gear() {
		addSequential(new Drive_Command(15/*?*/, -.6, -.6));
		//turn to angle (vision?)
		//Drive to airship
		addSequential(new Gear_Arms_Out(5));
		addSequential(new Drive_Command(5, .6, .6));
	}

}
