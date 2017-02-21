package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;



public class Sensors extends Subsystem{
	public Encoder encoderLeft = RobotMap.EncoderLeft;
	public Encoder encoderRight = RobotMap.EncoderRight;
	public AnalogInput m_ultra = RobotMap.ultra;
	

	public double getDistance() {
		return m_
				ultra.getVoltage() / (5/512) * 1000;
	}

	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
