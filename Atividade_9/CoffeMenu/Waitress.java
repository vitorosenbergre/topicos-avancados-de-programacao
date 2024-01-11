package CoffeMenu;

import java.util.Iterator;
import Menu.MenuComponent;

// Garçonete
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
            if (componente.ehVegetariano()) {
                componente.exibir();
            }
        }
    }
}
