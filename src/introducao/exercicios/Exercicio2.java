package introducao.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		final Integer NUMEROS_DE_NOTAS = 4;
		Float nota = 0f, soma = 0f, media = 0f;
		Scanner scanner = new Scanner(System.in);
		
		for (Integer i = 0; i < NUMEROS_DE_NOTAS; i++){
			System.out.print("Digite a " + (i+1) + "ª Nota: ");
			nota = scanner.nextFloat();
			soma += nota;
		}

		media = soma / NUMEROS_DE_NOTAS;

		System.out.printf("\nMédia final: %.1f", media);
		scanner.close();
	}
}
