package baseCommands;



import org.usfirst.frc.team5442.robot.RobotMap;
import org.usfirst.frc.team5442.robot.Robot;
import baseCommands.GyroPID;

import edu.wpi.first.wpilibj.command.Command;

public class TurnToAngleCmd extends Command{

	double m_speed;
	double m_setpoint;

	
	public TurnToAngleCmd(double speed, double setpoint){
		m_speed = speed;
		m_setpoint = setpoint;
	}
	
	protected void initialize(){
		GyroPID.turn_speed = m_speed;
		RobotMap.navX.reset();
		Robot.gyroPID.enable();
		Robot.gyroPID.setSetpoint(m_setpoint);
	}
	
	protected void execute(){
		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		if(Math.abs(Robot.gyroPID.returnPIDInput()) >= Math.abs(Robot.gyroPID.getSetpoint())){
			return true;
		}
		
		else{
			return false;
		}
	}
	
	protected void end(){
		Robot.gyroPID.disable();
		RobotMap.driveTrainRobotDrive.tankDrive(0, 0);
	}
	
	protected void interrupted(){
		Robot.gyroPID.disable();
		RobotMap.driveTrainRobotDrive.tankDrive(0, 0);
	}

}
