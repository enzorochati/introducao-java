package introducao.condicionais;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o Nome do doador: ");
        String doador = scanner.nextLine();
        System.out.print("Digite a Idade do doador: ");
        int idade = scanner.nextInt();
        System.out.print("Primeira doação de sangue? ");
        boolean primeiraDoacaoSangue = scanner.nextBoolean();

        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && primeiraDoacaoSangue) {
                System.out.printf("%s não está apto para doar sangue!", doador);
            } else {
                System.out.printf("%s está apto para doar sangue!", doador);
            }
        } else {
            System.out.print("Idade fora do intervalo permitido para doação de sangue!");
        }
        scanner.close();
    }
}
