package introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Double> notas = new ArrayList<Double>();
		Double numero;
		
		notas.add(4.0);
		notas.add(6.0);
		notas.add(2.4);
		notas.add(7.2);
		notas.add(9.7);
		notas.add(10.0);
		
		System.out.print("Notas cadastradas: " + notas);
		
		System.out.print("\nDigite o numero: ");
		numero = scanner.nextDouble();
		
		System.out.print("\no indice " + notas.indexOf(numero));
		scanner.close();
	}

}
