package Menu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Menu implements MenuComponent {
  private String nome;
  private List<MenuComponent> componentes;

  public Menu(String nome) {
      this.nome = nome;
      this.componentes = new ArrayList<>();
  }

  public void adicionar(MenuComponent componente) {
      componentes.add(componente);
  }

  public void remover(MenuComponent componente) {
      componentes.remove(componente);
  }

  public void exibir() {
      System.out.println("\n" + nome + "\n-----------------------------");
      for (MenuComponent componente : componentes) {
          componente.exibir();
      }
  }

  public Iterator<MenuComponent> iterator() {
      return new CompositeIterator(componentes.iterator());
  }

  @Override
  public boolean ehVegetariano() {
    throw new UnsupportedOperationException("No need");
  }

  @Override
  public Object getNome() {
    return nome;
  }
}
