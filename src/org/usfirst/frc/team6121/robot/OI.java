package org.usfirst.frc.team6121.robot;

import org.usfirst.frc.team6121.robot.commands.LoadCube;
import org.usfirst.frc.team6121.robot.commands.PlaceCubeSwitch;
import org.usfirst.frc.team6121.robot.commands.TransmissionSolenoidExpand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick driverJoystick;
	public static Joystick operatorJoystick;
	
	OI() {
		
		driverJoystick = new Joystick(RobotMap.DRIVER_JOYSTICK);
		operatorJoystick = new Joystick(RobotMap.OPERATOR_JOYSTICK);
		
		Button transmissionSolenoidExpandButton = new JoystickButton(operatorJoystick, RobotMap.TRANSMISSION_SOLENOID_EXPAND_BUTTON);
		transmissionSolenoidExpandButton.whileHeld(new TransmissionSolenoidExpand());
		
		Button switchButton = new JoystickButton(operatorJoystick, RobotMap.SWITCH_BUTTON);
		switchButton.whileHeld(new PlaceCubeSwitch(.5, .1));
		
		Button loadButton = new JoystickButton(operatorJoystick, RobotMap.LOADER_BUTTON);
		loadButton.whileHeld(new LoadCube(-.5, .1));
	
	}
	
}
