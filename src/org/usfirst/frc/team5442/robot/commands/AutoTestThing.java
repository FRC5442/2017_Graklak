package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.Robot;
import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class AutoTestThing extends Command{
	private double m_distance;
	private double m_speedL;
	private double m_speedR;
	protected void initialize(){
		Robot.sensors.encoderLeft.reset();
		Robot.sensors.encoderRight.reset();
		m_distance = 1;
		m_speedL = -.5;
		m_speedR = -.5;
	}
	protected void execute() {
		Robot.driveBase.robotDrive(m_speedL, m_speedR);
		System.out.println(RobotMap.EncoderLeft.getDistance());
	}
	@Override
	protected boolean isFinished() {
		if(RobotMap.EncoderLeft.getDistance() < m_distance){
			return false;
		}else{
			return true;
		}
	}
	protected void end(){
		Robot.driveBase.robotDrive(0,0);
	}
	protected void interupted(){
		Robot.driveBase.robotDrive(0,0);
	}
}
