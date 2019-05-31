/*
1) Fazer um programa para realizar o seguinte:
a) Entrar, via teclado, um valor n.
b) Calcular expressão: s = 2/(1*1) + 3/(2*2) +...+ (n+1)/(n*n)
 */
import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        double s = 0;
        for(int i = 0;i <= n;i++){
            s += (i+1) / (i*i);
        }
        JOptionPane.showMessageDialog(null, "O resultado da expressão s = 1 + 2 +...+ n é: " + s);
    }
}
