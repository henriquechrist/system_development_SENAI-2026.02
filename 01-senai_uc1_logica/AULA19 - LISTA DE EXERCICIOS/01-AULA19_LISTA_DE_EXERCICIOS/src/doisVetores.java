//6- Dois vetores

import java.util.Scanner;

public class doisVetores {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[][] vetores = new int[5][5];

        System.out.println("Digite os números:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                vetores[i][j] = leia.nextInt();
            }
        }

        somarD(vetores);
        somaIntercaladosC(vetores);

        leia.close();
    }

    public static void somarD(int[][] vetores) {

        int soma = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma += vetores[i][j];
            }
        }

        System.out.println("A soma dos elementos é: " + soma);
    }

    public static void somaIntercaladosC(int[][] vetores) {

        int[] C = new int[10];

        for (int i = 0; i < 5; i++) {
            C[i * 2] = vetores[0][i];
            C[i * 2 + 1] = vetores[1][i];
        }

        System.out.println("Vetor intercalado:");

        for (int i = 0; i < 10; i++) {
            System.out.print(C[i] + " ");
        }

        System.out.println();
    }
}