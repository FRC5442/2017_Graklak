package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.GearManipulator;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Gear_Arms_Out extends Command{

	private Timer T1 = new Timer();
	private double m_time;
	
	public Gear_Arms_Out(double time) {
		m_time = time;// TODO Auto-generated constructor stub
	}
	protected void initialize(){
		T1.reset();
		T1.start();
	}

	protected void execute(){
		GearManipulator.Move(-.5);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		if (T1.get()< m_time){
			return false;
		}
		else{
			return true;
		}
	}

	protected void end(){
		GearManipulator.Move(0);
	}
	
	protected void interrupted(){
		GearManipulator.Move(0);
	}
}
