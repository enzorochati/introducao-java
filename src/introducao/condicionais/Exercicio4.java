package introducao.condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("O animal é (vertebrado/invertebrado): ");
	        String animal = scanner.nextLine().toLowerCase();

	        System.out.print("Grupo do animal: ");
	        String grupoAnimal = scanner.nextLine().toLowerCase();

	        System.out.print("Alimento do animal: ");
	        String alimentoAnimal = scanner.nextLine().toLowerCase();

	        System.out.print("O animal é um(a): ");
	        if (animal.equals("vertebrado")) {
	            if (grupoAnimal.equals("mamífero") || grupoAnimal.equals("mamifero")) {
	                if (alimentoAnimal.equals("onívoro") || alimentoAnimal.equals("onivoro")) {
	                    System.out.println("Homem");
	                } else {
	                    System.out.println("Vaca");
	                }
	            } else if (grupoAnimal.equals("ave")) {
	                if (alimentoAnimal.equals("onívoro") || alimentoAnimal.equals("onivoro")) {
	                    System.out.println("Pomba");
	                } else {
	                    System.out.println("Águia");
	                }
	            }
	        } else if (animal.equals("invertebrado")) {
	            if (grupoAnimal.equals("anelideo") || grupoAnimal.equals("anelídeo")) {
	                if (alimentoAnimal.equals("onívoro") || alimentoAnimal.equals("onivoro")) {
	                    System.out.println("Minhoca");
	                } else {
	                    System.out.println("Sanguessuga");
	                }
	            } else if (grupoAnimal.equals("inseto")) {
	                if (alimentoAnimal.equals("hematófago") || alimentoAnimal.equals("hematofago")) {
	                    System.out.println("Pulga");
	                } else {
	                    System.out.println("Lagarta");
	                }
	            }
	        } else {
	            System.out.println("Tipo de animal inválido!");
	        }
	        scanner.close();
	}
}
