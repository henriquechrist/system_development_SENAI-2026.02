import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite a 1ª Nota:");
    double nota1 = sc.nextDouble();
    System.out.println("Digite a 2ª Nota:");
    double nota2 = sc.nextDouble();
    
    calcularMedia(nota1,nota2);

    sc.close();

    }
    
    static double calcularMedia(double nota1,double nota2){
    double media = (nota1+nota2)/2;
    
    System.out.println("A média é: "+ media);

    return media;
}

}
