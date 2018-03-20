package org.usfirst.frc.team6121.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
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
	
	public static final int X_AXIS = 4;
	public static final int Y_AXIS = 1;
	public static final int R_TRIGGER = 3;

	public static final int LOADER_BUTTON = 15;
	public static final int SWITCH_BUTTON = 12;
	public static final int TRANSMISSION_SOLENOID_EXPAND_BUTTON = 5;

	public static final int RAMP_MOTORS = 0;
	public static final int GRABBER_MOTOR_1 = 9;
	public static final int GRABBER_MOTOR_2 = 10;
	
	public static SpeedController rlMotors;
	public static SpeedController gMotor1;
	public static SpeedController gMotor2;
	
	public static DifferentialDrive driveTrain;
	
	public static DoubleSolenoid rampsSolenoid;
	public static Solenoid transmissionSolenoid;
	public static Solenoid pinSolenoid;
	
	public static ADXRS450_Gyro gyro;
	
	public static void init() {
    	
    	WPI_TalonSRX _frontLeftMotor = new WPI_TalonSRX(1); 		
    	WPI_TalonSRX _frontRightMotor = new WPI_TalonSRX(3);

    	WPI_TalonSRX _leftSlave1 = new WPI_TalonSRX(2);
    	WPI_TalonSRX _rightSlave1 = new WPI_TalonSRX(4);	

    	driveTrain = new DifferentialDrive(_frontLeftMotor, _frontRightMotor);
    	
    	_leftSlave1.follow(_frontLeftMotor);
    	_rightSlave1.follow(_frontRightMotor);
		
		rlMotors = new Spark(RAMP_MOTORS);
		gMotor1 = new Spark(GRABBER_MOTOR_1);
		gMotor2 = new Spark(GRABBER_MOTOR_2);
		
		rampsSolenoid = new DoubleSolenoid(0, 1);
		transmissionSolenoid = new Solenoid(2);
		pinSolenoid = new Solenoid(3);
		
		gyro = new ADXRS450_Gyro();
	
	}
	
}
