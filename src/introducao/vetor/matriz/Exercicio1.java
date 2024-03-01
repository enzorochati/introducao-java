package introducao.vetor.matriz;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}; 
        int numeroDigitado;
        boolean encontrado = false;
        
        System.out.print("Digite o número que você deseja encontrar: ");
        numeroDigitado = scanner.nextInt();
        
        for(int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
        
        
        for(int i = 0; i < numero.length; i++) {
            if(numeroDigitado == numero[i]) {
                System.out.printf("\nO número %d está localizado na posição %d.\n", numeroDigitado, i+1);
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.printf("\nO número %d não foi encontrado!\n", numeroDigitado);
        }
        
        scanner.close();
    }

}
