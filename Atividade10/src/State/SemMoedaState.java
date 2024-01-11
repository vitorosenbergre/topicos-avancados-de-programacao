package src.State;
public class SemMoedaState implements State {
  private GomaMachine gomaMachine;
  
  public SemMoedaState(GomaMachine gomaMachine) {
      this.gomaMachine = gomaMachine;
  }
  
  public void inserirMoeda() {
      System.out.println("Você inseriu uma moeda.");
      gomaMachine.setEstado(gomaMachine.getComMoedaState());
  }
  
  public void ejetarMoeda() {
      System.out.println("Você não inseriu uma moeda.");
  }
  
  public void virarManivela() {
      System.out.println("Você virou a manivela, mas não há moeda.");
  }
  
  public void dispensar() {
      System.out.println("Você precisa pagar primeiro.");
  }
}