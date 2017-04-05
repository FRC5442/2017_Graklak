package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.FloorGearIntake;

import edu.wpi.first.wpilibj.command.Command;

public class GearLiftUp extends Command{

	protected void execute() {
		FloorGearIntake.Lift(0.5);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		FloorGearIntake.Lift(0);
	}
	
	protected void interrupted(){
		FloorGearIntake.Lift(0);
	}
}
