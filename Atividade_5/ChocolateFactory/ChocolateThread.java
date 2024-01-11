package ChocolateFactory;

public class ChocolateThread implements Runnable{
  
  private ChocolateBoil chocolateboil;
  private int temperature;
  private int cont;

  public ChocolateThread(ChocolateBoil chocolateboil, int temperature){
    this.chocolateboil = chocolateboil;
    this.temperature = temperature;
    this.cont++;
  }

  public void run(){
    while(true){

      if(cont == 10){
        break;
      }else{
        
        chocolateboil.boil(90);

        System.out.println("Temperature:" + temperature);

        chocolateboil.stop();

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        cont++;
      }
    }
  }
}
