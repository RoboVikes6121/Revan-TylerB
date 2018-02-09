package org.usfirst.frc.team6121.robot.subsystems;

import org.usfirst.frc.team6121.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PowerCubeDeliverSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setGrabber(double s) {
    	RobotMap.gMotor.set(s);
    	
    }
    
    public void setArms(double s) {
    	RobotMap.aMotor.set(s);
    	
    }
    
    public void setLoader(double l) {
    	RobotMap.rlMotors.set(l);
    	
    }
    
    public void placeInSwitch(double p) {
    	RobotMap.rlMotors.set(p);
    }
    
}

