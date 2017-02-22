package baseCommands;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class GyroPID extends PIDSubsystem{
	Spark sparkLeft = RobotMap.dTSparkControllerLeft;
	Spark sparkRight = RobotMap.dTSparkControllerRight;
	
	public static double turn_speed;
	
	public GyroPID() {
		super("Gyro PID", .5, 15, 0.1);
		setAbsoluteTolerance(1.0);
		getPIDController().setOutputRange(-1, 1);
		LiveWindow.addActuator("Gyro PID", "Gyro", getPIDController());
	}

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return RobotMap.navX.getAngle();
	}

	@Override
	protected void usePIDOutput(double output) {
		RobotMap.driveTrainRobotDrive.drive(turn_speed, output);
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
