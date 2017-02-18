package baseCommands;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DrivePID extends PIDSubsystem{
	
	public double drive_speed;

	public DrivePID() {
		super("DriveStraight", .1, 0, 0);
		setAbsoluteTolerance(1.0);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return RobotMap.navX.getAngle();
	}

	@Override
	protected void usePIDOutput(double output) {
		RobotMap.driveTrainRobotDrive.drive(.75, output);	
		SmartDashboard.putNumber("PID Output", output);
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
