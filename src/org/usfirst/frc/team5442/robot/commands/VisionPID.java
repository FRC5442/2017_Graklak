package org.usfirst.frc.team5442.robot.commands;

import java.awt.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class VisionPID extends Command{
	
	private double m_angle; 
	
	public VisionPID(double angle){
		m_angle = angle;
	}
	
	protected void initialize(){
		//Robot.NavX.enable();
		//NavX.setSetpoint(use angle);
	}
	
	protected void execute(){
		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end(){
		
	}

	protected void interrupted(){
		
	}
}
