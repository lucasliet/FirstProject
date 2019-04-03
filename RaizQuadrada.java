import javax.swing.JOptionPane;

public class RaizQuadrada {
   public static void main (String args[]) {
      //declara variáveis
      int numero;
      double raiz;
      //entrada
      numero = Integer.parseInt(
               JOptionPane.showInputDialog("Digite um número positivo"));
      //processamento         
      raiz = Math.sqrt(numero);
      //saida 
      JOptionPane.showMessageDialog (null, "raiz quadrada de " + numero + 
                                           " = " + raiz);
      
   }
}