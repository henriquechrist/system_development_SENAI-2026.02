import javax.swing.JOptionPane;

public class JoptionSistema {
    public static void main(String[] args) {
        
        double aumento = 0.1, nvsalario ;
        String nome, email, n1;

        System.out.println("Iniciando Sistema...");
         nome = JOptionPane.showInputDialog("Qual seu nome?");
        email = JOptionPane.showInputDialog("Qual seu e-mail?");
        n1 = JOptionPane.showInputDialog("Qual seu salário?");

        double salario = Double.parseDouble(n1);

        nvsalario = (salario*aumento)+salario;

        JOptionPane.showMessageDialog(null,"---Resumo---\nNome: "+nome+"\nE-mail: "+email+" \nNovo Salário: "+nvsalario);


    }

}
