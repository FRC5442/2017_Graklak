package org.usfirst.frc.team5442.robot;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	/** Speed Controllers */
	
	/////Left Side
	//public static Spark dtSparkController0;
	//public static Spark dtSparkController1;
	//public static Spark dtSparkController2;
	public static Spark dTSparkControllerLeft;
	
	/////Right Side
	//public static Spark dtSparkController3;
	//public static Spark dtSparkController4;
	//public static Spark dtSparkController5;
	public static Spark dTSparkControllerRight;
	
	//Intake Systems
	public static Spark intake;
	public static Spark conveyor;
	
	//Gear Manipulator
	public static Spark gearMotor;
	
	//Read the Variable
	public static Spark climber;
	
	//Drive Train
	public static RobotDrive driveTrainRobotDrive;
	public static RobotDrive rightSparks;
	public static RobotDrive leftSparks;
	
	
	
	/** Encoders */
	public static Encoder EncoderLeft;
	public static Encoder EncoderRight;
	
	
	public static PowerDistributionPanel pdp;
	
	
	public static void init() {
		// Change these Values here to the ports we eventually use on the robot   
		
		dTSparkControllerLeft = new Spark(0);
		dTSparkControllerRight = new Spark(1);
		
		////// Only Use if 1 speed controller = 1 port
		
		//// Left Motor controllers
		//dtSparkController0 = new Spark(0);
		//dtSparkController1 = new Spark(1);
		//dtSparkController2 = new Spark(2);
		
		//// Right Motor Controllers
		//dtSparkController3 = new Spark(3);
		//dtSparkController4 = new Spark(4);
		//dtSparkController5 = new Spark(5);
		
		climber = new Spark(2);
		intake = new Spark(3);
		conveyor = new Spark(4);
		gearMotor = new Spark(5);
		
		// Set this to whatever works, really
		driveTrainRobotDrive = new RobotDrive(dTSparkControllerLeft, dTSparkControllerRight);
		//driveTrainRobotDrive = new RobotDrive(dtSparkController1, dtSparkController2, dtSparkController7, dtSparkController4);
		
		
		// Encoders, ports 2/3 and 4/5 
		/**EncoderLeft = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Encoders", "Quadrature Encoder Left", EncoderLeft);
        EncoderLeft.setSamplesToAverage(5);
        EncoderLeft.setDistancePerPulse(1.0/360);
        
        EncoderRight = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("Encoders", "Quadrature Encoder Right", EncoderRight);
        EncoderRight.setSamplesToAverage(5);
        EncoderRight.setDistancePerPulse(1.0/360);
        **/
		
		pdp = new PowerDistributionPanel();
	}
	
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
