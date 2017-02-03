package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;
import org.usfirst.frc.team5442.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	
	
	private static Spark LeftSparks = RobotMap.dTSparkControllerLeft;
	private static Spark RightSparks = RobotMap.dTSparkControllerRight;
	private static RobotDrive driveTrain = new RobotDrive(LeftSparks , RightSparks);
	
	public static void RobotDrive(double LeftSparks, double RightSparks){
		driveTrain.tankDrive(LeftSparks, RightSparks);
	}
	
	@Override
	protected void initDefaultCommand() {
		new TankDrive();
	}

}
