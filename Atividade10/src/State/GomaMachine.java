package src.State;
// Classe principal da máquina de venda de goma
public class GomaMachine {
  private State semMoedaState;
  private State comMoedaState;
  private State vendendoState;
  private State semGomaState;
  
  private State estado;
  private int quantidadeGomas;
  
  public GomaMachine(int quantidadeGomas) {
      semMoedaState = new SemMoedaState(this);
      comMoedaState = new ComMoedaState(this);
      vendendoState = new VendendoState(this);
      semGomaState = new SemGomaState(this);
      
      this.quantidadeGomas = quantidadeGomas;
      if (quantidadeGomas > 0) {
          estado = semMoedaState;
      } else {
          estado = semGomaState;
      }
  }
  
  public void inserirMoeda() {
      estado.inserirMoeda();
  }
  
  public void ejetarMoeda() {
      estado.ejetarMoeda();
  }
  
  public void virarManivela() {
      estado.virarManivela();
      estado.dispensar();
  }
  
  public void liberarGoma() {
      System.out.println("Uma goma rolando para fora...");
      quantidadeGomas--;
  }
  
  public int getQuantidadeGomas() {
      return quantidadeGomas;
  }
  
  public State getEstado() {
      return estado;
  }
  
  public void setEstado(State estado) {
      this.estado = estado;
  }
  
  public State getSemMoedaState() {
      return semMoedaState;
  }
  
  public State getComMoedaState() {
      return comMoedaState;
  }
  
  public State getVendendoState() {
      return vendendoState;
  }
  
  public State getSemGomaState() {
      return semGomaState;
  }

  public synchronized boolean comprarGoma() {
    if (quantidadeGomas > 0) {
        quantidadeGomas--;
        return true;
    } else {
        return false;
    }
}
}