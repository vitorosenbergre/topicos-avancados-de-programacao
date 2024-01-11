public class ChicagoStylePizzaStore extends PizzaStore
{
  @Override
  protected Pizza createPizza(String type) 
  {
    if (type.equals("cheese and bacon")) 
    {
        return new ChicagoStyleCheeseAndBaconPizza();
    } 
    else if (type.equals("pepperoni and anchovies")) 
    {
        return new ChicagoStylePepperoniPizza();
    } 
    else if (type.equals("veggie")) 
    {
        return new ChicagoStyleVeggiePizza();
    } 
    else 
    {
        return null;
    }
  }
}
