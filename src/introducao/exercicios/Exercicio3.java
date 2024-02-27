package introducao.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o Salário Bruto: ");
		Float salarioBruto = scanner.nextFloat();
		System.out.print("Digite o Adicional Noturno: ");
		Float adcionalNoturno = scanner.nextFloat();
		System.out.print("Digite as Horas Extras: ");
		Float horasExtras = scanner.nextFloat();
		System.out.print("Digite os Descontos: ");
		Float desconto = scanner.nextFloat();
		
		Float salarioLiquido = salarioBruto + adcionalNoturno + (horasExtras * 5) - desconto;
		
		System.out.printf("\nSalário Líquido: %.2f", salarioLiquido);

		scanner.close();

	}
}
