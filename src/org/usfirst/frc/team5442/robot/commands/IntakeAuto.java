package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class IntakeAuto extends Command{

	private double m_time;
	private double m_speed;
	Timer intakeTimer = new Timer();
	
	public IntakeAuto(double time, double speed){
		m_time = time;
		m_speed = speed;
	}
	
	protected void intialize(){
		intakeTimer.start();
	}
	
	protected void execute(){
		Intake.Intaking(m_speed);
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
		Intake.Intaking(0);
	}
}
