//8- Maior e menor valor em uma matriz

import java.util.Scanner;
public class matrizMenorMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][3];
        System.out.println("Digite os numeros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        int[] resultado = encontrarMenorMaior(matriz);
        System.out.println("Menor valor: " + resultado[0]);
        System.out.println("Maior valor: " + resultado[1]);
        scanner.close();
    }
    public static int[] encontrarMenorMaior(int[][] matriz) {
        int menor = matriz[0][0];
        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        return new int[]{menor, maior};
        
    }

}