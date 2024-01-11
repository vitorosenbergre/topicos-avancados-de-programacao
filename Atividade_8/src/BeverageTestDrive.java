package src;
public class BeverageTestDrive {

  public static void main(String[] args) {
      CoffeeWithHook coffee = new CoffeeWithHook();
      Tea tea = new Tea();

      System.out.println("\nPreparando café...");
      coffee.preparar();

      System.out.println("\nPreparando chá...");
      tea.preparar();
  }
}