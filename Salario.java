import javax.swing.JOptionPane;

public class Salario {
    public static void main(String[] args) {
        double salarioInicial, porcentagem, salarioFinal;

        salarioInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
        porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem: "));
        salarioFinal = salarioInicial * porcentagem/100.0;
        JOptionPane.showMessageDialog(null,salarioFinal);
        System.out.println(salarioFinal);
        System.exit(0);
    }
}