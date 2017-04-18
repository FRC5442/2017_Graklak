
package org.usfirst.frc.team5442.robot;

import org.usfirst.frc.team5442.robot.autoCommands.BaselineAuto;
import org.usfirst.frc.team5442.robot.autoCommands.Blue_Boiler_Side;
import org.usfirst.frc.team5442.robot.autoCommands.Middle_Gear;
import org.usfirst.frc.team5442.robot.autoCommands.Blue_Loading_Station;
import org.usfirst.frc.team5442.robot.autoCommands.Floor_B_Boiler_Gear;
import org.usfirst.frc.team5442.robot.autoCommands.Floor_B_Loading_Station;
import org.usfirst.frc.team5442.robot.autoCommands.Floor_R_Boiler_Gear;
import org.usfirst.frc.team5442.robot.autoCommands.Floor_R_Loading_Station;
import org.usfirst.frc.team5442.robot.autoCommands.NoAuto;
import org.usfirst.frc.team5442.robot.autoCommands.Red_Boiler_Side;
import org.usfirst.frc.team5442.robot.autoCommands.Red_Loading_Station;
import org.usfirst.frc.team5442.robot.subsystems.Climb;
import org.usfirst.frc.team5442.robot.subsystems.DrivePID;
import org.usfirst.frc.team5442.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5442.robot.subsystems.GearManipulator;
import org.usfirst.frc.team5442.robot.subsystems.GyroPID;
//import org.usfirst.frc.team5442.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5442.robot.subsystems.Intake;
//import org.usfirst.frc.team5442.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5442.robot.subsystems.Sensors;
import org.usfirst.frc.team5442.robot.subsystems.ServoBar;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	public static Sensors sensors;
	public static DriveTrain driveTrain;
	public static Intake intake;
	public static GearManipulator gearManipulator;
	public static Climb climb;
	public static DrivePID drivePID;
	public static GyroPID gyroPID;
	public static ServoBar servoBar;
	
	
	
	
	Command autonomousCommand;
	SendableChooser<Command> autoChooser;


	//public static CameraServer server;
    int session;
    Image frame;
    NIVision.Rect rect;
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		RobotMap.init();
		oi = new OI();
		sensors = new Sensors();
		//driveTrain = new DriveTrain();
		//driveTrain.setExpiration(0.1);
		intake = new Intake();
		gearManipulator = new GearManipulator();
		climb = new Climb();
		//cameras.init();
		drivePID = new DrivePID();
		drivePID.disable();
		gyroPID = new GyroPID();
		gyroPID.disable();
		RobotMap.navX.reset();
		servoBar = new ServoBar();
		servoBar.move(0, 90);
		autoChooser = new SendableChooser<Command>();
		//autoChooser.addObject("DrivePID", new DrivePIDCmdG());
		//autoChooser.addObject("Turn90deg", new TurnToAngleCmdG());
		//autoChooser.addObject("Driveandturnanddrive", new Driveandturnanddrive());
		autoChooser.addObject("Middle Gear", new Middle_Gear());
		autoChooser.addObject("Red Boiler Gear", new Red_Boiler_Side());
		autoChooser.addObject("Red Loading Station Gear", new Red_Loading_Station());
		autoChooser.addObject("Blue Boiler Gear", new Blue_Boiler_Side());
		autoChooser.addObject("Blue Loading Station Gear", new Blue_Loading_Station());
		autoChooser.addObject("Floor Blue Boiler Gear", new Floor_B_Boiler_Gear());
		autoChooser.addObject("Floor Blue Loading Station", new Floor_B_Loading_Station());
		autoChooser.addObject("Floor Red Boiler Gear", new Floor_R_Boiler_Gear());
		autoChooser.addObject("Floor Red Loading Station", new Floor_R_Loading_Station());
		autoChooser.addObject("Baseline Auto", new BaselineAuto());
		autoChooser.addDefault("No Auto", new NoAuto());
		SmartDashboard.putData("Autonomous Mode Chooser", autoChooser);
		//SmartDashboard.putData("Auto mode", autoChooser);

		/*
		CameraServer server2;
        
        server = CameraServer.getInstance();
        if (CameraServer.getInstance() == null) {
        	
        } else {
        	server = CameraServer.getInstance();
        	server.setQuality(25);
            server.startAutomaticCapture("cam2");
        	server2 = CameraServer.getInstance();
        	server2.setQuality(25);
            server2.startAutomaticCapture("cam1");
            }
          */  
		
	}
	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		autonomousCommand = autoChooser.getSelected();
		RobotMap.EncoderLeft.reset();
		RobotMap.EncoderRight.reset();
		//RobotMap.driveTrainRobotDrive.setSafetyEnabled(false);
		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		if (autonomousCommand != null) 
			autonomousCommand.start();

        //autonomousCommand = (Command) autoChooser.getSelected();
        //autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		SmartDashboard.getNumber("EncoderLeft", RobotMap.EncoderLeft.getDistance());
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null){
			autonomousCommand.cancel();}
		driveTrain = new DriveTrain();
		
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		SmartDashboard.putNumber("PDP Voltage", RobotMap.pdp.getVoltage());
		SmartDashboard.putNumber("PDP Total Current", RobotMap.pdp.getTotalCurrent());
		SmartDashboard.putNumber("Power", RobotMap.pdp.getTotalPower());
		SmartDashboard.putNumber("Yaw", RobotMap.navX.getAngle());
		SmartDashboard.putNumber("EncoderLeft", RobotMap.EncoderLeft.getDistance());
		// Ports for PDP
		
		SmartDashboard.putNumber("PDP Port0", RobotMap.pdp.getCurrent(0));
		SmartDashboard.putNumber("PDP Port1", RobotMap.pdp.getCurrent(1));
		SmartDashboard.putNumber("PDP Port2", RobotMap.pdp.getCurrent(2));
		SmartDashboard.putNumber("PDP Port3", RobotMap.pdp.getCurrent(3));
		SmartDashboard.putNumber("PDP Port4", RobotMap.pdp.getCurrent(4));
		SmartDashboard.putNumber("PDP Port5", RobotMap.pdp.getCurrent(5));
		SmartDashboard.putNumber("PDP Port6", RobotMap.pdp.getCurrent(6));
		SmartDashboard.putNumber("PDP Port7", RobotMap.pdp.getCurrent(7));
		SmartDashboard.putNumber("PDP Port8", RobotMap.pdp.getCurrent(8));
		SmartDashboard.putNumber("PDP Port9", RobotMap.pdp.getCurrent(9));
		SmartDashboard.putNumber("PDP Port10", RobotMap.pdp.getCurrent(10));
		SmartDashboard.putNumber("PDP Port11", RobotMap.pdp.getCurrent(11));
		SmartDashboard.putNumber("PDP Port12", RobotMap.pdp.getCurrent(12));
		SmartDashboard.putNumber("PDP Port13", RobotMap.pdp.getCurrent(13));
		SmartDashboard.putNumber("PDP Port14", RobotMap.pdp.getCurrent(14));
		SmartDashboard.putNumber("PDP Port15", RobotMap.pdp.getCurrent(15));
		
		
		
		
		//SmartDashboard.putNumber("Distance", RobotMap.ultra.getRangeInches());
		if(RobotMap.pdp.getCurrent(/*climberMotor*/7) < /*get value here*/ 0){
			OI.xboxController2.setRumble(GenericHID.RumbleType.kLeftRumble, 1);
		}
		else{
			OI.xboxController2.setRumble(GenericHID.RumbleType.kLeftRumble, 0);
		}
		//cameras.updateCam();

	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
		RobotMap.navX.reset();
	}
}
