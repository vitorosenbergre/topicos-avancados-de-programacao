package src;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import src.ObserverSubject.Servidor.ServerMonitor;
import src.ObserverSubject.Servidor.ServerMonitorImpl;
import src.State.GomaMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Iniciando o servidor RMI
        try {
            GomaMachine gomaMachine = new GomaMachine(10);
            ServerMonitorImpl serverMonitor = new ServerMonitorImpl(gomaMachine);
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/ServerMonitor", serverMonitor);
            System.out.println("Servidor RMI iniciado.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Criando o cliente para se comunicar com o servidor RMI
        try {
            ServerMonitor serverMonitor = (ServerMonitor) Naming.lookup("//localhost/ServerMonitor");
            
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                System.out.println("1. Ver informações da máquina");
                System.out.println("2. Comprar uma goma");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1:
                        String nomeMaquina = serverMonitor.getNomeMaquina();
                        String estadoMaquina = serverMonitor.getEstadoMaquina();
                        int quantidadeGomas = serverMonitor.getQuantidadeGomas();
                        
                        System.out.println(nomeMaquina);
                        System.out.println(estadoMaquina);
                        System.out.println("Quantidade de gomas: " + quantidadeGomas);
                        break;
                        
                    case 2:
                        boolean sucesso = serverMonitor.comprarGoma();
                        
                        if (sucesso) {
                            System.out.println("Goma comprada com sucesso.");
                        } else {
                            System.out.println("Não há gomas disponíveis.");
                        }
                        break;
                        
                    case 3:
                        System.out.println("Encerrando o cliente...");
                        scanner.close();
                        System.exit(0);
                        
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
                
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}