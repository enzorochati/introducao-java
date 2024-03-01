package introducao;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cachorros[] = new String[3];
        int indice;
        
        for(indice = 0; indice < 3; indice++) {
            System.out.print("Digite o " + (indice + 1) + "° nome: ");
            cachorros[indice] = scanner.nextLine();
        }
        
        for(indice = 0; indice < cachorros.length; indice++) {
            System.out.print(cachorros[indice] + " ");
        }
        
        scanner.close();
    }
}
