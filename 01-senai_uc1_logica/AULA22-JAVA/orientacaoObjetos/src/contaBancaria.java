public class contaBancaria {
    
    //ATRIBUTOS DA CLASSE
    String titular;
    int numeroConta;   
    int agencia;
    double saldo;

    //CONSTRUTOR DA CLASSE
    public contaBancaria(String titular, int numeroConta, int agencia) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = 500.0;
    }

    //FUNÇÕES DA CLASSE
    public void depositar(double valor,String titular){

        if(valor >0){
            saldo += valor;
            System.out.println("Depósito de"+valor+" realizado com sucesso!");
            return;
        }
        else
            {
            System.out.println("Valor de depósito inválido!");
            depositar(valor,titular);
            return;
        }

    }

    public void sacar(double valor,String titular){

        if(valor >0){
            saldo -= valor;
            System.out.println("Saque de"+valor+" realizado com sucesso!");
            return;
        }
        else{
            System.out.println("Valor de saque inválido!");
            sacar(valor,titular);
            return;
     
        }
    }

    public void verSaldo(String titular){
        System.out.println("Saldo atual: "+saldo);
    }

    public void transferir(double valor, int contaDestino){
            if (valor <= saldo){
                saldo -= valor;
                System.out.println("Transferência de "+valor+" para a conta "+contaDestino+" realizada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente para a transferência!");
            }
     return;

    }
}
