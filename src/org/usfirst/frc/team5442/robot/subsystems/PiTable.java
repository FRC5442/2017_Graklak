package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class PiTable extends Subsystem{

	NetworkTable piTable = RobotMap.table;
	double[] defaultvalue = new double[0];
	
	public double[] getX(){
		double[] X = piTable.getNumberArray("x_correction", defaultvalue);
		return X;
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
