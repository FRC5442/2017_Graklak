package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.OI;
import org.usfirst.frc.team5442.robot.subsystems.Climb;

import edu.wpi.first.wpilibj.command.Command;

public class ClimbUp extends Command{

	public ClimbUp() {
		// TODO Auto-generated constructor stub
	}

	protected void execute(){
		Climb.Climbing(OI.xboxController2.getRawAxis(0));
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end(){
		Climb.Climbing(0);
	}
	protected void interrupted(){
		Climb.Climbing(0);
	}
}
