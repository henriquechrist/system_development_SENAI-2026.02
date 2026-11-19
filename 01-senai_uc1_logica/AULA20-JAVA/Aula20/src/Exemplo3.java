import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        apresentarPessoa("Yago",67);
        apresentarPessoa("Neymar",10);
        apresentarPessoa("Gabriel",9);
        
    }

    static void apresentarPessoa(String nome, int idade){
    System.err.println("Nome:"+nome+" | Idade:"+idade);

    }
}