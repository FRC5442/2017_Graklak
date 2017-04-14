
package org.usfirst.frc.team5442.robot;

import org.usfirst.frc.team5442.robot.commands.ClimbFull;
import org.usfirst.frc.team5442.robot.commands.ClimbUp;
import org.usfirst.frc.team5442.robot.commands.Eject;
import org.usfirst.frc.team5442.robot.commands.FloorGearRollers;
import org.usfirst.frc.team5442.robot.commands.FloorGearRollersOut;
import org.usfirst.frc.team5442.robot.commands.GearLiftDown;
import org.usfirst.frc.team5442.robot.commands.GearLiftUp;
import org.usfirst.frc.team5442.robot.commands.GearLift;
import org.usfirst.frc.team5442.robot.commands.Gear_Arms_In;
import org.usfirst.frc.team5442.robot.commands.Gear_Arms_Out;
import org.usfirst.frc.team5442.robot.commands.IntakeCmd;
import org.usfirst.frc.team5442.robot.commands.ServoDown;
import org.usfirst.frc.team5442.robot.commands.ServoUp;
import org.usfirst.frc.team5442.robot.commands.Shoot;

import edu.wpi.first.wpilibj.XboxController;
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
	
	
	public static XboxController xboxController1;
	public static XboxController xboxController2;
	// Xbox Controller 1 Buttons
	public JoystickButton xboxAButton;
	public JoystickButton xboxBButton;
	public JoystickButton xboxXButton;
	public JoystickButton xboxYButton;
	public JoystickButton xboxLBumper;
	public JoystickButton xboxRBumper;
	public JoystickButton xboxStart;
	public JoystickButton xboxBack;
	
	// Xbox Controller 2 Buttons
	public JoystickButton xbox2AButton;
	public JoystickButton xbox2BButton;
	public JoystickButton xbox2XButton;
	public JoystickButton xbox2YButton;
	public JoystickButton xbox2LBumper;
	public JoystickButton xbox2RBumper;
	public JoystickButton xbox2Start;
	public JoystickButton xbox2Back;
	
	
	
	
	public OI(){
		// Setting Controller Order
		xboxController1 = new XboxController(0);
		xboxController2 = new XboxController(1);
		
		// Setting Controller 1 Buttons
		xboxAButton = new JoystickButton(xboxController1, 1);
		xboxBButton = new JoystickButton(xboxController1, 2);
		xboxXButton = new JoystickButton(xboxController1, 3);
		xboxYButton = new JoystickButton(xboxController1, 4);
		xboxLBumper = new JoystickButton(xboxController1, 5);
		xboxRBumper = new JoystickButton(xboxController1, 6);
		xboxBack = new JoystickButton(xboxController1, 7);
		xboxStart = new JoystickButton(xboxController1, 8);
		
		// Setting Controller 2 Buttons
		xbox2AButton = new JoystickButton(xboxController2, 1);
		xbox2BButton = new JoystickButton(xboxController2, 2);
		xbox2XButton = new JoystickButton(xboxController2, 3);
		xbox2YButton = new JoystickButton(xboxController2, 4);
		xbox2LBumper = new JoystickButton(xboxController2, 5);
		xbox2RBumper = new JoystickButton(xboxController2, 6);
		xbox2Back = new JoystickButton(xboxController2, 7);
		xbox2Start = new JoystickButton(xboxController2, 8);
		
		// Setting what the button does 
		//**NOTE** 
		//.whileHeld = when held, run command; when released, stop running
		//.whenPressed = run once when pressed, stop when conditions are met.
		
		// Check if calling subsystems into OI works; See: GearManipulator.java
		xboxRBumper.whileHeld(new Gear_Arms_In(4));
		xboxLBumper.whileHeld(new Gear_Arms_Out(4));
		
		xbox2LBumper.whileHeld(new ServoUp());
		xbox2RBumper.whileHeld(new ServoDown());
		
		//xbox2AButton.whileHeld(new Shoot());
		//xbox2BButton.whileHeld(new IntakeCmd());
		//xbox2XButton.whileHeld(new Eject());
		xbox2YButton.whileHeld(new ClimbUp());
		xbox2BButton.whileHeld(new ClimbFull());
		xbox2RBumper.whileHeld(new GearLiftUp());
		xbox2LBumper.whileHeld(new GearLiftDown());
		xbox2AButton.whileHeld(new FloorGearRollers());
		xbox2XButton.whileHeld(new FloorGearRollersOut());
		/**xboxBButton.whileHeld(new IntakeButton(1,-1));
		xboxXButton.whileHeld(new IntakeButton(-1,-1));
**/
	}
	public XboxController getXboxController1() {
        return xboxController1;
    }
	public XboxController getXboxController2() {
        return xboxController2;
    }
}
