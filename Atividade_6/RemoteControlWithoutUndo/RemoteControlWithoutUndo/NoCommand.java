package RemoteControlWithoutUndo;
import SimpleRemoteControl.Command;

public class NoCommand implements Command {
  public void execute() { }
  public void undo() { }
}