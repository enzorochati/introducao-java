package colecoes.introducao;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Exercicio1 {
    
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        List<String> cores = new ArrayList<String>();

        executarOperacao(cores, scanner);
        
        scanner.close();
    }
    
    public static void executarOperacao(List<String> cores, Scanner scanner) {
    	solicitarCores(scanner, cores);
        exibirCores(cores);
        ordenarCores(cores);
    }

    private static void solicitarCores(Scanner scanner, List<String> cores) {
    	final int NUMEROS_CORES = 5;
        for (int i = 0; i < NUMEROS_CORES; i++) {
            System.out.print("Digite a " + (i + 1) + "ª cor: ");
            cores.add(scanner.nextLine());
        }
    }
    
    private static void exibirCores(List<String> cores) {
        System.out.println("\nListar todas as cores:");
        cores.forEach(System.out::println);
    }
    
    private static void ordenarCores(List<String> cores) {
        System.out.println("\nOrdenar as cores:");
        Collections.sort(cores);
        cores.forEach(System.out::println);
    }
  
} 
