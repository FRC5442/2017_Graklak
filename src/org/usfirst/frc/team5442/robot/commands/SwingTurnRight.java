package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.Robot;
import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class SwingTurnRight extends Command {
	private double m_distance;
	private double m_speedL;
	private double m_speedR;
	
	
	public SwingTurnRight(double distance, double speedL, double speedR){
		m_distance = distance;
		m_speedL = speedL;
		m_speedR = speedR;
	}

	@Override
	protected void initialize() {
		Robot.sensors.encoderLeft.reset();
		Robot.sensors.encoderRight.reset();
		// TODO Auto-generated method stub
		
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.driveBase.robotDrive(m_speedL, 0);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		if (RobotMap.EncoderLeft.getDistance() < m_distance){
			return false;
		}
		else{
			return true;
		}
	}
	
	@Override
	protected void end() {
		Robot.driveBase.robotDrive(0, 0);
	}

	@Override
	protected void interrupted() {
		Robot.driveBase.robotDrive(0, 0);
	}

}
