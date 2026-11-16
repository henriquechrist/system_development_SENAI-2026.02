import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Digite o Número");
        n = sc.nextInt();
                
            for (int i = 1; i <=n; i++ ){
                if(i%2 == 0){
                System.out.println(i+" é par");
                 }
                    else{
                        System.out.println(i+" é impar");
                    }
            }
        
        System.out.println("Agora somente os pares!");
            
            for (int i = 1; i <=n; i++ ){
                if(i%2 == 0){
                System.out.println(i+" é par");
                 }
                    else{}
            }
    }
}