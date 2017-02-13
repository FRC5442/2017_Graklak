package org.usfirst.frc.team5442.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import com.kauailabs.navx.frc.*;
import org.usfirst.frc.team5442.robot.*;

public class ZeroYaw extends Command{

	public ZeroYaw(){
		
	}
	
	protected void execute(){
		Robot.NavX.zeroYaw();
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

}
