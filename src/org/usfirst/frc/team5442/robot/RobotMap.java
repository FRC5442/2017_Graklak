package org.usfirst.frc.team5442.robot;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static RobotDrive driveTrainRobotDrive;
	
	// Speed Controllers & Servos
	public static SpeedController dTSparkController1;
	public static SpeedController dTSparkController2;
	public static SpeedController dTSparkController3;
	public static SpeedController dTSparkController4;
	public static Servo testServo;
	public static Spark spk1;
	
	//Sensors
	public static Encoder EncoderLeft;
	public static Encoder EncoderRight;
	
	
	public static void init() {
		// Change these Values here to the ports we eventually use on the robot   
		dTSparkController1 = new Spark(2);
		dTSparkController2 = new Spark(3);
		
		dTSparkController3 = new Spark(0);
		dTSparkController4 = new Spark(4);
		
		spk1 = new Spark(1);
		
		testServo = new Servo(6);
		// Set this to whatever works, really
		driveTrainRobotDrive = new RobotDrive(dTSparkController1, dTSparkController2, dTSparkController3, dTSparkController4);
		
		// Encoders, ports 2/3 and 4/5 
		EncoderLeft = new Encoder(0, 1, false, EncodingType.k4X);
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
