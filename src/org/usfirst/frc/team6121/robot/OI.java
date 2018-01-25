package org.usfirst.frc.team6121.robot;

import org.usfirst.frc.team6121.robot.commands.DeployRamps;
import org.usfirst.frc.team6121.robot.commands.RampsSolenoidExpand;
import org.usfirst.frc.team6121.robot.commands.RampsSolenoidRetract;
import org.usfirst.frc.team6121.robot.commands.TransmissionSolenoidExpand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick operatorJoystick;
	
	OI() {
		
		operatorJoystick = new Joystick(RobotMap.OPERATOR_JOYSTICK);
		
		Button deployRampsButton = new JoystickButton(operatorJoystick, RobotMap.RAMP_BUTTON);
		deployRampsButton.whileHeld(new DeployRamps(-.5));
		
		Button disarmRampButton = new JoystickButton(operatorJoystick, RobotMap.DISARM_RAMP_BUTTON);
		disarmRampButton.whileHeld(new DeployRamps(.5));
		
		Button solenoidExpandButton = new JoystickButton(operatorJoystick, RobotMap.SOLENOID_EXPAND_BUTTON);
		solenoidExpandButton.whenPressed(new RampsSolenoidExpand());
		
		Button solenoidRetractButton = new JoystickButton(operatorJoystick, RobotMap.SOLENOID_RETRACT_BUTTON);
		solenoidRetractButton.whenPressed(new RampsSolenoidRetract());
		
		Button transmissionSolenoidExpandButton = new JoystickButton(operatorJoystick, RobotMap.TRANSMISSION_SOLENOID_EXPAND_BUTTON);
		transmissionSolenoidExpandButton.whileHeld(new TransmissionSolenoidExpand());
	
	}
	
}
