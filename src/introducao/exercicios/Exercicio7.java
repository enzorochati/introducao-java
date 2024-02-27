package introducao.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        for (Integer i = 0; i < 3; i++) {
        	
        	System.out.print("Valor: ");
        	Integer tempoTotalSegundos = scanner.nextInt();
        	Integer horas = tempoTotalSegundos / 3600;
        	Integer minutos = (tempoTotalSegundos % 3600) / 60;
        	Integer segundos = tempoTotalSegundos % 60;

        	System.out.printf("Valor Formatado: %d:%02d:%02d\n",
        			horas, minutos, segundos);
        }
        scanner.close();
	}
}
