public class Escolha {
    public static void main(String[] args) {
        int avaliacao = 10;
        switch (avaliacao) {
            case 5:
                System.out.println("Muito Bom");
                
                break;

            case 4:
                System.out.println("Bom");
                
                break;
            case 3:
                System.out.println("Médio");
                
                break;
            case 2:
                System.out.println("Ruim");
                
                break;
            case 1:
                System.out.println("Muito Ruim");
                
                break;
        
            default:
                System.out.println("Opção Inválida");
                break;
        }
        
        

    }

}
