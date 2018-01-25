
package org.usfirst.frc.team6121.robot;

import org.usfirst.frc.team6121.robot.subsystems.ClimbingSubsystem;
import org.usfirst.frc.team6121.robot.subsystems.PneumaticSubsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	public static ClimbingSubsystem climbingSubsystem;
	public static PneumaticSubsystem pneumaticSubsystem;
	
//	public static final NetworkTable table = NetworkTable.getTable("GRIP/targets");
	public static OI oi;

	Command autonomousCommand;
	
	WPI_TalonSRX _frontLeftMotor = new WPI_TalonSRX(1); 		
	WPI_TalonSRX _frontRightMotor = new WPI_TalonSRX(3);
	
	WPI_TalonSRX _leftSlave1 = new WPI_TalonSRX(2);
	WPI_TalonSRX _rightSlave1 = new WPI_TalonSRX(4);
	WPI_TalonSRX _leftSlave2 = new WPI_TalonSRX(16);
	WPI_TalonSRX _rightSlave2 = new WPI_TalonSRX(17);
	
	DifferentialDrive _drive = new DifferentialDrive(_frontLeftMotor, _frontRightMotor);
	
	Joystick _joy = new Joystick(0);
	
//	UsbCamera camera0;
//	UsbCamera camera1;
//	Mat vid = new Mat();
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		RobotMap.init();

		climbingSubsystem = new ClimbingSubsystem();
		pneumaticSubsystem = new PneumaticSubsystem();
		
		oi = new OI();
		
		_leftSlave1.follow(_frontLeftMotor);
    	_leftSlave2.follow(_frontLeftMotor);
    	_rightSlave1.follow(_frontRightMotor);
    	_rightSlave2.follow(_frontRightMotor);

//		camera0 = new UsbCamera("USB Camera 0", 0);
//		camera0.setFPS(15);
//		camera0.setResolution(320, 240);
//		camera0.setBrightness(0);
//		camera0.setExposureManual(0);
//		camera0.setWhiteBalanceManual(20);
//		CameraServer.getInstance().startAutomaticCapture(camera0);
//		
//		camera1 = new UsbCamera("USB Camera 1", 1);
//		camera1.setBrightness(15);
//		camera1.setFPS(30);
//		camera1.setWhiteBalanceHoldCurrent();
//		camera1.setResolution(320, 240);
//		CameraServer.getInstance().startAutomaticCapture(camera1);
		
		
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {
		
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

//	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}

	/**
	 * This function is called periodically during operator control
	 */
//	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		double forward = _joy.getY();
    	double turn = _joy.getZ();
    	_drive.arcadeDrive(forward, turn);
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		
	}
}
