package introducao.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("A: ");
		Integer a = scanner.nextInt();
		System.out.print("B: ");
		Integer b = scanner.nextInt();
		
		Float soma = (float) a + b;
		Float diferenca = (float) a - b;
		Float multiplicacao = (float) a * b;
		Float divicao = (float) a / b;
		
		System.out.printf("""
			Soma: %.1f
			Diferenca: %.1f
			Multiplicacao: %.2f
			Divisao: %.3f
			""", soma, diferenca, multiplicacao, divicao);
		
		System.out.print((a > b) ? "\nA variável A é Maior que a Variável B" : "\nA variável B é Maior que a Variável A");
		scanner.close();
	}
}
