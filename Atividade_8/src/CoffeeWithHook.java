package src;
import java.util.Scanner;

public class CoffeeWithHook extends CoffeineBeverage {

  protected void misturar() {
      System.out.println("Misturando café moído");
  }

  protected void adicionarCondimentos() {
    System.out.println("Condimento Adicionado: " + getUserInput());
  }

  protected boolean clienteQuerCondimentos() {
      return true;
  }

  private String getUserInput() {
    String userInput = null;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Você deseja adicionar condimentos? (s/n): ");
      userInput = scanner.nextLine();
    }
    return userInput.toLowerCase();
}
}