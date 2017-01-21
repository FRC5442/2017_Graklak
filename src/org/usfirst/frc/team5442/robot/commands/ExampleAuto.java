package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class ExampleAuto extends Command {
	boolean isDone = false;
	public ExampleAuto() {
		requires(Robot.driveBase);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		
	}

	protected void execute(){
		int seconds = 5;
		System.out.println("Tried to run motors for " + seconds);
		Robot.driveBase.robotDrive(0.5, 0.5);
		Timer.delay(seconds);
		isDone = true;
	}

	@Override
	protected boolean isFinished() {
		return isDone;
	}
	protected void End() {
	}

}
