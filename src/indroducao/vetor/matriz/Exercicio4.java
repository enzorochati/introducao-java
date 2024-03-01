package indroducao.vetor.matriz;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][] notas = new float[10][4];
        float[] medias = new float[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informações do aluno " + (i + 1) + "\n");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Nota do bimestre " + (j + 1) + ": ");
                notas[i][j] = scanner.nextFloat();
            }
            System.out.print("\n");
        }

        System.out.println("Matriz:");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("[" + notas[i][j] + "]");
            }
            System.out.println();
        }

        for (int i = 0; i < notas.length; i++) {
            float soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / notas[i].length;
        }


        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Média do aluno " + (i + 1) + ": %.1f\n", medias[i]);
        }

        scanner.close();

    }
}
