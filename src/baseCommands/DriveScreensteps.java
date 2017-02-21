package baseCommands;

import org.usfirst.frc.team5442.robot.RobotMap;
import org.usfirst.frc.team5442.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

public class DriveScreensteps extends Command{

	double Kp = 3;
	double angle = RobotMap.navX.getAngle();
	
	protected void initialize(){
		RobotMap.navX.reset();
	}
	
	protected void execute(){
		RobotMap.driveTrainRobotDrive.drive(-1, (-angle*Kp));
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end(){
		
	}

}
