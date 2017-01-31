package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.Robot;
import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class PointTurn extends Command{

	private double m_distance;
	private double m_speedL;
	private double m_speedR;
	
	
	public PointTurn(double distance, double speedL, double speedR){
		m_distance = distance;
		m_speedL = speedL;
		m_speedR = speedR;
	}
	
	@Override
	protected void initialize() {
		Robot.sensors.encoderLeft.reset();
		Robot.sensors.encoderRight.reset();
	}
	
	@Override
	protected void execute() {
		Robot.driveBase.robotDrive(m_speedL, m_speedR);
	}
	
	@Override
	protected boolean isFinished() {
		if (RobotMap.EncoderLeft.getDistance() < java.lang.Math.abs(m_distance)) {
			return false;
		}
		else {
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
