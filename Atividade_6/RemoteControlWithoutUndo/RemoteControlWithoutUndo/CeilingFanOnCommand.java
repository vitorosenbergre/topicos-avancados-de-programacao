package RemoteControlWithoutUndo;
import SimpleRemoteControl.Command;

public class CeilingFanOnCommand implements Command {
  private CeilingFan ceilingFan;
  private int previousSpeed;

  public CeilingFanOnCommand(CeilingFan ceilingFan) {
      this.ceilingFan = ceilingFan;
  }

  public void execute() {
      previousSpeed = ceilingFan.getSpeed();
      ceilingFan.high();
  }

  public void undo() {
      if (previousSpeed == CeilingFan.HIGH) {
          ceilingFan.high();
      } else if (previousSpeed == CeilingFan.MEDIUM) {
          ceilingFan.medium();
      } else if (previousSpeed == CeilingFan.LOW) {
          ceilingFan.low();
      } else if (previousSpeed == CeilingFan.OFF) {
          ceilingFan.off();
      }
  }
}