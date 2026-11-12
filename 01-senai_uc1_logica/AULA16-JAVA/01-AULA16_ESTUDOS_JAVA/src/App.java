public class App {
    public static void main(String[] args) throws Exception {
        
        String time = "Flamengo";
        String resultado = switch (time) {
            case "Flamengo","Vasco","Fluminense"-> "RJ";
            case "Cruzeiro", "Atletico MG" , "America MG" -> "MG";
            case "Palmeiras","São Paulo", "Ponte Preta" -> "SP";
        
            default-> "Outro estado!";
        };
        System.out.println("Resposta:"+resultado);



    }
}
