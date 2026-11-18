import java.util.Scanner;

public class menorMaiorMatriz {
    public static void main(String[] args) {
        
        int matriz[][] = new int [4][3];
        int maior=0, menor=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Iniciando Sistema...");
            for ( int linha = 0; linha < matriz.length; linha++) {
                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                    System.out.println("Insira o nº:");
                    matriz [linha] [coluna] = sc.nextInt();
     
                       if (linha==0 && coluna==0) {
                            maior = matriz[linha] [coluna];
                            menor= matriz [linha] [coluna];
                        }
                            if (matriz[linha] [coluna] > maior) {
                                maior=matriz[linha] [coluna];
                            }
                                if (matriz [linha][coluna]< menor) {
                                menor = matriz[linha] [coluna];   
                                }
                }                        
            }   
            System.out.println("Maior:"+maior+"\tMenor:"+menor);
    }
}


