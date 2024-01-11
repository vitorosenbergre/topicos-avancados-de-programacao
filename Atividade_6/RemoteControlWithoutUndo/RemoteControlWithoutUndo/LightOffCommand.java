package RemoteControlWithoutUndo;

import SimpleRemoteControl.Command;
import SimpleRemoteControl.Light;

public class LightOffCommand implements Command {
  private Light light;
  private int prevIntensity;

  public LightOffCommand(Light light) {
      this.light = light;
  }

  public void execute() {
      prevIntensity = light.getIntensity();
      light.off();
  }

  public void undo() {
      light.on();
      light.setIntensity(prevIntensity);
  }
}





