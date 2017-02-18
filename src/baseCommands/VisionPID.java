package baseCommands;

import org.usfirst.frc.team5442.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class VisionPID extends PIDSubsystem{

	Spark sparkLeft = RobotMap.dTSparkControllerLeft;
	Spark sparkRight = RobotMap.dTSparkControllerRight;
	
	public VisionPID() {
		super("Vision PID", .1, 0, 0);
		setAbsoluteTolerance(3.0);
		getPIDController().setOutputRange(-1, 1);
		LiveWindow.addActuator("Vision PID", "Vision", getPIDController());
	}

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void usePIDOutput(double output) {
		sparkLeft.pidWrite(output);
		sparkRight.pidWrite(output);
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
