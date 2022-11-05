// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.TestBoard;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class TestMotors extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final TestBoard board;
  Supplier<Double> xSpeedSupplier;
  Supplier<Double> ySpeedSupplier;

  /**
   * Creates a new TestMotors command.
   *
   * @param subsystem The subsystem used by this command.
   */
  public TestMotors(TestBoard subsystem, Supplier<Double> xSpeed, Supplier<Double> ySpeed) {
    xSpeedSupplier = xSpeed;
    ySpeedSupplier = ySpeed;
    board = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    board.turnMotors(xSpeedSupplier.get(), ySpeedSupplier.get());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
