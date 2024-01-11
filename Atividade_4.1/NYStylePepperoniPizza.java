public class NYStylePepperoniPizza implements Pizza 
{
  @Override
  public void prepare() 
  {
      System.out.println("Preparing NY Style Pepperoni Pizza");
  }

  @Override
  public void bake() 
  {
      System.out.println("Baking NY Style Pepperoni Pizza");
  }

  @Override
  public void cut() 
  {
      System.out.println("Cutting NY Style Pepperoni Pizza");
  }

  @Override
  public void box() 
  {
      System.out.println("Boxing NY Style Pepperoni Pizza");
  }
}
