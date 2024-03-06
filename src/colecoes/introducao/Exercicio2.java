package colecoes.introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
   
        final int NUMERO_DE_VEZES = 2;
        executarOperacoesRepetidas(numeros, scanner, NUMERO_DE_VEZES);
        
        scanner.close();
    }
    
    
    public static void executarOperacoesRepetidas(List<Integer> numeros, Scanner scanner, int numeroDeVezes) {
    	adicionarNumerosIniciais(numeros);
        for(int i = 0; i < numeroDeVezes; i++) {
        exibirNumeros(numeros);
        int numeroDigitado = solicitarNumeroDoUsuario(scanner);
        buscarNumero(numeros, numeroDigitado);
        }
    }
    
    private static void adicionarNumerosIniciais(List<Integer> numbers) {
    		numbers.add(2);
    		numbers.add(5);
        	numbers.add(1);
        	numbers.add(3);
        	numbers.add(4);
        	numbers.add(9);
        	numbers.add(7);
        	numbers.add(8);
        	numbers.add(10);
        	numbers.add(6);
    }
    
    private static void exibirNumeros(List<Integer> numeros) {
    	System.out.print("Listar: ");
        System.out.println(numeros);
    }
    
    private static int solicitarNumeroDoUsuario(Scanner scanner) {
    	System.out.print("\nDigite o número que você deseja encontrar: ");
    	int numeroDigitado = scanner.nextInt(); 
        return numeroDigitado;
    }
    
    private static void buscarNumero(List<Integer> numeros, int numeroDigitado) {
		if (numeros.contains(numeroDigitado)) {
            System.out.println("\nO número " + numeroDigitado + " está localizado na posição: " + numeros.indexOf(numeroDigitado));
        } else {
            System.out.println("\nO número " + numeroDigitado + " não foi encontrado!");
        }
	}
    
}
