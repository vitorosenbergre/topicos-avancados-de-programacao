package RemoteControlWithoutUndo;
import SimpleRemoteControl.Command;

public class StereoOnWithCDCommand implements Command {
  private Stereo stereo;
  private int prevVolume;

  public StereoOnWithCDCommand(Stereo stereo) {
      this.stereo = stereo;
  }

  public void execute() {
      prevVolume = stereo.getVolume();
      stereo.on();
      stereo.setCD();
      stereo.setVolume(11);
  }

  public void undo() {
      stereo.off();
      stereo.setVolume(prevVolume);
  }
}
