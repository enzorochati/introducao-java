package colecoes.introducao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
		final int NUMERO_DE_VEZES = 2;
		repetirProcesso(numeros, scanner, NUMERO_DE_VEZES);
		
		scanner.close();
	}
	
	public static void repetirProcesso(Set<Integer> numeros, Scanner scanner, int numeroDeVezes) {
        for (int i = 0; i < numeroDeVezes; i++) {
        	adicionarNumeros(numeros, scanner);
        	exibirNumeros(numeros);
        	repetirNumeros(numeros);
            numeros.clear();
        }
    }
	
	public static void adicionarNumeros(Set<Integer> numeros, Scanner scanner) {
		final int DIGITAR_NUMEROS = 10;
		for(int i = 0; i < DIGITAR_NUMEROS; i++) {
			System.out.print("Digitar o " + (i+1) + "º numero: ");
			numeros.add(scanner.nextInt());
		}
	}
	
	public static void exibirNumeros(Set<Integer> numeros) {
		System.out.println("\nSet: " + numeros);
	}
	
	public static void repetirNumeros(Set<Integer> numeros) {
		Iterator<Integer> iterator = numeros.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
