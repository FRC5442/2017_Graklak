package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.GearManipulator;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Gear_Arms_Out extends Command{

	private Timer T1 = new Timer();
	private double m_time;
	
	public Gear_Arms_Out(double time) {
		m_time = time;
	}
	protected void initialize(){
		T1.reset();
		T1.start();
	}

	protected void execute(){
		GearManipulator.Move(.5);
	}

	@Override
	protected boolean isFinished() {
		return m_time < T1.get();
	}

	protected void end(){
		GearManipulator.Move(0);
	}
	
	protected void interrupted(){
		GearManipulator.Move(0);
	}
}
