// 10 - Controle de vendas

import java.util.Scanner;

public class controleVendas {

    public static void main(String[] args) {
        float matriz[][] = new float[3][4];
        Scanner sc = new Scanner(System.in);

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da venda:");
                matriz[linha][coluna] = sc.nextFloat();
            }
        }

        float totalGeral = 0;
        float maiorVenda = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            float totalFuncionario = 0;

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                totalFuncionario = totalFuncionario + matriz[linha][coluna];

                if (matriz[linha][coluna] > maiorVenda) {
                    maiorVenda = matriz[linha][coluna];
                }
            }

            System.out.println("Funcionário " + (linha + 1) + ": " + (int) totalFuncionario);
            totalGeral = totalGeral + totalFuncionario;
        }

        System.out.println("Total geral: " + (int) totalGeral);
        System.out.println("Maior venda: " + (int) maiorVenda);

        sc.close();
    }
}
