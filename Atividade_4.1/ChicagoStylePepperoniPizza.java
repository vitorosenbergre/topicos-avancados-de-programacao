public class ChicagoStylePepperoniPizza implements Pizza{
  
  @Override
  public void prepare() 
  {
      System.out.println("Preparing Chicago Style Pepperoni and Anchovies and Bacon Pizza");
  }

  @Override
  public void bake() 
  {
      System.out.println("Baking Chicago Style Pepperoni and Anchovies and Bacon Pizza");
  }

  @Override
  public void cut() 
  {
      System.out.println("Cutting Chicago Style Pepperoni and Anchovies and Bacon Pizza");
  }

  @Override
  public void box() 
  {
      System.out.println("Boxing Chicago Style Pepperoni and Anchovies and Bacon Pizza");
  }

}
