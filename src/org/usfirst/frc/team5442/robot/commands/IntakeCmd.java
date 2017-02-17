package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.RobotMap;
import org.usfirst.frc.team5442.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;

public class IntakeCmd extends Command {
	
	protected void execute(){
		Intake.Intaking(1, 1);
		
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
