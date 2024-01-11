package src.State;
// Interface do estado da máquina de venda de goma
public interface State {
    void inserirMoeda();
    void ejetarMoeda();
    void virarManivela();
    void dispensar();
}