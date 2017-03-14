package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class ShootAuto extends Command{
	
	private double m_time;
	private Timer T4818 = new Timer();
	
	
	
	public ShootAuto(double time){
		m_time = time;
	}
	
	
	protected void initialize(){
		T4818.reset();
		T4818.start();
	}
	protected void execute(){
		Intake.Intaking(-1, -1);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return m_time < T4818.get();
	}
	
	protected void end(){
		Intake.Intaking(0, 0);
	}
	
	protected void interrupted(){
		Intake.Intaking(0, 0);
	}

}