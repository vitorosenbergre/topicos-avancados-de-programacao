package src.ObserverSubject.Servidor;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import src.State.*;

// Classe principal para iniciar o servidor RMI
public class Servidor {
    public static void main(String[] args) {
        try {
            GomaMachine gomaMachine = new GomaMachine(5);
            ServerMonitorImpl serverMonitor = new ServerMonitorImpl(gomaMachine);
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/ServerMonitor", serverMonitor);
            System.out.println("Servidor RMI iniciado.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
