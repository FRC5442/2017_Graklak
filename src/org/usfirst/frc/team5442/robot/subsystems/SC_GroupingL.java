package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SC_GroupingL extends Subsystem{
	private double m_speedL;
	
	public SC_GroupingL(double speed){
		m_speedL = speed;
	}
	
	protected void initialize(){
		
	}

	protected void execute(){
		RobotMap.dTSparkController1.set(m_speedL);
		RobotMap.dTSparkController2.set(m_speedL);
		RobotMap.dTSparkController3.set(m_speedL);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
