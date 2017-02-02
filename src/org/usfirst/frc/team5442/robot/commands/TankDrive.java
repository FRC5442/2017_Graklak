// Tank Drive
// On this page
// Joystick Ports
//
/**
package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.OI;
import org.usfirst.frc.team5442.robot.Robot;
import org.usfirst.frc.team5442.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 
public class  TankDrive extends Command {

    public TankDrive() {
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//DriveTrain.LeftSide(OI.xboxController1.getRawAxis(1));
    	//DriveTrain.RightSide(OI.xboxController1.getRawAxis(5));
    	DriveTrain.LeftSide(.5);
    	DriveTrain.RightSide(.5);
    
    }
    
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
**/