package introducao.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o Salário: ");
		Float salario = scanner.nextFloat();
		System.out.print("Digite o Abono: ");
		Float abono = scanner.nextFloat();
		
		Float novoSalario = salario + abono;
		
		System.out.printf("\nNovo Salário: %.2f", novoSalario);
		scanner.close();
	}
}
