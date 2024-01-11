package src.ObserverSubject.Servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import src.State.*;

// Implementação do ServerMonitor
public class ServerMonitorImpl extends UnicastRemoteObject implements ServerMonitor {
    private GomaMachine gomaMachine;
    
    public ServerMonitorImpl(GomaMachine gomaMachine) throws RemoteException {
        this.gomaMachine = gomaMachine;
    }
    
    public String getNomeMaquina() throws RemoteException {
        return "Nome da máquina: Máquina de Goma";
    }
    
    public String getEstadoMaquina() throws RemoteException {
        return "Estado da máquina: " + gomaMachine.getEstado().getClass().getSimpleName();
    }
    
    public int getQuantidadeGomas() throws RemoteException {
        return gomaMachine.getQuantidadeGomas();
    }

    @Override
    public boolean comprarGoma() throws RemoteException {
        return gomaMachine.comprarGoma();
    }
}