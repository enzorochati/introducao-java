package introducao.condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		Integer numero = scanner.nextInt();
		
		if (numero % 2 == 0 && numero >= 0) {
			System.out.printf("O Número %d é par e positivo!", numero);
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.printf("O Número %d é par e negativo!", numero);
		} else if (numero % 2 != 0 && numero >= 0) {
			System.out.printf("O Número %d é ímpar e positivo!", numero);
		} else {
			System.out.printf("O Número %d é ímpar e negativo!", numero);
		}
		scanner.close();
	}
}
