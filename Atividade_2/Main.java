public class Main {
  public static void main(String[] args) 
  {
      Estoque estoque = new Estoque();
      
      Cliente cliente1 = new Cliente("João");
      Cliente cliente2 = new Cliente("Maria");
      
      estoque.adicionarObservador(cliente1);
      estoque.adicionarObservador(cliente2);
      
      estoque.setEstoqueAtual(10);
      estoque.setEstoqueAtual(5);
  }
}