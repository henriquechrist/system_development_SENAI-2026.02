import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float limite, parcela;
    
    System.out.println("Sistema de Crédito Bancário");
    System.out.println("Digite seu nome:");
    String nome= sc.nextLine();
    System.out.println("Digite sua Idade:");
    int idade= sc.nextInt();
    System.out.println("Digite seu salário:");
    Float salario= sc.nextFloat();
    System.out.println("Digite o valor de empréstimo desejado:");
    Float emp= sc.nextFloat();
    System.out.println("Digite a quantidade de parcelas desejadas:");
    int parcelas= sc.nextInt();
    
    limite = salario * 0.30f;
    parcela = emp/parcelas;

    if (idade>=18 && salario>=2000.00){
        System.out.println("Requisitos atendidos");
            if(parcela<limite){
                System.out.println("Empréstimo de R$"+ emp+" aprovado! A parcela mensal é de: R$"+parcela);
            }
            else{
                
                System.out.println("Apesar dos requisitos, o valor é muito alto");
            }

    }
    else{

        System.out.println("Não aprovado");
    }




}




}
