import java.util.Scanner;//

public class mainExercicio1 {
    public static void main(String[] args) {


        //CRIAÇÃO DE OBJETOS DA CLASSE contaBancaria
        contaBancaria c1 = new contaBancaria("João", 12345, 6789);
        //contaBancaria c2 = new contaBancaria("Maria", 54321, 9876);
        //contaBancaria c3 = new contaBancaria("Carlos", 98765, 4321);

        //IMPRESSÃO DOS DADOS DA CONTA
        System.out.println("Conta 1:");
        System.out.println("Titular: " + c1.titular);
        System.out.println("Número da Conta: " + c1.numeroConta);
        System.out.println("Agência: " + c1.agencia);
        System.out.println("Saldo: " + c1.saldo);

        //System.out.println("\nConta 2:");
        //System.out.println("Titular: " + c2.titular);
        //System.out.println("Número da Conta: " + c2.numeroConta);
        //System.out.println("Agência: " + c2.agencia);
        //System.out.println("Saldo: " + c2.saldo);

        //System.out.println("\nConta 3:");
        //System.out.println("Titular: " + c3.titular);
        //System.out.println("Número da Conta: " + c3.numeroConta);
        //System.out.println("Agência: " + c3.agencia);
        //System.out.println("Saldo: " + c3.saldo);

        Scanner sc = new Scanner(System.in);
        int opcao;

        //LAÇO DE REPETIÇÃO PARA INTERAÇÃO COM O USUÁRIO
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Transferir");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = sc.nextDouble();
                    if (valorDeposito <= 0) {
                        System.out.println("Valor de depósito inválido!");
                    } else {
                        c1.depositar(valorDeposito, c1.titular);
                    }
                    c1.depositar(valorDeposito, c1.titular);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    if (valorSaque > c1.saldo) {
                        System.out.println("Saldo insuficiente para o saque!");
                    } else {
                        c1.sacar(valorSaque, c1.titular);
                    }
                    break;
                case 3:
                    c1.verSaldo(c1.titular);
                    break;
                case 4:
                    System.out.println("Digite o valor da transferência: ");
                    double valorTransferencia = sc.nextDouble();
                    System.out.println("Digite o número da conta de destino: ");
                    int contaDestino = sc.nextInt();
                    c1.transferir(valorTransferencia, contaDestino);
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        sc.close();

    }

}
