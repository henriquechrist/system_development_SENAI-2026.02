import javax.swing.JOptionPane;

public class ExemploEntrada {
    public static void main(String[] args) {
    String num1 = JOptionPane.showInputDialog("Digite Num1:"); 
    String num2 = JOptionPane.showInputDialog("Digite Num2:");
    double nota1 = Double.parseDouble(num1);
    double nota2 = Double.parseDouble(num2);
    double media = ((nota1+nota2)/2);

    JOptionPane.showMessageDialog(null,media);



    }



}
