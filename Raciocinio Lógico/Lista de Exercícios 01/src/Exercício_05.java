/*
5) Fazer um programa para realizar o seguinte:
a) Entrar, via teclado, um valor n.
b) Calcular expressão: s = (1*1)/2 + (2*2)/3 +...+ (n*n)/(n+1)
 */
import javax.swing.JOptionPane;

public class Exercício_05 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        double s = 0;
        for(double i = 0; i <= n; i++){
            s+=(i*i)/(i+1);
        }
        JOptionPane.showMessageDialog(null,"O Resultado da expressão s = (1*1)/2 + (2*2)/3 +...+ (n*n)/(n+1) é: "+s);
    }
}
