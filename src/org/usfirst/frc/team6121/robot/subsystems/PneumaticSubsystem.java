package org.usfirst.frc.team6121.robot.subsystems;

import org.usfirst.frc.team6121.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PneumaticSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	static DoubleSolenoid rampsSolenoid = RobotMap.rampsSolenoid;
	static Solenoid transmissionSolenoid = RobotMap.transmissionSolenoid;
	static Solenoid pinSolenoid = RobotMap.pinSolenoid;
	
	public static boolean running;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static void transmissionSolenoidExpand() {
    	transmissionSolenoid.set(true);
    	
    }
    
    public static void transmissionSolenoidOff() {
    	transmissionSolenoid.set(false);
    	
    }
    
}

