package CoffeMenu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import Menu.MenuComponent;
import Menu.MenuItem;

// Menu Café
class CoffeMenu implements MenuComponent {
    private Map<String, MenuComponent> componentes;

    public void CafeMenu() {
        this.componentes = new HashMap<>();
        adicionar(new MenuItem("Café Preto", "Café preto forte", false));
        adicionar(new MenuItem("Cappuccino", "Cappuccino com espuma de leite", false));
        adicionar(new MenuItem("Sanduíche Vegano", "Sanduíche vegano com legumes frescos", true));
    }

    @Override
    public void adicionar(MenuComponent menuItem) {
        componentes.put(menuItem.getNome().toString(), menuItem);
    }

    @Override
    public void remover(MenuComponent componente) {
        componentes.remove(componente.getNome());
    }

    public void exibir() {
        System.out.println("\nCafé Menu\n-----------------------------");
        for (MenuComponent componente : componentes.values()) {
            componente.exibir();
        }
    }

    public Iterator<MenuComponent> iterator() {
        return componentes.values().iterator();
    }

    public boolean ehVegetariano() {
        for (MenuComponent componente : componentes.values()) {
            if (componente.ehVegetariano()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object getNome() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("No need");
    }
}

