package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ServoBar extends Subsystem{
	
	public static Servo servoL = RobotMap.servoLeft;
	public static Servo servoR = RobotMap.servoRight;
	

	public void move(double angleL, double angleR){
		RobotMap.servoLeft.setAngle(angleL);
		RobotMap.servoRight.setAngle(angleR);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
