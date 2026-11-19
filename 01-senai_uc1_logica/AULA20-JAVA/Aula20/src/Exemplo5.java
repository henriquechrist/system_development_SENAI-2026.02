import java.util.Scanner;

public class Exemplo5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia = 0.0, precoLitro = 0.0, consumo = 0.0;
        System.out.println("Digite a distância: ");
        distancia = sc.nextDouble();
        System.out.println("Digite o preço da gasolina (litro): ");
        precoLitro = sc.nextDouble();
        System.out.println("Digite o consumo do veículo: ");
        consumo = sc.nextDouble();

        calcularCusto(distancia,precoLitro,consumo);
        
    }

    static double calcularCusto(double distancia,double precoLitro,double consumo) {
        double custo,litros;
        litros = distancia/consumo;
        custo = precoLitro*litros;

        System.out.println("Resumo da Viagem:");
        System.out.println("Você ira percorrer: "+distancia+" km");
        System.out.println("O consumo do seu veículo é: "+consumo+" km/l");
        System.out.println("O preço do combustível é: R$ "+precoLitro);
        System.out.printf("Serão necessários: %.2flts\n",litros);
        System.out.printf("Custo total: R$ %.2f\n",custo);

        return custo;



    }



}
