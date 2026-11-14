import java.util.Scanner;

public class DesafioPotencia {
    public static void main(String[] args) {
        int base,exp,resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Inciando...");
        System.out.println("Digite o nº base:");
        base = sc.nextInt();
        System.out.println("Digite o expoente:");
        exp = sc.nextInt();

        resultado = base;


        for (int i = 0; i < exp ; i++) {
            resultado = resultado*base;



            System.out.println("O resultado da potência de base:"+base+"\nE expoente:"+exp+ "\nÉ:"+resultado);

            
        }



    }

}
