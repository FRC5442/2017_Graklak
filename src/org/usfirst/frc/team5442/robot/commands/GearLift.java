package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.FloorGearIntake;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class GearLift extends Command{

	double m_speed;
	double m_time;
	Timer t_gear = new Timer();
	
	public GearLift (double speed, double time){
		m_speed = speed;
		m_time = time;
	}
	
	protected void initialize(){
		t_gear.reset();
		t_gear.start();
	}
	
	protected void execute() {
		FloorGearIntake.Lift(m_speed);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return m_time > t_gear.get();
	}

	protected void end() {
		FloorGearIntake.Lift(0);
		t_gear.stop();
	}
	
	protected void interrupted(){
		FloorGearIntake.Lift(0);
		t_gear.stop();
	}
}
