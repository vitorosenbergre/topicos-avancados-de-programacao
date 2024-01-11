package src.ObserverSubject.Servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Interface remota para comunicação com o ServerMonitor
public interface ServerMonitor extends Remote {
    String getNomeMaquina() throws RemoteException;
    String getEstadoMaquina() throws RemoteException;
    int getQuantidadeGomas() throws RemoteException;
    boolean comprarGoma() throws RemoteException;
}
