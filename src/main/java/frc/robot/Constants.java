package frc.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController.Button;
/***
 * This class contains all the constant values for setting up and running the robot.
 */
public class Constants{
    public static class Controls{
        // Driver controls:
        public static final Hand DRIVE = Hand.kLeft;
        public static final int SHIFT_GEAR = Button.kY.value;
        public static final int RUN_INTAKE_FWD = Button.kBumperRight.value;
        public static final int RUN_INTAKE_RVS = Button.kBumperLeft.value;
        public static final int TOGGLE_INTAKE_RAISED = Button.kX.value;
        public static final int TOGGLE_BALL_GATE = Button.kB.value;
        public static final int SHOOT_BALL = Button.kA.value;
        public static final int SHOOT_BALL_MANUAL = 7;

    }
    // USB ids
    public static final int DRIVER = 0;
    public static final int OPERATOR = 1;

    // CANbus ids
    //example: public static final int FRONT_LEFT_DRIVE = 0;

     // PCM ids
    // (our PCM's port 2 is broken, do not use it)
    //example:  public static final int CLIMBER_LOCK = 0;

    // DriveBase
    public static final double CONTROL_DEADBAND = 0.10;
    public static final int SENSOR_UNITS_PER_ROTATION = 2048;
    public static final int ENCODER_UNITS_PER_ROTATION = 24140;
    public static final int ACCEL_UNITS = 473000;
    public static final int DECEL_UNITS = ACCEL_UNITS;

    //other examples at https://github.com/HoyaRobotics/InfiniteRecharge2020/blob/master/src/main/java/frc/robot/Constants.java
    
}