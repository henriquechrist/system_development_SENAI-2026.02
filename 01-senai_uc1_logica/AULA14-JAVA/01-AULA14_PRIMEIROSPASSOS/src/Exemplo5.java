public class Exemplo5 {
    public static void main(String[] args) {
        char respostas = 'S';
        int quantDiasMes = 31;

        /* if (resposta=='S') {
            System.out.println("Continue Logado no Sistema");
            
        } 
        */
        if (quantDiasMes<30) {
            System.out.println("O mês é fevereiro");
            
        } else{
            System.out.println("O mês é diferente de fevereiro");

        }

        System.out.println(quantDiasMes<30?"O mês é fevereiro":"Não é fevereiro
        ");
    
    }


}
