//9- Soma das notas por linha

import java.util.Scanner;

public class somaPorLinha {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String[] nome = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            nome[i] = leia.nextLine();
        }

        double[][] notas = somaPorLinha(leia);

        for (int i = 0; i < 3; i++) {

            double soma = 0;

            for (int j = 0; j < 2; j++) {
                soma += notas[i][j];
            }

            System.out.println("Aluno: " + nome[i]);
            System.out.println("Soma das notas: " + soma);
            System.out.println("-------------------");
        }

        leia.close();
    }

    public static double[][] somaPorLinha(Scanner leia) {

        double[][] somaPorLinha = new double[3][2];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.println("Digite a nota do aluno "
                        + (i + 1) + " do bimestre " + (j + 1) + ":");

                somaPorLinha[i][j] = leia.nextDouble();
            }
        }

        return somaPorLinha;
    }
}