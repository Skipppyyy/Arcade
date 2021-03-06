/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public class DrivingTrain{
        public static final int FRONT_RIGHT_ID = 0;
        public static final int FRONT_LEFT_ID = 1;
        public static final int BACK_RIGHT_ID = 2;
        public static final int BACK_LEFT_ID = 3;
    }
    
    public class Controls{
        public static final int DRIVER_CONTROLLER_MOVE_AXIS = 4; //not sure about these constants
        public static final int DRIVER_CONTROLLER_ROTATE_AXIS = 5;
        public static final int DRIVE_CONTROLS = 6;
    }

}
