// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class SwerveSubsystem extends SubsystemBase {

  private final PWMSparkMax leftMotors = new PWMSparkMax(0);
  private final PWMSparkMax rightMotors = new PWMSparkMax(1);
  private final DifferentialDrive robotDrive = new DifferentialDrive(leftMotors, rightMotors);
  private final XboxController controller = new XboxController(0);


  /** Creates a new ExampleSubsystem. */
  public SwerveSubsystem() {
    rightMotors.setInverted(true);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    robotDrive.arcadeDrive(controller.getRawAxis(0), controller.getRawAxis(1));
  }

}
