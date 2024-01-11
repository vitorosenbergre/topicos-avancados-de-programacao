package src;

public class DVDPlayer {
  private String brand;
  private boolean on;
  private String movie;
  private Amplifier amplifier;

  DVDPlayer(String brand, Amplifier amplifier){
    this.amplifier = amplifier;
    this.brand = brand;
  }

  public void on() {
      on = true;
      System.out.println("DVD player is on");
  }

  public void off() {
      on = false;
      System.out.println("DVD player is off");
  }

  public void play(String movie) {
      this.movie = movie;
      System.out.println("Playing movie: " + movie);
  }

  public void stop() {
      movie = null;
      System.out.println("Movie stopped");
  }

  public void eject() {
      movie = null;
      System.out.println("Ejecting DVD");
  }

  public void pause(){
      System.out.println("The movie is paused");
  }

  public void start(){
      System.out.println("The movie is started");
  }
  
  public void setSurroundSound(){
      amplifier.setSurroundSound();
  }

  public void setStereoSound(){
      amplifier.setStereoSound();
  }

  public boolean isOn() {
    return on;
  }

  public String getMovie() {
    return movie;
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public void setMovie(String movie) {
    this.movie = movie;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }
}





