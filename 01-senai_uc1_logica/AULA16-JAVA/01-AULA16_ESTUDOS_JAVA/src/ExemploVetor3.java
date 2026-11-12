import java.util.Scanner;

public class ExemploVetor3 {
public static void main(String[] args) {
    int[] numeros = new int[5];
    Scanner ler = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um nº: ");
            numeros [i] = ler.nextInt();
            
        }
        System.out.println("Nºs digitados:");
        for (int num : numeros) {
            System.err.println(num);
            
        }
}
}
