
public class Main 
{
  public static void main(String[] args) 
  {
      // criando um componente concreto
      Component componente1 = new ConcreteComponent();
      componente1.draw(); // saída: "Desenhando um componente concreto..."

      // criando um componente decorado com funcionalidade extra
      Component componente2 = new ConcreteDecorator(new ConcreteComponent());
      componente2.draw(); // saída: "Desenhando um componente concreto..." seguido de "Adicionando funcionalidade extra..."
  }
}
