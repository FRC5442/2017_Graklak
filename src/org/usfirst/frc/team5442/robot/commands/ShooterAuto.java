package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.Intake;
import org.usfirst.frc.team5442.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class ShooterAuto extends Command {
	private double m_speed;
	private double m_time;
	Timer shootTimer = new Timer();
	
	public ShooterAuto(double speed, double time){
		m_speed = speed;
		m_time = time;
	}
	protected void intialize(){
		shootTimer.start();
	}
	protected void execute(){
		Shooter.Shooting(m_speed);
	}
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		if(m_time <= shootTimer.get()){
			return false;
		}else{
			return true;
		}	
	}
	protected void end(){
		Shooter.Shooting(0);
	}
}
