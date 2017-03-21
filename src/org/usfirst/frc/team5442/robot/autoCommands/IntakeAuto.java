package org.usfirst.frc.team5442.robot.autoCommands;

import org.usfirst.frc.team5442.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class IntakeAuto extends Command{

	private double m_time;
	private double m_intake_speed;
	private double m_conveyor_speed;
	Timer intakeTimer = new Timer();
	
	public IntakeAuto(double time, double intake_speed, double conveyor_speed){
		m_time = time;
		m_intake_speed = intake_speed;
		m_conveyor_speed = conveyor_speed;
	}
	
	protected void intialize(){
		intakeTimer.start();
	}
	
	protected void execute(){
		Intake.Intaking(m_intake_speed, m_conveyor_speed);
		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		if(m_time <= intakeTimer.get()){
			return false;
		}
		else{
			return true;
		}
	}

	protected void end(){
		Intake.Intaking(0, 0);
	}
	
	protected void interrupted(){
		Intake.Intaking(0, 0);
	}
}
