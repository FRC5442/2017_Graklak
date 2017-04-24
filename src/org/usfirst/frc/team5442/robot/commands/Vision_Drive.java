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
	
	public Vision_Drive(double speed, double distance){
		m_speed = speed;
		m_distance = distance;
	}
	
	protected void initialize(){
		EncoderL.reset();
		EncoderR.reset();
	}
	protected void execute(){
		double myx = PiTable.getX();
		RobotMap.driveTrainRobotDrive.drive(m_speed, myx);
	}
	
	@Override
	protected boolean isFinished() {
		return EncoderL.getStopped() && EncoderR.getStopped();
	}
	
	protected void end(){
		RobotMap.driveTrainRobotDrive.tankDrive(0, 0);
	}

}
