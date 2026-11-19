import java.util.Scanner;

public class Exemplo6 {
public static void main(String[] args) {
double media = 5.0;
String situacao = verificarSituacao(media);
System.out.println("Média: "+media);
System.out.println("Situação "+situacao);
    
}

static String verificarSituacao(double media){

    if (media>7) {
        return "Aprovado";
        
    }
    else{
        return "Reprovado";
    }


}

}
