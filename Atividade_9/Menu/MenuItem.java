package Menu;
import java.util.Iterator;

public class MenuItem implements MenuComponent {
  private String nome;
  private String descricao;
  private boolean vegetarian;

  public MenuItem(String nome, String descricao, boolean vegetarian) {
      this.nome = nome;
      this.descricao = descricao;
      this.vegetarian = vegetarian;
  }

  public void exibir() {
      System.out.println(nome + " - " + descricao);
  }

  public void adicionar(MenuComponent componente) {
      // Não é aplicável para um item de menu
  }

  public void remover(MenuComponent componente) {
      // Não é aplicável para um item de menu
  }

  public Iterator<MenuComponent> iterator() {
      return new NullIterator();
  }

  @Override
  public boolean ehVegetariano() {
    return vegetarian;
  }

  public String getNome() {
    return null;
  }
}