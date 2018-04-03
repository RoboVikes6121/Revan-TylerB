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
	
	static Solenoid transmissionSolenoid = RobotMap.transmissionSolenoid;
	static DoubleSolenoid armsSolenoid = RobotMap.armsSolenoid;
	static DoubleSolenoid flipperSolenoid = RobotMap.flipperSolenoid;
	
	public static boolean running;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void transmissionSolenoidExpand() {
    	transmissionSolenoid.set(true);
    	
    }
    
    public void transmissionSolenoidOff() {
    	transmissionSolenoid.set(false);
    	
    }
    
    public void armsSolenoidExpand() {
    	armsSolenoid.set(DoubleSolenoid.Value.kForward);
    	
    }
    
    public void armsSolenoidRetract() {
    	armsSolenoid.set(DoubleSolenoid.Value.kReverse);
    	
    }
    
    public void armsSolenoidOff() {
    	armsSolenoid.set(DoubleSolenoid.Value.kOff);
    	
    }
    
    public void flipperSolenoidExpand() {
    	flipperSolenoid.set(DoubleSolenoid.Value.kForward);
    	
    }
    
    public void flipperSolenoidRetract() {
    	flipperSolenoid.set(DoubleSolenoid.Value.kReverse);
    	
    }
    
    public void flipperSolenoidOff() {
    	flipperSolenoid.set(DoubleSolenoid.Value.kOff);
    	
    }
    
}

