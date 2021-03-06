// Tank Drive
// On this page
// Joystick Ports
//

package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.OI;
import org.usfirst.frc.team5442.robot.Robot;
import org.usfirst.frc.team5442.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5442.robot.subsystems.JoystickScaler;

import edu.wpi.first.wpilibj.command.Command;


 
public class  TankDrive extends Command {

    public TankDrive() {
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//if (OI.xboxController1.get)
    	
    	//DriveTrain.RobotDrive(-1*(JoystickScaler.Scale(1)), -1*(JoystickScaler.Scale(5)));
    	DriveTrain.RobotDrive(-1*(OI.xboxController1.getRawAxis(1)), -1*(OI.xboxController1.getRawAxis(5)));
    	//DriveTrain.RobotDrive(1,1);
    	//DriveTrain.LeftDrive(OI.xboxController1.getRawAxis(1));
  
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
