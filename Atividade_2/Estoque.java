import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private int estoqueAtual;
    private List<Observador> observadores = new ArrayList<Observador>();
    
    public void adicionarObservador(Observador observador) 
    {
      observadores.add(observador);
    }
    
    public void removerObservador(Observador observador) 
    {
      observadores.remove(observador);
    }
    
    public void notificarObservadores() 
    {
      for (Observador observador : observadores) 
      {
        observador.atualizar(estoqueAtual);
      }
    }
    
    public void setEstoqueAtual(int estoqueAtual) 
    {
      this.estoqueAtual = estoqueAtual;
      notificarObservadores();
    }
    
    public int getEstoqueAtual() 
    {
      return estoqueAtual;
    }
}