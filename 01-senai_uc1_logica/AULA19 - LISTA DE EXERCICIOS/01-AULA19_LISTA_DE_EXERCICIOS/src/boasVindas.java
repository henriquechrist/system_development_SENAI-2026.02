//14 - Mensagem de boas-vindas

import java.util.Scanner;

public class boasVindas {


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome:");
    String nome = sc.nextLine();
    boasVindas(nome);
}



static void boasVindas(String nome) {
    System.out.println("Olá, " + nome + "! Bem-vindo ao sistema.");    
}

}
