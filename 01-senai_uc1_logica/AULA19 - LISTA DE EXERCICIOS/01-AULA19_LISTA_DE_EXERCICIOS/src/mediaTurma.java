import java.util.Scanner;

public class mediaTurma {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
double matriz[] = new double[5];
double aprovados = 0.0, reprovados = 0.0, soma = 0.0;

System.out.println("Sistema de Notas: ");

    for (int i = 0; i < matriz.length; i++) {
        System.out.println("Digite a "+(i+1)+"ª nota:");
        matriz[i] = sc.nextDouble();
        soma += matriz[i];
            
            if (matriz[i]>= 7) {
                aprovados++;
            }
            if(matriz[i]>10){
                System.out.println("Nota inválida repita:");
                matriz[i] = sc.nextDouble();
            }
                else{   
                     reprovados++;
                }        
    }

    System.out.println("Notas Cadastradas:");

    for (int i = 0; i < matriz.length; i++) {
        
        System.out.print(matriz[i]+"\t");

    }

    System.out.println("\nMédia da turma: "+(soma/matriz.length)+"\nAprovados: "+aprovados+"\nReprovados: "+reprovados);

}

}
