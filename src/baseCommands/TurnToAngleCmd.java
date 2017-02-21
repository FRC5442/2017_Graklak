package baseCommands;



import org.usfirst.frc.team5442.robot.RobotMap;
import org.usfirst.frc.team5442.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class TurnToAngleCmd extends Command{

	double m_speed;
	double m_setpoint;

	
	public TurnToAngleCmd(double speed, double setpoint){
		m_speed = speed;
		m_setpoint = setpoint;
	}
	
	protected void initialize(){
		RobotMap.navX.reset();
		Robot.gyroPID.enable();
		Robot.gyroPID.setSetpoint(m_setpoint);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		if(Math.abs(Robot.gyroPID.returnPIDInput()) < 6){
			return true;
		}
		
		else{
			return false;
		}
	}

}
