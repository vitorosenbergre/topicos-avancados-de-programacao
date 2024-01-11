package ChocolateFactory;

public class Main {
    public static void main(String[] args) {
      
      ChocolateBoil chocolateBoil = ChocolateBoil.getInstance();

      Thread thread1 = new Thread(new ChocolateThread(chocolateBoil, 90));
      Thread thread2 = new Thread(new ChocolateThread(chocolateBoil, 95));
      Thread thread3 = new Thread(new ChocolateThread(chocolateBoil, 100));


      thread1.start();
      thread2.start();
      thread3.start();
      
    }
}
