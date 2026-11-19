    static double calcularCusto(double distancia,double precoLitro,double consumo) {
        double custo,litros;
        litros = distancia/consumo;
        custo = precoLitro*litros;

        System.out.println("Resumo da Viagem:");
        System.out.println("Você ira percorrer: "+distancia+" km");
        System.out.println("O consumo do seu veículo é:"+consumo+" km/l");
        System.out.println("O preço do combustível é: R$"+precoLitro);
        System.out.println("Serão necessários:"+litros+" lts");
        System.out.println("Custo total: R$"+custo);

        return custo;



    }