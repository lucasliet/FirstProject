// Ler dois numeros inteiros e imprimir dividendo, divisor, quociente e resto. 

import javax.swing.JOptionPane;

public class SuperDivis�o15{
   public static void main (String[] args){
      JOptionPane.showMessageDialog(null, "Digite dois n�meros inteiros que te mostrarei o divisor, dividendo, quociente e resto");
      int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
      int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
      
      JOptionPane.showMessageDialog(null,"O Dividendo � " + num1 + "\nO Divisor � " + num2 + "\nO Quociente � " + (num1/num2) + "\nE o Resto � " + (num1%num2) );
   }
}