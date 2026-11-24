//11 - Total de vendas por dia

import java.util.Scanner;

public class vendasDia {

    public static void main(String[] args) {
        float matriz[][] = new float[3][4];
        Scanner sc = new Scanner(System.in);

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da venda:");
                matriz[linha][coluna] = sc.nextFloat();
            }
        }

        float maiorTotal = 0;
        int diaMaior = 0;

        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            float totalDia = 0;

            for (int linha = 0; linha < matriz.length; linha++) {
                totalDia = totalDia + matriz[linha][coluna];
            }

            System.out.println("Dia " + (coluna + 1) + ": " + (int) totalDia);

            if (coluna == 0 || totalDia > maiorTotal) {
                maiorTotal = totalDia;
                diaMaior = coluna + 1;
            }
        }

        System.out.println("Maior total: Dia " + diaMaior + " (" + (int) maiorTotal + ")");

        sc.close();
    }
}

