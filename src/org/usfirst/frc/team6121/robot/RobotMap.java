package org.usfirst.frc.team6121.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

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
	public static final int RAMP_BUTTON = 3;
	public static final int DISARM_RAMP_BUTTON = 4;
	public static final int L_BUTTON = 5;
	public static final int SOLENOID_EXPAND_BUTTON = 6;
	public static final int SOLENOID_RETRACT_BUTTON = 7;
	public static final int TRANSMISSION_SOLENOID_EXPAND_BUTTON = 8;

	public static final int SHOOTER_MOTOR = 1;
	public static final int BALL_INTAKE_MOTOR = 6;
	public static final int RAMP_MOTOR_1 = 0;
	public static final int RAMP_MOTOR_2 = 7;
	
	public static SpeedController rMotor1;
	public static SpeedController rMotor2;
	
	public static DoubleSolenoid rampsSolenoid;
	public static Solenoid transmissionSolenoid;
	
	public static void init() {
		
		rMotor1 = new Spark(RAMP_MOTOR_1);
		rMotor2 = new Spark(RAMP_MOTOR_2);
		
		rampsSolenoid = new DoubleSolenoid(0, 1);
		transmissionSolenoid = new Solenoid(3);
	
	}
	
}
