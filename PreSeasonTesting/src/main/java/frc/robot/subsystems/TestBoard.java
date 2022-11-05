// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TestBoard extends SubsystemBase {
  // Declare the talon srx motor controllers, and also their pin number
  TalonSRX leftTalon = new TalonSRX(3);
  TalonSRX rightTalon = new TalonSRX(5);
  /** Creates a new Test Board Subsystem. */
  public TestBoard() {
    leftTalon.set(ControlMode.PercentOutput, 0);
    rightTalon.set(ControlMode.PercentOutput, 0);
  }

  public void turnMotors(double xAxisSpeed, double yAxisSpeed){
    double leftTotal = xAxisSpeed + yAxisSpeed;
    double rightTotal = xAxisSpeed - yAxisSpeed;
    leftTalon.set(ControlMode.PercentOutput, leftTotal);
    rightTalon.set(ControlMode.PercentOutput, rightTotal);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
