package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ServoUp extends Command{
	
	protected void execute(){
		Robot.servoBar.move(0,90);
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}


}
