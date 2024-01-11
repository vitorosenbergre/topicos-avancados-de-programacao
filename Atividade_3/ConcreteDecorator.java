
public class ConcreteDecorator extends Decorator 
{
  public ConcreteDecorator(Component component) 
  {
      super(component);
  }

  @Override
  public void draw() 
  {
      super.draw();
      adicionaFuncionalidadeExtra();
  }

  private void adicionaFuncionalidadeExtra() 
  {
      System.out.println("Adicionando funcionalidade extra...");
  }
}