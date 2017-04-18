package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.*;
import org.usfirst.frc.team5442.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class DriveStraightCmd extends Command{

	double m_distance;
	double m_speed;
	double m_time;
	int m_direction;
	Timer t = new Timer();
	
	public DriveStraightCmd(double distance, double speed, double time, int direction){
		m_distance = distance;
		m_speed = speed;
		m_time = time;
		m_direction = direction;
	}
	
	protected void initialize(){
		RobotMap.EncoderLeft.reset();
		RobotMap.EncoderRight.reset();
		t.reset();
		t.start();
		RobotMap.navX.reset();
		Robot.drivePID.direction = m_direction;
		Robot.drivePID.drive_speed = m_speed; 
		Robot.drivePID.enable();
		Robot.drivePID.setSetpoint(0);
	}
	
	protected void execute(){
		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		if(Math.abs(RobotMap.EncoderLeft.getDistance()) < m_distance){
			return false;
		}
		else {
			return true;
		}
		/**if(t.get() > m_time){
			return true;
		}
		else{
			return false;
		}**/
	}
	
	protected void end(){
		Robot.drivePID.disable();
		DriveTrain.RobotDrive(0, 0);
	}

}
