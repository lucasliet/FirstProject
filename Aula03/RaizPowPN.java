import javax.swing.JOptionPane;

public class RaizPowPN {
   public static void main (String[] args){
      JOptionPane.showMessageDialog(null, "<html><body>Digite um n�mero,<br> Se ele for positivo, mostrarei a raiz quadrada dele,<br> Se for negativo o mostrarei ao quadrado,<br> Se for 0 n�o farei nada :(</body></html>"); 
      double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero"));
      if (numero > 0){
         double raiz = Math.sqrt(numero);
         JOptionPane.showMessageDialog(null, "<html><body>Voc� colocou um n�mero positivo,<br> Ent�o a raiz de " + numero + String.format(" � %.2f", raiz) + "</body></html>");
      }
      else{
         if (numero < 0){
            double pow = Math.pow(numero,2);
            JOptionPane.showMessageDialog(null, "<html><body>Voc� colocou um n�mero negativo,<br> Ent�o " + numero + " elevado ao quadrado" + String.format(" � %.2f", pow) + "</body></html>");
         }
         else
            JOptionPane.showMessageDialog(null, ":(");
      }
   }
}