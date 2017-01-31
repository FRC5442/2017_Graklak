package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeButton extends Command{
	private double m_intake_speed;
	private double m_conveyor_speed;
	
	public IntakeButton(double intake_speed, double conveyor_speed){
		m_intake_speed = intake_speed;
		m_conveyor_speed = conveyor_speed;
	}
	
	protected void execute(){
	Intake.Intaking(m_intake_speed, m_conveyor_speed);	
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end(){
		Intake.Intaking(0, 0);
	}
	
	protected void interrupted(){
		Intake.Intaking(0, 0);
	}
	

}
