public class Exemplo2 {
    public static void main(String[] args){
        byte idade = 25;
        float altura = 1.8f, peso = 88.5f;
        String nome = "Amanda";
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: " + peso);
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }

}
