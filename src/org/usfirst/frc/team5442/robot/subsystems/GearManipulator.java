package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearManipulator extends Subsystem{

	public static Spark arms = RobotMap.gearMotor;
	
	public static void Move(double armSpeed) {
		arms.set(armSpeed);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}



}
