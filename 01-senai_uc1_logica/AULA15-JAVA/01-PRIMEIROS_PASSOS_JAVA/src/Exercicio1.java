import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
    float media;   
    Scanner leitura = new Scanner(System.in);

    System.out.println("Escreva a primeira nota: ");
    float n1 = leitura.nextFloat();

    System.out.println("Escreva a segunda nota:");
    float n2 = leitura.nextFloat();

     media = (n1+n2)/ 2;

    System.out.println("A média é: "+media);

}


}
