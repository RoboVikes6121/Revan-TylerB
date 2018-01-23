package org.usfirst.frc.team6121.robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	public static final int OPERATOR_JOYSTICK = 1;
	
	public static final int X_AXIS = 0;
	public static final int Y_AXIS = 1;
	public static final int R_TRIGGER = 3;

	public static final int A_BUTTON = 1;
	public static final int B_BUTTON = 2;
	public static final int X_BUTTON = 3;
	public static final int DISARM_RAMP_BUTTON = 4;
	public static final int L_BUTTON = 5;
	public static final int RAMP_BUTTON = 6;

	public static final int SHOOTER_MOTOR = 1;
	public static final int BALL_INTAKE_MOTOR = 6;
	public static final int RAMP_MOTOR = 0;
	
	public static SpeedController rMotor;
	
	public static void init() {
		
		rMotor = new Victor(RAMP_MOTOR);
	
	}
	
}
