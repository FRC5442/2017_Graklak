package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class NavX extends PIDSubsystem{

	Spark sparkLeft = RobotMap.dTSparkControllerLeft;
	Spark sparkRight = RobotMap.dTSparkControllerRight;
	
	
	public NavX() {
		super("VisionCorrection", .1, 0, 0);
		setAbsoluteTolerance(3.0);
		getPIDController().setOutputRange(-1, 1);
		LiveWindow.addActuator("NavX", "VisionCorrection", getPIDController());
	}

	@Override
	protected double returnPIDInput() {
		// this will be the input angle from vision
		return 0;
	}

	@Override
	protected void usePIDOutput(double output) {
		sparkLeft.pidWrite(output);
		sparkRight.pidWrite(output);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
}