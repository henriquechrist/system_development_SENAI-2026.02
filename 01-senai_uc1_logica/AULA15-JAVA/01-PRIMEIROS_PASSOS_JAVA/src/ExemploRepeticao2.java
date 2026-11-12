public class ExemploRepeticao2 {
    public static void main(String[] args) {
     int contador = 0;
     do {
        System.out.println("Contador: \t"+contador);
        contador++;

     } while (contador<=10);

     System.out.println("Fim do While");
        
     for (int i = 0; i <= 10; i++) {
        System.out.println("Contador for: \t"+i);
        
     }

     System.out.println("Fim do sistema!");

    }

}
