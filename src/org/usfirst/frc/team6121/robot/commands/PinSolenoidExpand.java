package org.usfirst.frc.team6121.robot.commands;

import org.usfirst.frc.team6121.robot.OI;
import org.usfirst.frc.team6121.robot.Robot;
import org.usfirst.frc.team6121.robot.subsystems.PneumaticSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PinSolenoidExpand extends Command {

    public PinSolenoidExpand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.pneumaticSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (OI.driverJoystick.getRawButtonPressed(1) && OI.operatorJoystick.getRawButtonPressed(1))
    		PneumaticSubsystem.pinSolenoidExpand();
    	else PneumaticSubsystem.pinSolenoidOff();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	PneumaticSubsystem.pinSolenoidOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
