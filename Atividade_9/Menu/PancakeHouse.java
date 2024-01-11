package Menu;
class PancakeHouseMenu extends Menu {
  public PancakeHouseMenu(String nome) {
      super(nome);
      adicionar(new MenuItem("Pancake de Blueberry", "Panquecas de blueberry frescas e suculentas", true));
      adicionar(new MenuItem("Pancake de Banana", "Panquecas de banana caramelizadas", true));
      adicionar(new MenuItem("Pancake de Chocolate", "Panquecas de chocolate com calda de chocolate",true));
  }
}