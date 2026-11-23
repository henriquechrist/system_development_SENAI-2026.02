import java.util.Scanner;
    public class reajusteSalarial {

    double salario[] = new double[5];
    double novoSalario[] = new double[5];
    double aumento = 0.10;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    reajusteSalarial sistema = new reajusteSalarial();

    System.out.println("Iniciando Sistema Salarial");

    sistema.lerSalario();
    sistema.calcularNovoSalario();
    sistema.exibirNovoSalario();

    }

    void lerSalario() {

    for (int i = 0; i < salario.length; i++) {

    System.out.println("Digite o salário do funcionário " + (i + 1) + ":");

        salario[i] = sc.nextDouble();
    }
}
    void calcularNovoSalario() {

    for (int i = 0; i < salario.length; i++) {
        if(salario[i]<=2000.00){
            novoSalario[i] = salario[i] + (salario[i] * aumento);
        }
        else{
            novoSalario[i] = salario[i];
        }
    }

    }
    
    void exibirNovoSalario() {

    for (int i = 0; i < novoSalario.length; i++) {

    System.out.println("O novo salário do funcionário " + (i + 1) +
        " é: " + novoSalario[i]);
    }

    }

}
