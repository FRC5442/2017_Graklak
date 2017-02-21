package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.Robot;
import org.usfirst.frc.team5442.robot.RobotMap;
import org.usfirst.frc.team5442.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

public class Drive_Command extends Command {
	private double m_distance;
	private double m_speedL;
	private double m_speedR;
	
	
	public Drive_Command(double distance, double speedL, double speedR){
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
		DriveTrain.RobotDrive(m_speedL, m_speedR);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		if (Math.abs(RobotMap.EncoderLeft.getDistance()) < m_distance){
			return false;
		}
		else{
			return true;
		}
	}
	
	@Override
	protected void end() {
		DriveTrain.RobotDrive(0,0);
	}

	@Override
	protected void interrupted() {
		DriveTrain.RobotDrive(0,0);
	}

}
