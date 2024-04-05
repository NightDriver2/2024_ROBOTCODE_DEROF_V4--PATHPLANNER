/*package frc.robot.commands.TeleOp.Shooter;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class ShooterOutCommand extends Command {
  Shooter shooter;

  public ShooterOutCommand(Shooter shooter) {
    this.shooter = shooter;

    addRequirements(shooter);
  }

  @Override
  public void initialize() {

  }

  @Override
  public void execute() {

    
    shooter.setShooterPower(-.5,-.5);
  }

  @Override
  public void end(boolean interrupted) {
    shooter.setShooterPower(0, 0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}*/

