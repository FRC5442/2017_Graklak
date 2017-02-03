package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.GearManipulator;

import edu.wpi.first.wpilibj.command.Command;

public class Gear_Arms_In extends Command{

	private double ArmSpeed;
	
	public Gear_Arms_In(double speed) {
		ArmSpeed = speed;
	}
	
	protected void execute(){
		GearManipulator.Move(ArmSpeed);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end(){
		GearManipulator.Move(0);
	}
	
	protected void interrupted(){
		GearManipulator.Move(0);
	}
}
