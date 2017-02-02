package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Test extends Command{

	
	protected void execute(){
		Intake.Intaking(1, 1);
		Timer.delay(5);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	protected void end(){
		Intake.Intaking(0, 0);
	}
	
}
