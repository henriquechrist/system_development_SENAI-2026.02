import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num[]= new int[10];                                              //declaração do vetor
        int soma = 0 , pares = 0, impares =0;                   

        System.out.println("Iniciando sistema");
            for (int i = 0; i < num.length; i++) {                          // for para preencher, contar e somar
                System.out.println("Digite o nº de posição "+ (i+1));
                num[i] = sc.nextInt();
                    if(num[i]%2 ==0 ){
                        pares++;
                        System.out.println("Número par digitado");
                        soma += num[i];
                    }
                        else{
                            impares++;
                            System.out.println("Numero impar digitado");
                            soma+= num[i];
                        }
            }
                    System.out.println("----------Números Digitados----------\n");
                        for (int a = 0; a < num.length; a++) {                //for para imprimir todos os numeros digitados
                            System.out.print(num[a]+"\t");  
            }
            System.out.println("\nContagem pares:"+ pares + " | "+"Contagem impares:" + impares + "\n" + "Soma geral: " + soma);
    }
}
