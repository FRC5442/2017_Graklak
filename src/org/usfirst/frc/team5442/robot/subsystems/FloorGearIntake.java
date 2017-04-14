package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class FloorGearIntake extends Subsystem{

	private static Spark floorGearIntakeMotor = RobotMap.floorGearIntake;
	private static Spark Raise = RobotMap.gearIntakeLiftMotor;
	
	public static void floorGearIntaking(double gearIntake_speed){
		floorGearIntakeMotor.set(gearIntake_speed);
	}
	
	public static void Lift(double lift_speed){
		Raise.set(lift_speed);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
}
