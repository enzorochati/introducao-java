package introducao.condicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for	(Integer i = 0; i < 2; i++){
			
			System.out.print("Nome do colaborador: ");
			String colaborador = scanner.nextLine();
			System.out.print("Cargo: ");
			Integer codigoCargo = scanner.nextInt();
			System.out.print("Salário ");
			Float salario = scanner.nextFloat();
			scanner.nextLine();
			String cargo = "";
			Float reajuste = 0.0f;
        
				switch (codigoCargo) {
					case 1:
						cargo = "Gerente";
						reajuste = salario * 0.10f;
						break;
					case 2:
						cargo = "Vendedor";
						reajuste = salario * 0.07f;
						break;
					case 3:
						cargo = "Supervisor";
						reajuste = salario * 0.09f;
						break;
					case 4:
						cargo = "Motorista";
						reajuste = salario * 0.06f;
						break;
					case 5:
						cargo = "Estoquista";
						reajuste = salario * 0.05f;
						break;
					case 6:
						cargo = "Técnico de TI";
						reajuste = salario * 0.08f;
						break;
					default:
						System.out.println("Código de cargo inválido!");
						scanner.close();
						return;
				}

			Float novoSalario = salario + reajuste;

			System.out.printf("""
			Nome do colaborador: %s
			Cargo: %s
			Salário: R$ %.2f\n		
			""", colaborador, cargo, novoSalario);
        
		}
			scanner.close();
	}
}
