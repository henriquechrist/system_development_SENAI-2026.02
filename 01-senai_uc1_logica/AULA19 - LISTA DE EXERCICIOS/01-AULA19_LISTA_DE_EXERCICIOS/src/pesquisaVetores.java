import java.util.Scanner;


public class pesquisaVetores {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    int matriz[] = new int[10];
    int pares=0, impares=0, soma=0;
    
    System.out.println("Iniciando sistema");
    
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Digite o "+(i+1)+"º número:");               
            matriz[i] = sc.nextInt(); 
                if (matriz[i]%2==0) {
                    pares++;
                    soma+=matriz[i];
                }
                    else{
                        impares++;
                        soma+=matriz[i];
                    }
            
        }
        System.out.println("Números Digitados:");

            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j]+"\t");
        }

        System.out.println("Pares: "+pares+" | Impares: "+impares+" | Soma Geral: "+soma);    

    }
}
