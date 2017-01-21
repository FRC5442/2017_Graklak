package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class ServoButtonA extends Command {
	
	protected void execute(){
		RobotMap.testServo.setAngle(75);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}
	protected void End() {
	}

}
