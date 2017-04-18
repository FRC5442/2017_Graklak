package org.usfirst.frc.team5442.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Timer_Command extends Command{

	Timer T007 = new Timer();
	private double m_time;
	
	public Timer_Command(double time){
		m_time = time;
	}
	protected void initialize(){
		T007.reset();
		T007.start();
	}
	@Override
	protected boolean isFinished() {
		if (T007.get() < m_time){
			return false;
		}
		else{
			return true;
		}
	}
	protected void end(){
		T007.stop();
	}

}
