package CoffeMenu;

import Menu.MenuComponent;

public class Main {
  public static void main(String[] args) {
      // Criar o menu do café
      MenuComponent menuCafe = new CoffeMenu();

      // Criar a garçonete com o menu do café
      Waitress garconete = new Waitress(menuCafe);

      // Exibir o menu completo
      garconete.imprimirMenu();

      // Exibir as opções vegetarianas
      garconete.imprimirMenuVegetariano();
  }
}