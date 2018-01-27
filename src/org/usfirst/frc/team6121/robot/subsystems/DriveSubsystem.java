package org.usfirst.frc.team6121.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.z

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void drive(double m, double c) {
    	WPI_TalonSRX _frontLeftMotor = new WPI_TalonSRX(1); 		
    	WPI_TalonSRX _frontRightMotor = new WPI_TalonSRX(3);
    	
    	WPI_TalonSRX _leftSlave1 = new WPI_TalonSRX(2);
    	WPI_TalonSRX _rightSlave1 = new WPI_TalonSRX(4);

    	DifferentialDrive _drive = new DifferentialDrive(_frontLeftMotor, _frontRightMotor);
    	
    	_leftSlave1.follow(_frontLeftMotor);
    	_rightSlave1.follow(_frontRightMotor);
    	
    	_drive.arcadeDrive(m, c);
    }
}

