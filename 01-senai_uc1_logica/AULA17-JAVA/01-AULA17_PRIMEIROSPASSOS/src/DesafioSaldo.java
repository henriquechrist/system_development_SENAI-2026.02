import java.util.Scanner;

public class DesafioSaldo {
    public static void main(String[] args) {
        menu();
      
        }

public static void menu() {
        double sdinicial=1000.00,somar,diminuir;
        int escolha;
        
do {
    Scanner sc = new Scanner(System.in);
        System.out.println("====CAIXA ELETRONICO====\n1- Consultar Saldo\n2- Depositar\n3- Sacar\n0- Sair");
        escolha = sc.nextInt();

        switch (escolha) {
            case 1 : 
           
            System.out.println("Seu saldo é:"+sdinicial);

            break;
                
                case 2 : 
                
                System.out.println("Quanto vai depositar?");
                somar= sc.nextDouble();
                sdinicial = sdinicial + somar;               

                break;
                    
                case 3: 
                
                    System.out.println("Quanto vai sacar?");
                    diminuir= sc.nextDouble();
                    sdinicial = sdinicial - diminuir;               

                break;

                } 
                
            } 
            while (escolha!=0);
                System.out.println("Sistema encerrado");        
        }
            
        }





