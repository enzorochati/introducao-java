package introducao.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Raio: ");
        Double radius = scanner.nextDouble();
        Double area = Math.PI * Math.pow(radius, 2);
        
        System.out.printf("Área: %.4f", area);
        scanner.close();
	}
}
