/*
Crie um algoritmo para calcular a �rea de um c�rculo,
com base no seu raio (�rea = PI*raio*raio, onde PI = 3.14159).
Use vari�veis reais.
*/
import javax.swing.JOptionPane;

public class AreaCirculo14{
   public static void main (String[] args){
      double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do c�rculo e te retornarei a �rea"));
      
      JOptionPane.showMessageDialog(null, String.format("%.2f",(3.14159*Math.pow(raio,2))));
   }
}