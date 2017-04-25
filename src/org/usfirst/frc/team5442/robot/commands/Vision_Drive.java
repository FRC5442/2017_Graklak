package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.RobotMap;
import org.usfirst.frc.team5442.robot.subsystems.PiTable;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Command;

public class Vision_Drive extends Command{

	double m_speed;
	double m_distance;
	Encoder EncoderL = RobotMap.EncoderLeft;
	Encoder EncoderR = RobotMap.EncoderRight;
	double course_correction;
	double encoder_left;
	double encoder_right;
	
	public Vision_Drive(double speed, double distance){
		m_speed = speed;
		m_distance = distance;
	}
	
	protected void initialize(){
		EncoderL.reset();
		EncoderR.reset();
	}
	protected void execute(){
		course_correction  = PiTable.getX();
		System.out.print("course_correction = " + course_correction + "Encoders: L(" + EncoderL.getDistance() + ") R(" + EncoderR.getDistance() + ")");
		RobotMap.driveTrainRobotDrive.drive(m_speed, -course_correction);
		
	}
	
	@Override
	protected boolean isFinished() {
		return (EncoderL.getStopped() && EncoderR.getStopped());
	}
	
	protected void end(){
		RobotMap.driveTrainRobotDrive.tankDrive(0, 0);
	}

}
