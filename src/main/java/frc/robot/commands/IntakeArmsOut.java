package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Subsystems;

public class IntakeArmsOut extends Command {

    public IntakeArmsOut() {
        super("IntakeArmsOut");
        requires(Subsystems.intake);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        Subsystems.intake.setArmsSpeed(-0.4d);
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public void interrupted() {

    }


    @Override
    public void end() {

    }

}
