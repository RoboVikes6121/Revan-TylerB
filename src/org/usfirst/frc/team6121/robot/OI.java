package org.usfirst.frc.team6121.robot;

import org.usfirst.frc.team6121.robot.commands.ArmsDeploy;
import org.usfirst.frc.team6121.robot.commands.ArmsRetract;
import org.usfirst.frc.team6121.robot.commands.FlipperSolenoidExpand;
import org.usfirst.frc.team6121.robot.commands.FlipperSolenoidRetract;
import org.usfirst.frc.team6121.robot.commands.GrabberGrab;
import org.usfirst.frc.team6121.robot.commands.GrabberLaunch;
import org.usfirst.frc.team6121.robot.commands.Lights;
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
		switchButton.whileHeld(new Lights(-.99));
		
		Button loadButton = new JoystickButton(operatorJoystick, RobotMap.LOADER_BUTTON);
		loadButton.whileHeld(new LoadCube(-.5, .1));
		loadButton.whileHeld(new Lights(-.99));
		
		Button grabButton = new JoystickButton(operatorJoystick, RobotMap.GRAB_BUTTON);
		grabButton.whileHeld(new GrabberGrab(.5));
		grabButton.whileHeld(new Lights(-.99));
		
		Button launchButton = new JoystickButton(operatorJoystick, RobotMap.LAUNCH_BUTTON);
		launchButton.whileHeld(new GrabberLaunch(-.5));
		launchButton.whileHeld(new Lights(-.99));
		
		Button deployArmsButton = new JoystickButton(operatorJoystick, RobotMap.DEPLOY_ARMS_BUTTON);
		deployArmsButton.whenPressed(new ArmsDeploy());
		
		Button retractArmsButton = new JoystickButton(operatorJoystick, RobotMap.RETRACT_ARMS_BUTTON);
		retractArmsButton.whenPressed(new ArmsRetract());
		
		Button flipperHolderExtendButton = new JoystickButton(operatorJoystick, RobotMap.FLIPPER_SOLENOID_EXTEND_BUTTON);
		flipperHolderExtendButton.whenPressed(new FlipperSolenoidExpand());
		
		Button flipperHolderRetractButton = new JoystickButton(operatorJoystick, RobotMap.FLIPPER_SOLENOID_RETRACT_BUTTON);
		flipperHolderRetractButton.whenPressed(new FlipperSolenoidRetract());
		
		Button lightsButton = new JoystickButton(operatorJoystick, RobotMap.LIGHTS_BUTTON);
		lightsButton.whileHeld(new Lights(-.99));
	
	}
	
}
