package Menu;
import java.util.Iterator;

class Waitress {
  private MenuComponent todosMenus;

  public Waitress(MenuComponent todosMenus) {
      this.todosMenus = todosMenus;
  }

  public void imprimirMenu() {
      todosMenus.exibir();
  }

  public void imprimirMenuVegetariano() {
      System.out.println("\nOpções vegetarianas:");
      Iterator<MenuComponent> iterator = todosMenus.iterator();
      while (iterator.hasNext()) {
          MenuComponent componente = iterator.next();
          try {
              if (componente instanceof MenuItem && componente.ehVegetariano()) {
                  componente.exibir();
              }
          } catch (UnsupportedOperationException e) {
              // Ignorar exceção - não é aplicável para menus compostos
          }
      }
  }
}