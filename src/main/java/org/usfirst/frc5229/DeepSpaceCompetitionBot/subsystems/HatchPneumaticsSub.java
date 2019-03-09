// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5229.DeepSpaceCompetitionBot.subsystems;


import org.usfirst.frc5229.DeepSpaceCompetitionBot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DoubleSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class HatchPneumaticsSub extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private DoubleSolenoid doubleSolenoid1;
    private DoubleSolenoid doubleSolenoid2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public HatchPneumaticsSub() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        doubleSolenoid1 = new DoubleSolenoid(0, 0, 1);
        addChild("Double Solenoid 1",doubleSolenoid1);
        
        
        doubleSolenoid2 = new DoubleSolenoid(1, 2, 3);
        addChild("Double Solenoid 2",doubleSolenoid2);
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new NeutralHatchPneumaticCmd());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void extend1() {
        doubleSolenoid1.set(DoubleSolenoid.Value.kForward);
    }

    public void retract1() {
        doubleSolenoid1.set(DoubleSolenoid.Value.kReverse);
    }

    public void neutral1() {
        doubleSolenoid1.set(DoubleSolenoid.Value.kOff);
    }

    public void extend2() {
        doubleSolenoid2.set(DoubleSolenoid.Value.kForward);
    }

    public void retract2() {
        doubleSolenoid2.set(DoubleSolenoid.Value.kReverse);
    }

    public void neutral2() {
        doubleSolenoid2.set(DoubleSolenoid.Value.kOff);
    }
}

