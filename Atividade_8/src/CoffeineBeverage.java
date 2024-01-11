package src;
public abstract class CoffeineBeverage {
 
  // Este é o Template Method
  public final void preparar() {
      ferverAgua();
      misturar();
      despejarNaXicara();
      adicionarCondimentos();
  }

  // Estas são as operações que as subclasses precisam implementar
  protected abstract void misturar();
  protected abstract void adicionarCondimentos();

  // Estas são as operações comuns a todas as subclasses
  private void ferverAgua() {
      System.out.println("Fervendo água");
  }

  private void despejarNaXicara() {
      System.out.println("Despejando na xícara");
  }
}