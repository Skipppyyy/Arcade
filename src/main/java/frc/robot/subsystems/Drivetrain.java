/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Drivetrain extends SubsystemBase {
  /**
   * Creates a new Drivetrain.
   */
  private CANSparkMax frontRightMotor;
  private CANSparkMax frontLeftMotor;
  private CANSparkMax backRightMotor;
  private CANSparkMax backLeftMotor;
  private DifferentialDrive differentialDrive;
  public Drivetrain() {
    //settings motors
    frontRightMotor = new CANSparkMax(Constants.DrivingTrain.FRONT_RIGHT_ID, MotorType.kBrushless);
    frontLeftMotor = new CANSparkMax(Constants.DrivingTrain.FRONT_LEFT_ID, MotorType.kBrushless);
    backRightMotor = new CANSparkMax(Constants.DrivingTrain.BACK_RIGHT_ID, MotorType.kBrushless);
    backLeftMotor = new CANSparkMax(Constants.DrivingTrain.BACK_LEFT_ID, MotorType.kBrushless);

    SpeedControllerGroup rightMotors = new SpeedControllerGroup(frontRightMotor, frontRightMotor);
    SpeedControllerGroup leftMotors = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);

    differentialDrive = new DifferentialDrive(rightMotors, leftMotors);
  }

  public void arcadeDrive(double moveSpeed, double rotateSpeed){
    differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
