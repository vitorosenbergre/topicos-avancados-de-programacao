package ChocolateFactory;

public class ChocolateBoil {
  private boolean isBoiling = false;
  private int temperature = 0;
 
  private volatile static ChocolateBoil uniqueInstance;

  private ChocolateBoil() {}

  public static ChocolateBoil getInstance() {
      if (uniqueInstance == null) {
        synchronized (ChocolateBoil.class){
          if(uniqueInstance == null){
            uniqueInstance = new ChocolateBoil();
          }
        }
      }
      return uniqueInstance;
  }

  public void boil(int temperature) {
      if (!isBoiling) {
          this.temperature = temperature;
          isBoiling = true;
          System.out.println("Chocolate is boiling at " + temperature + "°C");
      } else {
          System.out.println("Chocolate is already boiling");
      }
  }

  public void stop() {
      if (isBoiling) {
          isBoiling = false;
          temperature = 0;
          System.out.println("Chocolate boiling stopped");
      } else {
          System.out.println("Chocolate is not boiling");
      }
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  public int getTemperature() {
    return temperature;
  }

}