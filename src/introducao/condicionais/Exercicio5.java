package introducao.condicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for	(Integer i = 0; i < 2; i++){
			
	        System.out.print("Código do Produto: ");
	        Integer codigoProduto = scanner.nextInt();
	        System.out.print("Quantidade: ");
	        Integer quantidade = scanner.nextInt();
	        Float precoUnitario = 0f;
	        String nomeProduto = "";

		        switch (codigoProduto) {
		            case 1:
		                precoUnitario = 10.00f;
		                nomeProduto = "Cachorro Quente";
		                break;
		            case 2:
		                precoUnitario = 15.00f;
		                nomeProduto = "X-Salada";
		                break;
		            case 3:
		                precoUnitario = 18.00f;
		                nomeProduto = "X-Bacon";
		                break;
		            case 4:
		                precoUnitario = 12.00f;
		                nomeProduto = "Bauru";
		                break;
		            case 5:
		                precoUnitario = 8.00f;
		                nomeProduto = "Refrigerante";
		                break;
		            case 6:
		                precoUnitario = 13.00f;
		                nomeProduto = "Suco de laranja";
		                break;
		            default:
		                System.out.println("Código de produto inválido!");
		                System.exit(0);
		        }

        double valorTotal = quantidade * precoUnitario;

        System.out.printf("Produto: %s\n", nomeProduto);
        System.out.printf("Valor total: R$ %.2f\n", valorTotal);
		}
		scanner.close();
	}
}
