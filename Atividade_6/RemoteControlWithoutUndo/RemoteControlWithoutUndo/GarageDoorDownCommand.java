package RemoteControlWithoutUndo;
import SimpleRemoteControl.Command;

public class GarageDoorDownCommand implements Command {
  private GarageDoor garageDoor;

  public GarageDoorDownCommand(GarageDoor garageDoor) {
      this.garageDoor = garageDoor;
  }

  public void execute() {
      garageDoor.down();
  }

  public void undo() {
      garageDoor.up();
  }
}