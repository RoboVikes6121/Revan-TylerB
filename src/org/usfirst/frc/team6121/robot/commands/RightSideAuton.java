package org.usfirst.frc.team6121.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSideAuton extends CommandGroup {

    public RightSideAuton() {
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
    	
    	addSequential(new Drive(.5, 0, .8));
    	addSequential(new Drive(0, .6, .9));
    	addSequential(new Drive(.5, 0, 2.2));
    	addSequential(new Drive(0, -.65, .7));
    	addParallel(new Drive(.6, 0, 2));
    	addSequential(new PlaceCubeSwitch(-.6, 4));
    }
}
