package src.ObserverSubject.Observer;
import java.util.ArrayList;
import java.util.List;

// Implementação do Subject (Observable)
public class GomaMachineObserver implements Subject {
  private List<Observer> observers;
  private int quantidadeGomas;
  
  public GomaMachineObserver(int quantidadeGomas) {
      observers = new ArrayList<>();
      this.quantidadeGomas = quantidadeGomas;
  }
  
  public void registrarObserver(Observer observer) {
      observers.add(observer);
  }
  
  public void removerObserver(Observer observer) {
      observers.remove(observer);
  }
  
  public void notificarObservers() {
      for (Observer observer : observers) {
          observer.atualizar(quantidadeGomas);
      }
  }
  
  public void setQuantidadeGomas(int quantidadeGomas) {
      this.quantidadeGomas = quantidadeGomas;
      notificarObservers();
  }
}
