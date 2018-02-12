package org.usfirst.frc.team6121.robot.subsystems;

import org.usfirst.frc.team6121.robot.Robot;
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
    	if (Robot.limitSwitch1.get())
    		RobotMap.rlMotors.set(r);
    	else RobotMap.rlMotors.set(0);
    	
    }
    
    public void setSpeedUp(double r) {
    	if (Robot.limitSwitch2.get())
    		RobotMap.rlMotors.set(r);
    	else RobotMap.rlMotors.set(0);
    	
    }
    
}

