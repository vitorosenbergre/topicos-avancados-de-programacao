
public class Cliente implements Observador 
{
  private String nome;
  
  public Cliente(String nome) 
  {
    this.nome = nome;
  }
  
  public void atualizar(int novoEstoque) 
  {
    System.out.println("Cliente " + nome + ": O estoque foi atualizado para " + novoEstoque);
  }
}