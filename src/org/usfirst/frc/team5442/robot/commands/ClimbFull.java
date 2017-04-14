package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.Climb;

import edu.wpi.first.wpilibj.command.Command;

public class ClimbFull extends Command{

	protected void initialize(){
		
	}
	
	protected void execute(){
		Climb.Climbing(-1);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end(){
		Climb.Climbing(0);
	}
	

}
