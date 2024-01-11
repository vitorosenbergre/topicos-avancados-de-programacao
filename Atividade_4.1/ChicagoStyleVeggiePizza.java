public class ChicagoStyleVeggiePizza implements Pizza{
  @Override
  public void prepare() 
  {
      System.out.println("Preparing Chicago Style Veggie and Bacon Pizza");
  }

  @Override
  public void bake() 
  {
      System.out.println("Baking Chicago Style Veggie and Bacon Pizza");
  }

  @Override
  public void cut() 
  {
      System.out.println("Cutting Chicago Style Veggie and Bacon Pizza");
  }

  @Override
  public void box() 
  {
      System.out.println("Boxing Chicago Style Veggie and Bacon Pizza");
  }
}
