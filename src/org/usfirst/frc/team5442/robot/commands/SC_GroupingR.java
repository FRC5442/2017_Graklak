package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class SC_GroupingR extends Command{
	// Creates constant for speed
	private double m_speedR;
	
	public SC_GroupingR(double speed){
		m_speedR = speed;
	}
	
	protected void initailize(){
		
	}
	
	protected void execute(){
		RobotMap.dTSparkController4.set(m_speedR);
		RobotMap.dTSparkController5.set(m_speedR);
		RobotMap.dTSparkController6.set(m_speedR);
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
