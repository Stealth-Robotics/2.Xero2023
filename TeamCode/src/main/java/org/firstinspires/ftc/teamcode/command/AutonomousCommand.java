package org.firstinspires.ftc.teamcode.command;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;

import org.firstinspires.ftc.teamcode.subsytem.DriveSubsystem;
import org.firstinspires.ftc.teamcode.subsytem.ElevatorSubsystem;
import org.firstinspires.ftc.teamcode.subsytem.IntakeSubsystem;

public class AutonomousCommand extends SequentialCommandGroup {
    public AutonomousCommand (DriveSubsystem driveSubsystem, IntakeSubsystem intakeSubsystem, ElevatorSubsystem elevatorSubsystem) {
        addCommands(
                new InstantCommand(()-> driveSubsystem.driveTeleop(1,0,0)).withTimeout(3000)

        );

    }

}