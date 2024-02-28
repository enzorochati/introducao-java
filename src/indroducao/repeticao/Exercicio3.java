package indroducao.repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer menorIdade21 = 0, maiorIdade50 = 0, idade = 0;

		while (idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = scanner.nextInt();

			if (idade >= 0 && idade < 21) {
				menorIdade21++;
			} else if (idade > 50) {
				maiorIdade50++;
			}
		}

		System.out.printf("""

				Total de pessoas menores de 21 anos: %d

				Total de pessoas maiores de 50 anos: %d
				""", menorIdade21, maiorIdade50);
		scanner.close();
	}
}
