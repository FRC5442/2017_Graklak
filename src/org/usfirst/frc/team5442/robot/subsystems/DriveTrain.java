package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;
import org.usfirst.frc.team5442.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	//// ALEX PLEASE HELP I DONT KNOW WHAT THIS DOES
	
	private static Spark LeftSparks = RobotMap.dTSparkControllerLeft;
	private static Spark RightSparks = RobotMap.dTSparkControllerRight;
	
	//// Uncomment if 1 speed controller = 1 PWM port
	//private static Spark Spark1 = RobotMap.dtSparkController1;
	//private static Spark Spark2 = RobotMap.dtSparkController2;
	//private static Spark Spark6 = RobotMap.dtSparkController6;
	//private static Spark Spark3 = RobotMap.dtSparkController3;
	//private static Spark Spark4 = RobotMap.dtSparkController4;
	//private static Spark Spark7 = RobotMap.dtSparkController7;
	//private static RobotDrive driveTrain = new RobotDrive(LeftSparks, RightSparks);
	private static RobotDrive driveTrain = RobotMap.driveTrainRobotDrive;
	
	/*
	public static void LeftDrive (double Sparks){
		Spark1.set(Sparks);
		Spark2.set(Sparks);
		Spark6.set(Sparks);
		
	}
	**/
	public static void RobotDrive(double LeftSparks, double RightSparks){
		driveTrain.tankDrive(LeftSparks, RightSparks);
	}
	
	@Override
	protected void initDefaultCommand() {
		//setDefaultCommand(new TankDrive());
		
	}

}
