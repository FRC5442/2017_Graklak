package baseCommands;

import org.usfirst.frc.team5442.robot.*;
import edu.wpi.first.wpilibj.command.Command;

public class DriveStraightCmd extends Command{

	double m_distance;
	double m_speed;
	
	public DriveStraightCmd(double distance, double speed){
		m_distance = distance;
		m_speed = speed;

	}
	
	protected void initialize(){
		RobotMap.navX.reset();
		Robot.drivePID.drive_speed = m_speed; 
		Robot.drivePID.enable();
		Robot.drivePID.setSetpoint(0);
	}
	
	protected void execute(){
		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		if(Math.abs(RobotMap.EncoderLeft.getDistance()) < m_distance){
			return true;
		}
		else {
			return false;
		}
	}
	
	protected void end(){
		Robot.drivePID.disable();
		Robot.driveTrain.RobotDrive(0, 0);
	}

}
