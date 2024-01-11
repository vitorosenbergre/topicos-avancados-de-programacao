package src;

public class CDPlayer {
  private boolean on;
  private String music;
  private Amplifier amplifier;

  CDPlayer(Amplifier amplifier){
    this.amplifier = amplifier;
  }

  public void on(){
    on = true;
    System.out.println("The CD Player is on");
  }

  public void off(){
    on = false;
    System.out.println("The CD player is off");
  }

  public void play(String music){
    this.music = music;
    System.out.println("Playing Music " + music);
  }

  public void eject(){
    music = null;
    System.out.println("The music was ejected");
  }

  public void stop(){
    music = null;
    System.out.println("The music was stoped");
  }

  public void pause(){
    System.out.println("The music is paused");
  }

  public void start(){
    System.out.println("The music is started");
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

  public String getMusic() {
    return music;
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public void setMusic(String music) {
    this.music = music;
  }

  public Amplifier getAmplifier() {
    return amplifier;
  }

  public void setAmplifier(Amplifier amplifier) {
    this.amplifier = amplifier;
  }
}
