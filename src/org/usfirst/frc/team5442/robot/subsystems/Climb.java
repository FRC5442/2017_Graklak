package org.usfirst.frc.team5442.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5442.robot.RobotMap;
import edu.wpi.first.wpilibj.Spark;

public class Climb extends Subsystem{
	public static Spark climbMotor0 = RobotMap.climbSparkController0;
	
	public static void Climb(double speed){
		climbMotor0.setSpeed(speed);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
