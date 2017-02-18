package baseCommands;

import org.usfirst.frc.team5442.robot.*;
import edu.wpi.first.wpilibj.command.Command;

public class DriveStraightCmd extends Command{

	double m_distance;
	
	public DriveStraightCmd(double distance){
		m_distance = distance;
	}
	
	protected void initialize(){
		RobotMap.navX.reset();
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
