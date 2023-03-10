// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LiftSubSystem extends SubsystemBase {
  /** Creates a new LiftSubSystem. */

  private Spark armMotor;
  private CANSparkMax liftMotor;

  public LiftSubSystem() {

    armMotor = new Spark(5);

    liftMotor = new CANSparkMax(12, MotorType.kBrushless);

  }

  public void setArmPower(double power){
    armMotor.set(power);
  }

  public void setLiftPower(double power) {
    liftMotor.set(power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }



}
