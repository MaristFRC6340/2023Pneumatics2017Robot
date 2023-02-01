// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.Intake;

public class IntakeCommand extends CommandBase {

  private final Intake intake;


  /** Creates a new IntakeCommand. */
  public IntakeCommand(Intake intake) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.intake=intake;
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    //solenoid 2,3 & solenoid 0,1 (allows you to close and open AT SAME TIME)
    if (Robot.getLeftJoystick().getRawButton(5)){ //close
      intake.intakeDown();
      intake.openClaw();
      intake.openArm();
    }
    if(Robot.getLeftJoystick().getRawButton(3)){ //open
      intake.intakeUp();
      intake.closeClaw();
      intake.closeArm();
    }
    
    /**
     * this code below allows you to control each one
     * rather than have it open or close at the 
     * same time... 
     */
    // //solenoid 0,1
    // if (Robot.getLeftJoystick().getRawButton(6)){
    //   intake.closeClaw();
    // }
    // if(Robot.getLeftJoystick().getRawButton(4)){
    //   intake.openClaw();
    // }

    // //solenoid 4, 5
    // if (Robot.getLeftJoystick().getRawButton(11)){
    //   intake.closeArm();
    // }
    // if(Robot.getLeftJoystick().getRawButton(12)){
    //   intake.openArm();
    // }

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
