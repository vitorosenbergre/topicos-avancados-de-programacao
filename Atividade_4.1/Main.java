public class Main {
  public static void main(String[] args) 
  {   
      // pizzaria NY
      PizzaStore nyPizzaStore = new NYStylePizzaStore();

      Pizza pizza = nyPizzaStore.orderPizza("cheese");
      System.out.println("Ethan ordered a " + pizza.getClass().getSimpleName() + "\n");

      pizza = nyPizzaStore.orderPizza("clam");
      System.out.println("Joel ordered a " + pizza.getClass().getSimpleName() + "\n");

      // pizzaria Chicago
      PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

      Pizza pizza2 = chicagoPizzaStore.orderPizza("cheese and bacon");
      System.out.println("Ethan ordered a " + pizza2.getClass().getSimpleName() + "\n");

      pizza2 = chicagoPizzaStore.orderPizza("veggie");
      System.out.println("Joel ordered a " + pizza2.getClass().getSimpleName() + "\n");
  }
}
