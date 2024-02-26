package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variaveis
		String nome;
		int idade;
		
		// Entrada de Dados
		Scanner leia = new Scanner(System.in);
		System.out.print("Insira o seu nome: ");
		nome = leia.nextLine();
		System.out.print("Insira a sua idade: ");
		idade = leia.nextInt();
		
		//concatenação: juntar um texto com 1 ou mais variaveis/constantes
		//Saída de Dados
		System.out.println("Bom dia, " + nome + "\nA sua idade é " + idade + " anos");
		leia.close();
	}

}
