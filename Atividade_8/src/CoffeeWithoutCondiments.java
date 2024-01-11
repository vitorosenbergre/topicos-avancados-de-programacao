package src;
public class CoffeeWithoutCondiments extends CoffeeWithHook {

  protected void adicionarCondimentos() {
      // Não faz nada
  }

  protected boolean clienteQuerCondimentos() {
      return false;
  }
}