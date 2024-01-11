package src.ObserverSubject.Cliente;
import src.ObserverSubject.Observer.GomaMachineObserver;
import src.ObserverSubject.Observer.Observer;

// Implementação do Observer
class ClienteMonitor implements Observer {
  private GomaMachineObserver gomaMachineObserver;

  public ClienteMonitor(GomaMachineObserver gomaMachineObserver) {
      this.gomaMachineObserver = gomaMachineObserver;
      gomaMachineObserver.registrarObserver(this);
  }
  
  public void atualizar(int quantidadeGomas) {
      System.out.println("Quantidade de gomas: " + quantidadeGomas);
  }

  public GomaMachineObserver getGomaMachineObserver() {
    return gomaMachineObserver;
  }

  public void setGomaMachineObserver(GomaMachineObserver gomaMachineObserver) {
    this.gomaMachineObserver = gomaMachineObserver;
  }
}