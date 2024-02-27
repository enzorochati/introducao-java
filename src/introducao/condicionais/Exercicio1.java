package introducao.condicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		Integer a = scanner.nextInt();
		System.out.print("Digite o número B: ");
		Integer b = scanner.nextInt();
		System.out.print("Digite o número C: ");
		Integer c = scanner.nextInt();
		
		Integer soma = a + b;
		
		if (soma > c){
			System.out.printf("""
			%d + %d = %d > %d
			A Soma de A + B é Maior do que C
			""", b, a, soma, c);
		} else if (soma < c){
			System.out.printf("""
					%d + %d = %d > %d
					A Soma de A + B é Menor do que C
					""", b, a, soma, c);
		} else {
			System.out.printf("""
					%d + %d = %d > %d
					A Soma de A + B é Igual do que C
					""", b, a, soma, c);
		}
		scanner.close();
	}
}
