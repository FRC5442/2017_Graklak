// Tank Drive
// On this page
// Joystick Ports
//

package org.usfirst.frc.team5442.robot.commands;

import org.usfirst.frc.team5442.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class  TankDrive extends Command {

    public TankDrive() {
    	//requires(Robot.driveBase);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	new SC_GroupingL(OI.xboxController1.getRawAxis(1));
    	new SC_GroupingR(OI.xboxController1.getRawAxis(5));
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
