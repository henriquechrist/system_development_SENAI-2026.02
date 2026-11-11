import java.util.Scanner;


public class Teste1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n=2;
    int n1=3;
    System.out.println("Qual o seu nome?");
    String nome = sc.nextLine();
    System.out.println("Qual a sua cidade?");
    String cidade = sc.nextLine();
    

    System.out.println(nome +", bem-vindo à "+cidade+" sua senha é: " + (n + n1));
        
    }
    
    



}
