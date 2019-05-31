/*
2) Fazer um programa para realizar o seguinte:
a) Entrar, via teclado, um valor n.
b) Calcular expressão: s = 1/(2+2)+2/(3+3) + 3/(4+4) +...+ n/((n+1)+(n+1))
 */
import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        double s = 0;
        for(double i = 0;i <= n;i++){
            s += i / ((i+1) + (i+1));
        }
        JOptionPane.showMessageDialog(null, "O resultado da expressão s = 1 + 2 +...+ n é: " + s);
    }
}
