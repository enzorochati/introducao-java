package introducao.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Integer a = 0, b = 0;
		Float soma = 0f, diferenca = 0f, multiplicacao = 0f, divicao = 0f;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("A: ");
		a = scanner.nextInt();
		System.out.print("B: ");
		b = scanner.nextInt();
		soma = (float) a + b;
		diferenca = (float) a - b;
		multiplicacao = (float) a * b;
		divicao = (float) a / b;
		
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
