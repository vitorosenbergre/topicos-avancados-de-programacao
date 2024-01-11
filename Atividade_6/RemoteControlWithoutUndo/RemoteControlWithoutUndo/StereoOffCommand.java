package RemoteControlWithoutUndo;
import SimpleRemoteControl.Command;

public class StereoOffCommand implements Command {
  private Stereo stereo;
  private int prevVolume;

  public StereoOffCommand(Stereo stereo) {
      this.stereo = stereo;
  }

  public void execute() {
      prevVolume = stereo.getVolume();
      stereo.off();
  }

  public void undo() {
      stereo.on();
      stereo.setVolume(prevVolume);
  }
}