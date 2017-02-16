package org.usfirst.frc.team5442.robot.subsystems;

import org.usfirst.frc.team5442.robot.commands.DriveStraightCmd;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;

/**
 *
 */
public class DriveStraightTest extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Gyro gyro;
	RobotDrive driveTest = new RobotDrive(1, 2, 3, 4);
	
	double angle = gyro.getAngle();
	
	public void driveStraight(speed1, speed2) {
		driveTest.tankDrive(speed1, -angle * speed2);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new DriveStraightCmd());
    }
}

