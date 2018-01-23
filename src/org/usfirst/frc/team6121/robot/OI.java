package org.usfirst.frc.team6121.robot;

import org.usfirst.frc.team6121.robot.commands.DeployRamps;

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
		deployRampsButton.toggleWhenPressed(new DeployRamps(.1));
		
		Button disarmRampButton = new JoystickButton(operatorJoystick, RobotMap.DISARM_RAMP_BUTTON);
		disarmRampButton.toggleWhenPressed(new DeployRamps(-.1));
	
	}
	
}
