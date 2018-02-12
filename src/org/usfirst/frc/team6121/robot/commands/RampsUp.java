package org.usfirst.frc.team6121.robot.commands;

import org.usfirst.frc.team6121.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RampsUp extends Command {
	private double speed;
	//private double time;

    public RampsUp(double s) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.climbingSubsystem);
    	speed = s;
    	//time = t;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//setTimeout(time);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.climbingSubsystem.setSpeedUp(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return false;
        //return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.climbingSubsystem.setSpeedUp(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
