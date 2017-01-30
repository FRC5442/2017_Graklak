package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	private static Spark shooterMotor = RobotMap.shooter;
	
	public static void Shooting(double speed){
	shooterMotor.set(speed);	
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
