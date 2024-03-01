package introducao.repeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (Integer i = 0; i < 4; i++) {

			System.out.println("Digite o primeiro número do intervalo: ");
			Integer numero1 = scanner.nextInt();
			System.out.println("Digite o primeiro número do intervalo: ");
			Integer numero2 = scanner.nextInt();

			if (numero1 < numero2) {
				System.out.printf("No Intervalo entre %d e %d:\n\n", numero1, numero2);

				for (Integer j = numero1; j <= numero2; j++) {
					if (j % 3 == 0 && j % 5 == 0) {
						System.out.println(j + " é múltiplo de 3 e 5");
					}
				}
			} else {
				System.out.print("Intervalo inválido!\n");
			}
		}
		scanner.close();
	}
}
