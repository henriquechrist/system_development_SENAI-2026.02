import java.util.Scanner;
public class Exercicio2 {
 public static void main(String[] args) {
    double saldo=1000;
    int opcao;
    Scanner ler = new Scanner(System.in);
    do {
        menu();
        System.err.println("Escolha uma opção:");
        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                consultarSaldo(saldo);
                break;
            case 2:
               saldo = depositar(ler, saldo);
                break;
            case 3:
                saldo = sacar(ler, saldo);
                break;
        
            default:
                System.out.println("Opção incorreta!");
                break;
        }
        
    } while (opcao!=0);

 }

 public static double depositar(Scanner ler, double saldo){
    System.out.println("Valor do depósito");
    double deposito = ler.nextDouble();
    if (deposito > 0) {
        saldo = saldo + deposito;
        System.out.println("Depósito realizado!");
    }else{
        System.out.println("Valor de depósito inválido!");
    }
    return saldo;
 }

 public static double sacar(Scanner ler, double saldo){
    System.out.println("Valor do saque:");
    double saque = ler.nextDouble();
    if (saque <= 0) {
        System.out.println("Valor inválido!");
    } else if (saque > saldo) {
        System.out.println("Saldo insuficiente!");
    }else{
        saldo = saldo - saque;
        System.out.println("Saque efetuado!");
    }
    return saldo;
 }

 public static void consultarSaldo(double saldo){
    System.out.println("Seu saldo é:"+saldo);
 }

//void - a função não retorna valor
 public static void menu(){
    System.out.println("=============Caixa Eletrônico=============");
    System.out.println("1-Consultar Saldo");
    System.out.println("2-Depositar");
    System.out.println("3-Sacar");
    System.out.println("0-Sair");
 }
}
