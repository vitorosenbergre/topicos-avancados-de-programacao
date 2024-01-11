package src.State;
// Implementação do estado "Vendendo"
public class VendendoState implements State {
  private GomaMachine gomaMachine;
  
  public VendendoState(GomaMachine gomaMachine) {
      this.gomaMachine = gomaMachine;
  }
  
  public void inserirMoeda() {
      System.out.println("Por favor, aguarde, já estamos dispensando uma goma para você.");
  }
  
  public void ejetarMoeda() {
      System.out.println("Desculpe, você já virou a manivela.");
  }
  
  public void virarManivela() {
      System.out.println("Virar duas vezes não lhe dará outra goma!");
  }
  
  public void dispensar() {
      System.out.println("Uma goma está sendo dispensada...");
      gomaMachine.liberarGoma();
      if (gomaMachine.getQuantidadeGomas() > 0) {
          gomaMachine.setEstado(gomaMachine.getSemMoedaState());
      } else {
          System.out.println("Oops, todas as gomas acabaram!");
          gomaMachine.setEstado(gomaMachine.getSemGomaState());
      }
  }
}
