package colecoes.introducao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: Chamar (retirar) uma pessoa da fila");
            System.out.println("0: Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Cliente: ");
                    scanner.nextLine();
                    String nomeCliente = scanner.nextLine();
                    filaClientes.offer(nomeCliente);
                    System.out.println("Cliente adicionado à fila com sucesso.");
                    break;
                case 2:
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Clientes na fila:");
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        String clienteChamado = filaClientes.poll();
                        System.out.println("Cliente " + clienteChamado + " chamado e retirado da fila.");
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
