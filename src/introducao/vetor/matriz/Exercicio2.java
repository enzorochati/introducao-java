package introducao.vetor.matriz;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[10];
        
        for (int i = 0; i < numero.length; i++) {
        	System.out.print("Digite o " + (i+1) + " numero: ");
        	numero[i] = scanner.nextInt();
        }
        
        System.out.println("\nElementos nos índices ímpares:");
        for (int i = 1; i < numero.length; i += 2) {
            System.out.print(numero[i] + " ");
        }
        System.out.println();
        
        
        System.out.println("\nElementos pares: ");
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                System.out.print(numero[i] + " ");
            }
        }
        System.out.println();
        
        int soma = 0;
        for (int i = 0; i < numero.length; i++) {
            soma += numero[i];
        }
        System.out.println("\nSoma: " + soma);
        
        float media = (float) soma / 10;
        System.out.println("\nMédia: " + String.format("%.2f", media));
        scanner.close();
    }
}
