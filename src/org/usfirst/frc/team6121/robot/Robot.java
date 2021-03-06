
package org.usfirst.frc.team6121.robot;

import org.usfirst.frc.team6121.robot.commands.LeftSideAuton;
import org.usfirst.frc.team6121.robot.commands.RightSideAuton;
import org.usfirst.frc.team6121.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team6121.robot.subsystems.LightSubsystem;
import org.usfirst.frc.team6121.robot.subsystems.PneumaticSubsystem;
import org.usfirst.frc.team6121.robot.subsystems.PowerCubeDeliverSubsystem;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	public static PneumaticSubsystem pneumaticSubsystem;
	public static DriveSubsystem driveSubsystem;
	public static PowerCubeDeliverSubsystem cubeSubsystem;
	public static LightSubsystem lightSubsystem;
	
	public static OI oi;

	Command autonomousCommand;
	
	public static DigitalInput limitSwitch1;
	public static DigitalInput limitSwitch2;
	public static DigitalInput limitSwitch3;
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		RobotMap.init();

		pneumaticSubsystem = new PneumaticSubsystem();
		driveSubsystem = new DriveSubsystem();
		cubeSubsystem = new PowerCubeDeliverSubsystem();
		lightSubsystem = new LightSubsystem();
		
		oi = new OI();
		
		CameraServer.getInstance().startAutomaticCapture(0);
		CameraServer.getInstance().startAutomaticCapture(1);
		
		limitSwitch1 = new DigitalInput(1);
		limitSwitch2 = new DigitalInput(2);
		limitSwitch3 = new DigitalInput(3);
		
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
		String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		if(gameData.charAt(0) == 'L') 
		{  
			autonomousCommand = new LeftSideAuton();
		} else {
			autonomousCommand = new RightSideAuton();
		}

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
    	
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		
	}
}
