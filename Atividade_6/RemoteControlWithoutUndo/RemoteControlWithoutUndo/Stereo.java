package RemoteControlWithoutUndo;
public class Stereo {
  private String location;
  private int volume;

  public Stereo(String location) {
      this.location = location;
  }

  public void on() {
      System.out.println(location + " stereo is on");
  }

  public void off() {
      System.out.println(location + " stereo is off");
  }

  public void setCD() {
      System.out.println(location + " stereo is set for CD input");
  }

  public void setDVD() {
      System.out.println(location + " stereo is set for DVD input");
  }

  public void setRadio() {
      System.out.println(location + " stereo is set for radio");
  }

  public void setVolume(int volume) {
      System.out.println(location + " stereo volume set to " + volume);
  }

  public int getVolume(){
    return this.volume;
  }
}