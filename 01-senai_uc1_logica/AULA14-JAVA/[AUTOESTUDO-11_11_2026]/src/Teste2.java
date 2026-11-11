import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite o primeiro número:");
            int n1 = sc.nextInt();
            System.out.println("Digite o segundo número:");
            int n2 = sc.nextInt();

            if (n1>n2)
                {
                System.out.println("O número "+n1+" é maior!");

            } 
            else if (n2>n1)
                    {
                    System.out.println("O número "+n2+" é maior!");

            }
            else
                {
                    System.out.println("Os números "+n1+" e "+n2+" são iguais!");

            }


            sc.close();

    }


}
