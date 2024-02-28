package indroducao.repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer par = 0, impar = 0;

		for (Integer i = 0; i < 10; i++) {

			System.out.print("Digite o " + (i + 1) + "º número: ");
			Integer numero = scanner.nextInt();

			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}

		System.out.printf("""

				Total de números pares: %d

				Total de números ímpares: %d
				""", par, impar);
		scanner.close();
	}
}
