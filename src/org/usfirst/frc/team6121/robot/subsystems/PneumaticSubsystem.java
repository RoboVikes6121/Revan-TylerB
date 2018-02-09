package org.usfirst.frc.team6121.robot.subsystems;

import org.usfirst.frc.team6121.robot.RobotMap;
import org.usfirst.frc.team6121.robot.commands.RampsSolenoidExpand;
import org.usfirst.frc.team6121.robot.commands.RampsSolenoidRetract;
import org.usfirst.frc.team6121.robot.commands.TransmissionSolenoidExpand;

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
	
	public static boolean running;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new RampsSolenoidExpand());
    	setDefaultCommand(new RampsSolenoidRetract());
    	setDefaultCommand(new TransmissionSolenoidExpand());
    }
    
    public static void rampsSolenoidExpand() {
    	rampsSolenoid.set(DoubleSolenoid.Value.kForward);
    	
    }
    
    public static void rampsSolenoidRetract() {
    	rampsSolenoid.set(DoubleSolenoid.Value.kReverse);
    	
    }
    
    public static void rampsSolenoidOff() {
    	rampsSolenoid.set(DoubleSolenoid.Value.kOff);
    	
    }
    
    public static void transmissionSolenoidExpand() {
    	transmissionSolenoid.set(true);
    	
    }
    
    public static void transmissionSolenoidOff() {
    	transmissionSolenoid.set(false);
    	
    }
    
}

