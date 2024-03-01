package introducao.repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Integer numero = 0, soma = 0;

		do {

			System.out.print("Digite um número: ");
			numero = scanner.nextInt();

			if (numero > 0) {
				soma += numero;
			}

		} while (!(numero == 0));

		System.out.print("\nA soma dos números positivos é: " + soma);
		scanner.close();
	}
}
