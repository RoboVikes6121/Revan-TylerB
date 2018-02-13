package org.usfirst.frc.team6121.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftSideAuton extends CommandGroup {

    public LeftSideAuton() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	addSequential(new DriveStraight(.75, 1));
    	addSequential(new Turn(-.75, .9));
    	addSequential(new DriveStraight(.75, 2.3));
    	addSequential(new Turn(0.75, 1.75));
    	addSequential(new DriveStraight(.6, 2.2));
    	addSequential(new PlaceCubeSwitch(1, 5));
    	addSequential(new PlaceCubeSwitch(-1, 5));
    }
}
