//16- Calculadora Simples

import java.util.Scanner;

public class calculadora {

    static Scanner sc = new Scanner(System.in);
    static float n1 = 0, n2 = 0, resultado = 0;

    public static void main(String[] args) {

        System.out.println("Calculadora Simples");
        System.out.println("Digite o primeiro número:");
        n1 = sc.nextFloat();

        System.out.println("Digite o segundo número:");
        n2 = sc.nextFloat();

        System.out.println("Escolha a operação (1 - Adição, 2 - Subtração, 3 - Multiplicação, 4 - Divisão):");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                resultado = n1 + n2;
                System.out.println("Resultado da Adição: " + resultado);
                break;

            case 2:
                resultado = n1 - n2;
                System.out.println("Resultado da Subtração: " + resultado);
                break;

            case 3:
                resultado = n1 * n2;
                System.out.println("Resultado da Multiplicação: " + resultado);
                break;

            case 4:
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado da Divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Opção inválida.");
        }

        sc.close();

        System.out.println("\nAgora todos os resultados:\nAdição: " + (n1 + n2) +
                "\nSubtração: " + (n1 - n2) +
                "\nMultiplicação: " + (n1 * n2) +
                "\nDivisão: " + (n2 != 0 ? (n1 / n2) : "Erro: Divisão por zero"));
    }
}
