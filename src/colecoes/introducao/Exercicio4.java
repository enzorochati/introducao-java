package colecoes.introducao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
		final int NUMERO_DE_VEZES = 2;
		executarOperacoesRepetidas(numeros, scanner, NUMERO_DE_VEZES);
		
		scanner.close();
	}	
	 	public static void executarOperacoesRepetidas(Set<Integer> numeros, Scanner scanner, int numeroDeVezes) {
	 		for (int i = 0; i < numeroDeVezes; i++) {
	 			adicionarNumeros(numeros);
	 			exibirNumeros(numeros);
				int numeroDigitado = adicionarNumero(scanner);
				encontrarNumero(numeros, numeroDigitado);
	 		}
	 	}
	
		private static void adicionarNumeros(Set<Integer> numeros) {
			numeros.add(2);
			numeros.add(5);
			numeros.add(1);
			numeros.add(3);
			numeros.add(4);
			numeros.add(9);
			numeros.add(7);
			numeros.add(8);
			numeros.add(10);
			numeros.add(6);
		}
	
		private static void exibirNumeros(Set<Integer> numeros) {
	        System.out.println("\nListar todos os numeros: ");
	        numeros.forEach(System.out::println);
		}
		
		private static int adicionarNumero(Scanner scanner) {
			System.out.print("Digite o número que você deseja encontrar: ");
			int numeroDigitado = scanner.nextInt();
			
			return numeroDigitado;
		}
		
		private static void encontrarNumero(Set<Integer> numeros, int numeroDigitado) {
			boolean encontrado = false;
			
			for(int i = 0; i < numeros.size(); i++) {
				if (numeros.contains(numeroDigitado)) {
					System.out.print("O número " + numeroDigitado + " foi encontrado!");
					encontrado = true;
					break;
				}
			}
			
			if(!encontrado) {
				System.out.print("O número " + numeroDigitado + " não foi encontrado!");
			}
			
		}
}