package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.Robot;
import org.usfirst.frc.team5442.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Test extends Command{
	
	public Test(){
		
		//requires(Robot.intake);
	}

	
	protected void execute(){
		Intake.Intaking(1, 1);
		//Timer.delay(5);
	}
	
	@Override
	protected boolean isFinished() {
		//TODOAuto-generated method stub
		return false;
	}
	protected void interrupted(){
		Intake.Intaking(0, 0);
	}

	protected void end(){
		Intake.Intaking(0, 0);
	}
	
}
