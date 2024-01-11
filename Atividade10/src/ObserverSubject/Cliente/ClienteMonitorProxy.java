package src.ObserverSubject.Cliente;

import java.rmi.Naming;
import src.ObserverSubject.Servidor.*;

// ClienteMonitorProxy que utiliza o RMI para se comunicar com o ServerMonitor
public class ClienteMonitorProxy {
    public static void main(String[] args) {
        try {
            ServerMonitor serverMonitor = (ServerMonitor) Naming.lookup("//localhost/ServerMonitor");
            String nomeMaquina = serverMonitor.getNomeMaquina();
            String estadoMaquina = serverMonitor.getEstadoMaquina();
            int quantidadeGomas = serverMonitor.getQuantidadeGomas();
            
            System.out.println(nomeMaquina);
            System.out.println(estadoMaquina);
            System.out.println("Quantidade de gomas: " + quantidadeGomas);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
