package introducao.exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(Integer i = 0; i < 3; i++) {
        	System.out.print("Valor: ");
        	Integer valor = scanner.nextInt();
        
        	Integer notas100 = valor / 100;
        	valor %= 100;
        	Integer notas50 = valor / 50;
        	valor %= 50;
        	Integer notas20 = valor / 20;
        	valor %= 20;
        	Integer notas10 = valor / 10;
        	valor %= 10;
        	Integer notas5 = valor / 5;
        	valor %= 5;
        	Integer notas2 = valor / 2;
        	valor %= 2;
        	Integer notas1 = valor;
        
        	System.out.println("\nValor: " + valor + "\n");
        	System.out.println(notas100 + " nota(s) de R$ 100,00");
        	System.out.println(notas50 + " nota(s) de R$ 50,00");
        	System.out.println(notas20 + " nota(s) de R$ 20,00");
        	System.out.println(notas10 + " nota(s) de R$ 10,00");
        	System.out.println(notas5 + " nota(s) de R$ 5,00");
        	System.out.println(notas2 + " nota(s) de R$ 2,00");
        	System.out.println(notas1 + " nota(s) de R$ 1,00");
        }
        scanner.close();
    }
}
