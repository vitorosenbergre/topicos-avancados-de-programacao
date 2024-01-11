package src.State;
// Implementação do estado "ComMoeda"
public class ComMoedaState implements State {
  private GomaMachine gomaMachine;
  
  public ComMoedaState(GomaMachine gomaMachine) {
      this.gomaMachine = gomaMachine;
  }
  
  public void inserirMoeda() {
      System.out.println("Você já inseriu uma moeda.");
  }
  
  public void ejetarMoeda() {
      System.out.println("Moeda devolvida.");
      gomaMachine.setEstado(gomaMachine.getSemMoedaState());
  }
  
  public void virarManivela() {
      System.out.println("Você virou a manivela...");
      gomaMachine.setEstado(gomaMachine.getVendendoState());
      gomaMachine.virarManivela();
  }
  
  public void dispensar() {
      System.out.println("Nenhuma goma dispensada.");
  }
}

