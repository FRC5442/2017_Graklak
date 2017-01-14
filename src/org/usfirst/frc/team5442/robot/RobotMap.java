package org.usfirst.frc.team5442.robot;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	/** Speed Controllers */
	//Left Side
	public static Spark dTSparkController1;
	public static Spark dTSparkController2;
	public static Spark dTSparkController3;
	//Right Side
	public static Spark dTSparkController4;
	public static Spark dTSparkController5;
	public static Spark dTSparkController6;
	//Drive Train
	//public static RobotDrive driveTrainRobotDrive;
	
	
	
	/** Encoders */
	public static Encoder EncoderLeft;
	public static Encoder EncoderRight;
	
	
	public static void init() {
		// Change these Values here to the ports we eventually use on the robot   
		dTSparkController1 = new Spark(0);
		dTSparkController2 = new Spark(1);
		dTSparkController3 = new Spark(2);
		dTSparkController4 = new Spark(3);
		dTSparkController5 = new Spark(4);
		dTSparkController6 = new Spark(5);
		// Set this to whatever works, really
		//driveTrainRobotDrive = new RobotDrive(dTSparkController1, dTSparkController3, dTSparkController2, dTSparkController4);
		
		// Encoders, ports 2/3 and 4/5 
		EncoderLeft = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Encoders", "Quadrature Encoder Left", EncoderLeft);
        EncoderLeft.setSamplesToAverage(5);
        EncoderLeft.setDistancePerPulse(1.0/360);
        
        EncoderRight = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("Encoders", "Quadrature Encoder Right", EncoderRight);
        EncoderRight.setSamplesToAverage(5);
        EncoderRight.setDistancePerPulse(1.0/360);
        
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
