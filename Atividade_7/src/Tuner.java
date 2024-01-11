package src;

import java.util.ArrayList;
import java.util.List;

public class Tuner {
  private String brand;
  private boolean on;
  private double currentFrequency;
  private List<String> programmedStations;
  private Amplifier amplifier;
  private boolean autoTune;
  private int favoriteStationIndex;
  
  public Tuner(String brand, Amplifier amplifier) {
      this.currentFrequency = 87.5;
      this.programmedStations = new ArrayList<>();
      this.amplifier = amplifier;
      this.autoTune = false;
      this.brand = brand;
  }  

  public void on(){
      this.on = true;
      System.out.println("The Tuner is On");
  }

  public void off(){
      this.on = false;
      System.out.println("The Tuner is Off");
  }

  public void tune(double frequency) {
      System.out.println("Tuning to frequency: " + frequency);
      // código para sintonizar o sintonizador para a frequência especificada
  }

  public void addStation(String station) {
      this.programmedStations.add(station);
      System.out.println("Station " + station + " added");
  }

  public void removeStation(String station) {
      this.programmedStations.remove(station);
      System.out.println("Station " + station + " removed");
  }

  public void showProgrammedStations() {
      System.out.println("Programmed stations:");
      for (String station : this.programmedStations) {
          System.out.println("- " + station);
      }
  }

  public void scan(){
      System.out.println("Found stations:");
      for (String station : this.programmedStations) {
          System.out.println("- " + station);
      }
  }

  public void setAutoTune(boolean autoTune) {
    this.autoTune = autoTune;
    if (autoTune) {
        System.out.println("Auto-tune enabled");
        // código para ativar a varredura automática de frequências
    } else {
        System.out.println("Auto-tune disabled");
        // código para desativar a varredura automática de frequências
    }
  }

  public void setFavoriteStation(int index) {
    if (index >= 0 && index < this.programmedStations.size()) {
        this.favoriteStationIndex = index;
        System.out.println("Favorite station set to " + this.programmedStations.get(index));
    } else {
        System.out.println("Invalid index");
    }
}

  public String getFavoriteStation() {
    if (this.favoriteStationIndex != -1) {
        return this.programmedStations.get(this.favoriteStationIndex);
    } else {
        return null;
    }
  }

  public void setVolume(int volume){
      amplifier.setVolume(volume);
  }

  public void setAmplifier(Amplifier amplifier) {
    this.amplifier = amplifier;
  }

  public void setFrequency(double currentFrequency) {
    this.currentFrequency = currentFrequency;
  }

  public void setProgrammedStations(List<String> programmedStations) {
    this.programmedStations = programmedStations;
  }

  public double getCurrentFrequency() {
    return currentFrequency;
  }

  public List<String> getProgrammedStations() {
    return programmedStations;
  }

  public Amplifier getAmplifier() {
    return amplifier;
  }

  public boolean isAutoTune() {
    return autoTune;
  }

  public boolean isOn() {
    return on;
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }
}