package introducao.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for (Integer i = 0; i < 2; i++){
			
		System.out.print("Digite o primeiro número: ");
		Float numero1 = scanner.nextFloat();
		System.out.print("Digite o segundo número: ");
		Float numero2 = scanner.nextFloat();
		System.out.print("Digite o terceiro número: ");
		Float numero3 = scanner.nextFloat();
		System.out.print("Digite o quarto número: ");
		Float numero4 = scanner.nextFloat();
		
		Float diferenca = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.println((i+1) + "ª Diferença: " + diferenca + "\n");
		}
		scanner.close();
	}
}
