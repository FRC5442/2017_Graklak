package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Turn_Left extends Command {
	boolean isDone = false;
	public Turn_Left() {
		requires(Robot.driveBase);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		
	}

	protected void execute(){
		Robot.driveBase.robotDrive(0.5, 0.5);
		Timer.delay(3);
		Robot.driveBase.robotDrive(0.5, 0);
		Timer.delay(1.5);
		Robot.driveBase.robotDrive(0.5, 0.5);
		Timer.delay(3);
		isDone = true;
	}

	@Override
	protected boolean isFinished() {
		return isDone;
	}
	protected void End() {
	}

}
