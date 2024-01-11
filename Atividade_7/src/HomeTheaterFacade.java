package src;

public class HomeTheaterFacade {
  private Amplifier amp;
  private Tuner tuner;
  private DVDPlayer dvd;
  private Projector projector;
  private Screen screen;
  private TheaterLights lights;
  private PopcornPopper popper;

  public HomeTheaterFacade(Amplifier amp, Tuner tuner, DVDPlayer dvd,
      Projector projector, Screen screen, TheaterLights lights,
      PopcornPopper popper) {
      this.amp = amp;
      this.tuner = tuner;
      this.dvd = dvd;
      this.projector = projector;
      this.screen = screen;
      this.lights = lights;
      this.popper = popper;
  }

  public void watchMovie(String movie) {
      System.out.println("Get ready to watch a movie...");
      popper.on();
      popper.pop();
      lights.dim(10);
      screen.down();
      projector.on();
      projector.setInput(dvd);
      projector.wideScreenMode();
      amp.on();
      amp.setDvd(dvd);
      amp.setSurroundSound();
      amp.setVolume(5);
      dvd.on();
      dvd.play(movie);
  }

  public void endMovie() {
      System.out.println("Shutting movie theater down...");
      popper.off();
      lights.on();
      screen.up();
      projector.off();
      amp.off();
      dvd.stop();
      dvd.eject();
      dvd.off();
  }

  public void listenToRadio(double frequency) {
      System.out.println("Tuning in the airwaves...");
      tuner.on();
      tuner.setFrequency(frequency);
      amp.on();
      amp.setVolume(5);
      amp.setTuner(tuner);
  }

  public void endRadio() {
      System.out.println("Shutting down the tuner...");
      tuner.off();
      amp.off();
  }
}
