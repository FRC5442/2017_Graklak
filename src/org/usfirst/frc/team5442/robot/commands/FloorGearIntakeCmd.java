package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.FloorGearIntake;
import org.usfirst.frc.team5442.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

public class FloorGearIntakeCmd extends Command {

	protected void execute(){
		FloorGearIntake.floorGearIntaking(.5);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end(){
		FloorGearIntake.floorGearIntaking(0);
	}
	protected void interrupted(){
		FloorGearIntake.floorGearIntaking(0);
	}
	
}
