package introducao.condicionais;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        for (Integer i = 0; i < 5; i++) {
        	
            System.out.print("Digite o 1º número: ");
            Float numero1 = scanner.nextFloat();
            System.out.print("Digite o 2º número: ");
            Float numero2 = scanner.nextFloat();
            System.out.print("Operação: ");
            Integer codigoOperacao = scanner.nextInt();
            Float operacao = 0.0f;

            	switch (codigoOperacao) {
                	case 1:
                		operacao = numero1 + numero2;
                		System.out.printf("%.1f + %.1f = %.1f\n", numero1, numero2, operacao);
                		break;
                	case 2:
                		operacao = numero1 - numero2;
                		System.out.printf("%.1f - %.1f = %.1f\n", numero1, numero2, operacao);
                		break;
                	case 3:
                		operacao = numero1 * numero2;
                		System.out.printf("%.1f * %.1f = %.1f\n", numero1, numero2, operacao);
                		break;
                	case 4:
                		operacao = numero1 / numero2;
                		System.out.printf("%.1f / %.1f = %.1f\n", numero1, numero2, operacao);
                		break;
                	default:
                		System.out.println("Operação Inválida!");
                		return;
            	}
        }
        	scanner.close();
    }
}
