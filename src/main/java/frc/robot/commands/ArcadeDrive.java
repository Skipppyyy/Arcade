/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.*;
import frc.robot.subsystems.Drivetrain;

public class ArcadeDrive extends CommandBase {
  /**
   * Creates a new ArcadeDrive.
   */
  private Drivetrain m_drivetrain;

  public ArcadeDrive(Drivetrain _drivetrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_drivetrain = _drivetrain;

    addRequirements(m_drivetrain);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double moveSpeed = -RobotContainer.driverController.getRawAxis(Constants.Controls.DRIVER_CONTROLLER_MOVE_AXIS);
    double rotateSpeed = RobotContainer.driverController.getRawAxis(Constants.Controls.DRIVER_CONTROLLER_ROTATE_AXIS);
    m_drivetrain.arcadeDrive(moveSpeed, rotateSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivetrain.arcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
