package org.usfirst.frc.team5442.robot.commands;


import org.usfirst.frc.team5442.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;

public class ShooterButton extends Command {
	
	protected void execute(){
		Shooter.Shooting(.75);	
		}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	protected void interrupted(){
		Shooter.Shooting(0);
	}
}
