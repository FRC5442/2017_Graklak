package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;
import org.usfirst.frc.team5442.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	
	private static Spark lSparkcontroller1 = RobotMap.dTSparkController1;
	private static Spark lSparkController2 = RobotMap.dTSparkController2;
	private static Spark lSparkController3 = RobotMap.dTSparkController3;
	
	private static Spark rSparkcontroller4 = RobotMap.dTSparkController4;
	private static Spark rSparkController5 = RobotMap.dTSparkController5;
	private static Spark rSparkController6 = RobotMap.dTSparkController6;

	
	public static void LeftSide(double speed){
		lSparkcontroller1.set(speed);
		lSparkController2.set(speed);
		lSparkController3.set(speed);
	}
	
	public static void RightSide(double speed){
		rSparkcontroller4.set(speed);
		rSparkController5.set(speed);
		rSparkController6.set(speed);
	}
	@Override
	protected void initDefaultCommand() {
		new TankDrive();
	}

}
