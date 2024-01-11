package src;

public class Projector {
  private String description;
  private DVDPlayer dvdPlayer;

  public Projector(String description, DVDPlayer dvdPlayer) {
      this.description = description;
      this.dvdPlayer = dvdPlayer;
  }

  public void on() {
      System.out.println(description + " on");
  }

  public void off() {
      System.out.println(description + " off");
  }

  public void wideScreenMode() {
      System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
  }

  public void tvMode() {
      System.out.println(description + " in TV mode (4x3 aspect ratio)");
  }

  public void setInput(DVDPlayer dvd) {
      System.out.println(description + " setting DVD player to " + dvd);
      this.dvdPlayer = dvd;
  }

  public DVDPlayer getDvd() {
      return dvdPlayer;
  }
}
  

