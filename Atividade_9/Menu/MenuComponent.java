package Menu;
import java.util.Iterator;

public interface MenuComponent {
  void exibir();
  void adicionar(MenuComponent componente);
  void remover(MenuComponent componente);
  boolean ehVegetariano();
  Iterator<MenuComponent> iterator();
  Object getNome();
}