package org.usfirst.frc.team5442.robot;

import org.usfirst.frc.team5442.robot.commands.IntakeAuto;
import org.usfirst.frc.team5442.robot.commands.IntakeButton;
import org.usfirst.frc.team5442.robot.commands.TankDrive;
//import org.usfirst.frc.team5442.robot.commands.TankDrive;
import org.usfirst.frc.team5442.robot.commands.Test;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	/**
	 * CREATING BUTTONS
	 One type of button is a joystick button which is any button on a
	 joystick.
	 You create one by telling it which joystick it's on and which button
	 number it is.
	 Joystick stick = new Joystick(port);
	 Button button = new JoystickButton(stick, buttonNumber);
	 
	 There are a few additional built in buttons you can use. Additionally,
	 by subclassing Button you can create custom triggers and bind those to
	 commands the same as any other Button.
	 
	 TRIGGERING COMMANDS WITH BUTTONS
	 Once you have a button, it's trivial to bind it to a button in one of
	 three ways:
	 
	 Start the command when the button is pressed and let it run the command
	 until it is finished as determined by it's isFinished method.
	 button.whenPressed(new ExampleCommand());
	 
	 Run the command while the button is being held down and interrupt it once
	 the button is released.
	 button.whileHeld(new ExampleCommand());
	 
	 Start the command when the button is released and let it run the command
	 until it is finished as determined by it's isFinished method.
	 button.whenReleased(new ExampleCommand());
	 */
	
	
	public static Joystick xboxController1;
	public static Joystick xboxController2;
	public JoystickButton xboxAButton;
	public JoystickButton xboxBButton;
	public JoystickButton xboxXButton;
	
	
	public OI(){
		xboxController1 = new Joystick(0);
		//xboxController2 = new Joystick(1);
		xboxAButton = new JoystickButton(xboxController1, 1);
		xboxBButton = new JoystickButton(xboxController1, 2);
		xboxXButton = new JoystickButton(xboxController1, 3);
		
		xboxBButton.whileHeld(new TankDrive());
		xboxAButton.whileHeld(new Test());
		/**xboxBButton.whileHeld(new IntakeButton(1,-1));
		xboxXButton.whileHeld(new IntakeButton(-1,-1));
**/
	}
	public Joystick getXboxController1() {
        return xboxController1;
    }
	public Joystick getXboxController2() {
        return xboxController2;
    }
}
