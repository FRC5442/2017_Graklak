package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem{

	private static Spark intakeMotor = RobotMap.intake;
	private static Spark conveyorMotor = RobotMap.conveyor;
	
	public static void Intaking(double intake_speed, double conveyor_speed){
		intakeMotor.set(intake_speed);
		conveyorMotor.set(conveyor_speed);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
