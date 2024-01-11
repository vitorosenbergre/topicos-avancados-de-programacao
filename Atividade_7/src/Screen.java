package src;

public class Screen {
  private String description;
  private int size;

  public Screen(String description, int size) {
      this.description = description;
      this.size = size;
  }

  public void up() {
      System.out.println("Screen is moving up");
      // código para mover a tela para cima
  }

  public void down() {
      System.out.println("Screen is moving down");
      // código para mover a tela para baixo
  }

  public String getDescription() {
    return description;
  }

  public int getSize() {
    return size;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setSize(int size) {
    this.size = size;
  }

  
}
