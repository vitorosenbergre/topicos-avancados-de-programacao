public class ChicagoStyleCheeseAndBaconPizza implements Pizza{
  
  @Override
  public void prepare() 
  {
      System.out.println("Preparing Chicago Style Cheese and Bacon Pizza");
  }

  @Override
  public void bake() 
  {
      System.out.println("Baking Chicago Style Cheese and Bacon Pizza");
  }

  @Override
  public void cut() 
  {
      System.out.println("Cutting Chicago Style Cheese and Bacon Pizza");
  }

  @Override
  public void box() 
  {
      System.out.println("Boxing Chicago Style Cheese and Bacon Pizza");
  }
}
