import javax.swing.JOptionPane;

public class Divisao {
   public static void main (String args []) {
      int dividendo, divisor, quociente, resto;
      String aux;
      
      aux = JOptionPane.showInputDialog("Digite o dividendo");
      dividendo = Integer.parseInt(aux);
      
      divisor = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o divisor"));
                
      quociente = dividendo / divisor;
      resto = dividendo % divisor;
      
      JOptionPane.showMessageDialog (null, 
      "divisao = " + quociente + "\nresto = " + resto);
   }
}