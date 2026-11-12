public class ExemploRepeticao3 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i>=5 && i<=6){
                continue;
            }
            System.out.println("Imprimir: \t" + i );
        }
    }


}
