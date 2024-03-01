package introducao.vetor.matriz;

import java.util.Scanner;

public class Exercicio3 {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        int[][] numero = new int[3][3];
	        int somaDiagonalSecundaria = 0, somaDiagonalPrincipal = 0;
	        
	        for (int i = 0; i < numero.length; i++) {
	            for (int j = 0; j < numero[i].length; j++) {
	                System.out.print("Digite os valores da " + (i + 1) + " linha e " + (j + 1) + " coluna: ");
	                numero[i][j] = scanner.nextInt();
	            }
	            System.out.print("\n");
	        }
	       
	        System.out.println("Matriz:");
	        for (int i = 0; i < numero.length; i++) {
	            for (int j = 0; j < numero[i].length; j++) {
	                System.out.print("[" + numero[i][j] + "]");
	            }
	            System.out.print("\n");
	        }
	        
	        System.out.print("\nElementos da diagonal principal: \n");
	        for (int i = 0; i < numero.length; i++) {
	            for (int j = 0; j < numero[i].length; j++) {
	                if(i == j) {
	                	somaDiagonalPrincipal += numero[i][j];
	                	System.out.print(numero[i][j] + " ");
	                }
	            }
	         
	        }
	        
	        System.out.print("\nElementos da diagonal secundária: \n");
	        for (int i = 0; i < numero.length; i++) {
	            for (int j = 0; j < numero[i].length; j++) {
	                if(i + j == numero.length - 1) {
	                	somaDiagonalSecundaria += numero[i][j];
	                	System.out.print(numero[i][j] + " ");
	                }
	            }
	         
	        }
	       
	        System.out.println("\nSoma da diagonal principal: \n" + somaDiagonalPrincipal);
	        System.out.println("Soma da diagonal secundária: \n" + somaDiagonalSecundaria);
	        
	        scanner.close();
	    }
}
