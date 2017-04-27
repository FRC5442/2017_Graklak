package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.OI;

import edu.wpi.first.wpilibj.command.Subsystem;

public class JoystickScaler extends Subsystem{
	
	public static double Scale(int axisNumber){
		double value = OI.xboxController1.getRawAxis(axisNumber);
		if (value >=.9){
			value = 1;
		}
		return value;
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	

}
