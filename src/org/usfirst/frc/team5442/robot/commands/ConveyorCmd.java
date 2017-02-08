package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

public class ConveyorCmd extends Command{
	
	protected void execute(){
		Intake.Intaking(0, .8);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end(){
		Intake.Intaking(0, 0);
	}
	
	protected void interrupted(){
		Intake.Intaking(0, 0);
	}

}
