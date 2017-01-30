package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeButton extends Command{
	
	
	protected void execute(){
	Intake.Intaking(.75);	
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void interrupted(){
		Intake.Intaking(0);
	}
	

}
