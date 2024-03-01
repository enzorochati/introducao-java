package introducao;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero[][] = {
				{10, 15,   35}, 
				{70, 120, 140}, 
				{50, 100, 150}};
		
		int [][] matriz = new int [3][3];
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.print("Numeros[" + linha + "][" + coluna + "]" + numero[linha][coluna]+ "\n");
			}
			System.out.print("\n");
		}
		
		scanner.close();
	}

}
