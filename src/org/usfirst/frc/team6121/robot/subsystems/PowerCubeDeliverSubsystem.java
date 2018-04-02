package org.usfirst.frc.team6121.robot.subsystems;

import org.usfirst.frc.team6121.robot.Robot;
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
    
    public void placeInSwitch(double p) {
    	if (Robot.limitSwitch1.get()) 
    		RobotMap.rlMotors.set(p);
    	else RobotMap.rlMotors.set(0);
    }
    
    public void setLoader(double l) {
    	if (Robot.limitSwitch2.get())
    		RobotMap.rlMotors.set(l);
    	else RobotMap.rlMotors.set(0);
    }
    
    public void grabberPull(double s) {
    	if (Robot.limitSwitch3.get())
    		RobotMap.glMotor.set(-s);
    	else RobotMap.glMotor.set(0); 
    	if (Robot.limitSwitch3.get())
    		RobotMap.grMotor.set(s);
    	else RobotMap.grMotor.set(0);
    }
    
    public void launchGrabber(double s) {
    	RobotMap.glMotor.set(s);
    	RobotMap.grMotor.set(-s);
    }
    
}

