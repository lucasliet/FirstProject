/*
Lista de Exerc�cios 01
1) Fazer um programa para realizar o seguinte:
a) Entrar, via teclado, um valor n.
b) Calcular a express�o: s = 1 + 2 +...+ n
 */
import javax.swing.JOptionPane;

public class Exerc�cio_01 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        int s = 0;
        for(int i = 0;i <= n;i++){
            s+=i;
        }
        JOptionPane.showMessageDialog(null,"O resultado da express�o s = 1 + 2 +...+ n �: "+s);
    }
}