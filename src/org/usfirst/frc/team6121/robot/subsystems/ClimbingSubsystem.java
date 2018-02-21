package org.usfirst.frc.team6121.robot.subsystems;

import org.usfirst.frc.team6121.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClimbingSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeedDown(double r) {
    		RobotMap.rlMotors.set(r);
    	
    }
    
    public void setSpeedUp(double r) {
    		RobotMap.rlMotors.set(r);
    	
    }
    
}

