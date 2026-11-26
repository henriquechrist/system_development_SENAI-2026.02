public class controlarCarro {
  
    String tipo; //Carro, Moto, Caminhão
    String placa;
    int velocidade;
    int velocidadeMaxima;

    public void acelerar(int valor){
        if (velocidade + valor <= velocidadeMaxima){
            velocidade += valor;
            System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
        }   else {
                System.out.println("Não é possível acelerar além da velocidade máxima de " + velocidadeMaxima + " km/h");
            }
}

    public void frear(int valor){
        if (velocidade - valor >= 0){
            velocidade -= valor;
            System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Não é possível frear além de 0 km/h");
        }
    }
    


}