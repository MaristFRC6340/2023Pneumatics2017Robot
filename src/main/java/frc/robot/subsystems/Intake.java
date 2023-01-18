// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {

  // Add Solenoids for Arm and Grasper
  private DoubleSolenoid testSol, sol01, sol45; //solenoids

  /** Creates a new PneumaticControl. */
  public Intake() {

    sol01 = new DoubleSolenoid(1, PneumaticsModuleType.CTREPCM, 0, 1);
    sol45 = new DoubleSolenoid(1, PneumaticsModuleType.CTREPCM, 4, 5);
    testSol = new DoubleSolenoid(1, PneumaticsModuleType.CTREPCM, 2, 3); //solenoid 2, 3

  }

  public void intakeUp(){
    testSol.set(Value.kForward);
  }

  public void intakeDown(){
    testSol.set(Value.kReverse);
  }
  
  //sol 01
  public void openClaw(){
    sol01.set(Value.kForward);

  }

  public void closeClaw(){
    sol01.set(Value.kReverse);

  }

  //sol 45
  public void openArm(){
    sol45.set(Value.kForward);

  }

  public void closeArm(){
    sol45.set(Value.kReverse);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
