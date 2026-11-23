import java.util.Scanner;

public class buscarNomes {

    String[] lista = new String[6];
    String nome;
    int contador = 0;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        buscarNomes sistema = new buscarNomes();

        System.out.println("Iniciando Sistema");
        sistema.geradorNomes();

        System.out.println("Digite o nome que deseja buscar:");
        sistema.nome = sistema.sc.nextLine();

        sistema.buscadorNomes(sistema.nome);
        System.out.println(
            "O nome " + sistema.nome
            + " foi encontrado " + sistema.contador + " vezes"
        );
    }

    void geradorNomes() {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Digite o nome:");
            lista[i] = sc.nextLine();
        }
    }

    void buscadorNomes(String nomeBusca) {
        contador = 0;

        for (int i = 0; i < lista.length; i++) {
            if (nomesIguais(nomeBusca, lista[i])) {
                System.out.println("Nome encontrado: " + lista[i]+" na posição " + i);
                contador++;
            } 
            else {
            }
        }
    }

    boolean nomesIguais(String primeiro, String segundo) {
        if (primeiro == null || segundo == null) {
            return primeiro == segundo;
        }

        if (primeiro.length() != segundo.length()) {
            return false;
        }

        for (int i = 0; i < primeiro.length(); i++) {
            if (primeiro.charAt(i) != segundo.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}