package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.FloorGearIntake;

import edu.wpi.first.wpilibj.command.Command;

public class FloorGearRollersOut extends Command{

	protected void execute(){
		FloorGearIntake.floorGearIntaking(.75);
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
