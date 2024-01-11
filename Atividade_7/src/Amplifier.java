package src;

public class Amplifier {
  private String brand;
  private boolean on;
  private int volume;
  private String soundMode;
  private DVDPlayer dvd;
  private Tuner tuner;
  private CDPlayer cd;

  public Amplifier(String brand) {
    this.brand = brand;
  }

  public void on() {
      on = true;
      System.out.println("Amplifier is on");
  }

  public void off() {
      on = false;
      System.out.println("Amplifier is off");
  }

  public void setDvd(DVDPlayer dvd) {
      this.dvd = dvd;
      System.out.println("DVD player is set to amplifier");
  }

  public void setCD(CDPlayer cd){
      this.cd = cd;
      System.out.println("CD player is set to amplifier");
  }

  public void setTuner(Tuner tuner) {
      this.tuner = tuner;
      System.out.println("Tuner is set to amplifier");
  }

  public void setVolume(int volume) {
      this.volume = volume;
      System.out.println("Volume is set to " + volume);
  }

  public void setSurroundSound() {
      soundMode = "surround";
      System.out.println("Surround sound mode is set");
  }

  public void setStereoSound() {
      soundMode = "stereo";
      System.out.println("Stereo sound mode is set");
  }

  public void setTwoChannelAudio() {
      soundMode = "twoChannelAudio";
      System.out.println("Two Channel audio is set");
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public void setSoundMode(String soundMode) {
    this.soundMode = soundMode;
  }

  public boolean isOn() {
    return on;
  }

  public int getVolume() {
    return volume;
  }

  public String getSoundMode() {
    return soundMode;
  }

  public DVDPlayer getDvd() {
    return dvd;
  }

  public Tuner getTuner() {
    return tuner;
  }

  public CDPlayer getCd() {
    return cd;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }
}
