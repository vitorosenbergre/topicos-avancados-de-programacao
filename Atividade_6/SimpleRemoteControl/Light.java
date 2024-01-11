package SimpleRemoteControl;

public class Light {
  private String location;
  private int intensity;

  public Light(String location) {
      this.location = location;
  }

  public void on() {
      System.out.println(location + " light is on");
  }

  public void off() {
      System.out.println(location + " light is off");
  }

  public int getIntensity() {
      return intensity;
  }

  public void setIntensity(int intensity){
      this.intensity = intensity;
  }

  public void dim(int intensity) {
      this.intensity = intensity;
      System.out.println(location + " light is dimmed to " + intensity + "%");
  }
}
