import java.util.Scanner;
public class Entrada {
    public static void main(String[] args) {
    //Leitura-Entrada de Dados
    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite seu nome:");
    String nome = leitura.nextLine();
    System.out.println("Digite sua idade");
    int idade = leitura.nextInt();
    System.out.println("Digite sua altura");
    double altura = leitura.nextDouble();
    System.out.println("---------------");
    System.out.println(nome+"-"+idade+"-"+"-"+altura);

    }
}

