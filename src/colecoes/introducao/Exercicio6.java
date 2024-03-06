package colecoes.introducao;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio6 {
    public static void main(String[] args) {
        Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    scanner.nextLine();
                    String nomeLivro = scanner.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("Livro adicionado à pilha com sucesso.");
                    break;
                case 2:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("Livros na pilha:");
                        for (String livro : pilhaLivros) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println("Livro " + livroRetirado + " retirado da pilha.");
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
