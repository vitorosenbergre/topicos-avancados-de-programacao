package src.State;
// Implementação do estado "SemGoma"
public class SemGomaState implements State {
  private GomaMachine gomaMachine;
  
  public SemGomaState(GomaMachine gomaMachine) {
      this.gomaMachine = gomaMachine;
  }
  
  public void inserirMoeda() {
      System.out.println("Desculpe, não podemos dispensar gomas, estamos sem estoque.");
  }
  
  public void ejetarMoeda() {
      System.out.println("Não há moeda inserida.");
  }
  
  public void virarManivela() {
      System.out.println("Não há gomas disponíveis.");
  }
  
  public void dispensar() {
      System.out.println("Não há gomas disponíveis.");
  }

  public GomaMachine getGomaMachine() {
    return gomaMachine;
  }

  public void setGomaMachine(GomaMachine gomaMachine) {
    this.gomaMachine = gomaMachine;
  }

}
