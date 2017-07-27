package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class PiTable extends Subsystem{

	static NetworkTable piTable = RobotMap.table;
	static double defaultvalue = 0;
	
	public static double getX(){
		double X = piTable.getNumber("course_correction", 0);
		System.out.println(X);
		return X;
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}

}