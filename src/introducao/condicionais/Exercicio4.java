package introducao.condicionais;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String animal;

        do {
            System.out.print("O animal é (vertebrado/invertebrado): ");
            animal = scanner.nextLine().toLowerCase();
        } while (!animal.equals("vertebrado") && !animal.equals("invertebrado"));

        String grupoAnimal;

        do {
            System.out.print("Grupo do animal: ");
            grupoAnimal = scanner.nextLine().toLowerCase();
        } while (!grupoAnimal.equals("mamífero") && !grupoAnimal.equals("mamifero") &&
                 !grupoAnimal.equals("ave") && !grupoAnimal.equals("anelideo") &&
                 !grupoAnimal.equals("anelídeo") && !grupoAnimal.equals("inseto"));

        String alimentoAnimal;

        do {
            System.out.print("Alimento do animal: ");
            alimentoAnimal = scanner.nextLine().toLowerCase();
        } while (!alimentoAnimal.equals("onívoro") && !alimentoAnimal.equals("onivoro") &&
                 !alimentoAnimal.equals("hematófago") && !alimentoAnimal.equals("hematofago"));

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
        }

        scanner.close();
    }
}
