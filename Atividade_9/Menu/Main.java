package Menu;

public class Main {
  public static void main(String[] args) {
      MenuComponent menuPrincipal = new Menu("Menu Principal");
      MenuComponent menuBebidas = new Menu("Bebidas");
      MenuComponent menuJantar = new Menu("Menu Jantar");
      MenuComponent menuCafeteria = new PancakeHouseMenu("Menu Pancake House");

      MenuComponent item1 = new MenuItem("Hambúrguer", "Delicioso hambúrguer com queijo e bacon",false);
      MenuComponent item2 = new MenuItem("Pizza", "Pizza de pepperoni com massa fina",false);
      MenuComponent item3 = new MenuItem("Refrigerante", "Coca-Cola gelada",true);
      MenuComponent item4 = new MenuItem("Cerveja", "Cerveja artesanal local",true);

      menuPrincipal.adicionar(item1);
      menuPrincipal.adicionar(item2);
      menuBebidas.adicionar(item3);
      menuBebidas.adicionar(item4);

      menuJantar.adicionar(menuPrincipal);
      menuJantar.adicionar(menuBebidas);
      menuJantar.adicionar(menuCafeteria);

      Waitress garconete = new Waitress(menuJantar);
      garconete.imprimirMenu();
      garconete.imprimirMenuVegetariano();
  }
}
