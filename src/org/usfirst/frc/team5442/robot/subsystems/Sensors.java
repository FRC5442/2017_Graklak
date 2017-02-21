package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Ultrasonic;



public class Sensors extends Subsystem{
	public Encoder encoderLeft = RobotMap.EncoderLeft;
	public Encoder encoderRight = RobotMap.EncoderRight;
	public Ultrasonic ultra  = RobotMap.ultra; 
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
