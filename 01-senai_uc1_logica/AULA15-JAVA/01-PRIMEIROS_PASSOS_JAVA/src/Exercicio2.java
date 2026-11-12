public class Exercicio2 {
    public static void main(String[] args) 
    {
        int contador = 0, divisor = 2;
        
            do {
                if (contador%divisor==0){

                System.out.println("JAVA! "+contador);
                contador++;
            }
            else
                {
                System.out.println("Impar "+contador);
                contador++;

                }


            
            } while (contador<=26);
    }



}
