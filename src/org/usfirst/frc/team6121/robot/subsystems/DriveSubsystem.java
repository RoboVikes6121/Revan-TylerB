package org.usfirst.frc.team6121.robot.subsystems;

import org.usfirst.frc.team6121.robot.RobotMap;
import org.usfirst.frc.team6121.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.z
	
	public static final double Kp = 0.6;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ArcadeDrive());
    }
    
    public void arcadeDrive(Joystick stick) {
    	double forward = stick.getRawAxis(RobotMap.Y_AXIS) * (stick.getRawAxis(RobotMap.R_TRIGGER) + 0.75);
    	double turn = stick.getRawAxis(RobotMap.X_AXIS);
    	RobotMap.driveTrain.arcadeDrive(forward, turn);
    }
    
    
    public void drive(double m, double c) {
    	RobotMap.driveTrain.arcadeDrive(m,  c);
    }
    
    
    public void driveStraight(double s) {
    	double angle = RobotMap.gyro.getAngle();
    	drive(s, angle* Kp);
    	Timer.delay(.004);
    	
    }
    
}
