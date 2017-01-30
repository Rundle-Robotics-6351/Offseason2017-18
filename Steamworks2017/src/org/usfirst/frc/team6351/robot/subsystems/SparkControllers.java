package org.usfirst.frc.team6351.robot.subsystems;

import org.usfirst.frc.team6351.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SparkControllers extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	Spark controller1 = new Spark(RobotMap.Spark_Controller_1);
	Spark controller2 = new Spark(RobotMap.Spark_Controller_2);
	
	public void setController1(double speed) {
		controller1.set(speed);
	}
	public void setController2(double speed) {
		controller2.set(speed);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
