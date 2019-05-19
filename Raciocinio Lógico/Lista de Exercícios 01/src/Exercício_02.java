/*
2) Fazer um programa para realizar o seguinte:
a) Entrar, via teclado, um valor n.
b) Calcular a expressão: s = 1/2 + 2/2 +...+ n/2
 */
import javax.swing.JOptionPane;

public class Exercício_02 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        double s = 0;
        for(double i = 0; i <= n; i++){
            s+=(i/2);
        }
        JOptionPane.showMessageDialog(null,"O Resultado da expressão s = 1/2 + 2/2 +...+ n/2 é: "+s);
    }
}
