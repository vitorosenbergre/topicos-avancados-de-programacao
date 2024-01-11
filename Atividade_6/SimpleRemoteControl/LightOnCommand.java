package SimpleRemoteControl;

public class LightOnCommand implements Command {
  private Light light;
  private int prevIntensity;

  public LightOnCommand(Light livingRoomLight) {
      this.light = livingRoomLight;
  }

  public void execute() {
      prevIntensity = light.getIntensity();
      light.on();
  }

  public void undo() {
      light.dim(prevIntensity);
  }
}