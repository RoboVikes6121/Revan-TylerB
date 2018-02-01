package org.usfirst.frc.team6121.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

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
	
	public static final int DRIVER_JOYSTICK = 0;
	public static final int OPERATOR_JOYSTICK = 1;
	
	public static final int X_AXIS = 0;
	public static final int Y_AXIS = 1;
	public static final int R_TRIGGER = 3;

	public static final int BUTTON_ONE = 1;
	public static final int BUTTON_TWO = 2;
	public static final int BUTTON_THREE = 3;
	public static final int BUTTON_FOUR = 4;
	public static final int BUTTON_FIVE = 5;
	public static final int SOLENOID_EXPAND_BUTTON = 6;
	public static final int SOLENOID_RETRACT_BUTTON = 7;
	public static final int TRANSMISSION_SOLENOID_EXPAND_BUTTON = 8;
	public static final int BUTTON_NINE = 9;
	public static final int BUTTON_TEN = 10;
	public static final int GRAB_CUBE_BUTTON = 11;
	public static final int THROW_CUBE_BUTTON = 12;
	public static final int DEPLOY_RAMP_BUTTON = 13;
	public static final int DISARM_RAMP_BUTTON = 14;
	public static final int REARM_THROWER_BUTTON = 15;
	public static final int RELEASE_CUBE_BUTTON = 16;

	public static final int RAMP_MOTORS = 0;
	public static final int THROWER_MOTOR = 5;
	public static final int GRABBER_MOTOR = 6;
	
	public static SpeedController rMotors;
	public static SpeedController tMotor;
	public static SpeedController gMotor;
	
	public static DifferentialDrive driveTrain;
	
	public static DoubleSolenoid rampsSolenoid;
	public static Solenoid transmissionSolenoid;
	
	public static void init() {
		
    	WPI_TalonSRX _frontLeftMotor = new WPI_TalonSRX(1); 		
    	WPI_TalonSRX _frontRightMotor = new WPI_TalonSRX(3);
    	
    	WPI_TalonSRX _leftSlave1 = new WPI_TalonSRX(2);
    	WPI_TalonSRX _rightSlave1 = new WPI_TalonSRX(4);

    	driveTrain = new DifferentialDrive(_frontLeftMotor, _frontRightMotor);
    	
    	_leftSlave1.follow(_frontLeftMotor);
    	_rightSlave1.follow(_frontRightMotor);
		
		rMotors = new Spark(RAMP_MOTORS);
		tMotor = new Spark(THROWER_MOTOR);
		gMotor = new Spark(GRABBER_MOTOR);
		
		rampsSolenoid = new DoubleSolenoid(0, 1);
		transmissionSolenoid = new Solenoid(3);
	
	}
	
}
