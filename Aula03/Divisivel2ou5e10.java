import javax.swing.JOptionPane;

public class Divisivel2ou5e10{
   public static void main (String[] args){
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
      
      if (numero % 5 == 0 && numero % 10 != 0){
         JOptionPane.showMessageDialog(null, "Este n�mero � divisivel por 5");
      }
      else {
         if (numero % 2 == 0 && numero % 10 != 0){
            JOptionPane.showMessageDialog(null, "Este n�mero � divisivel por 2");
         }
         else {           
            if (numero % 10 == 0){
               JOptionPane.showMessageDialog(null, "Este n�mero � divisivel por 10");
            }
            else {
               JOptionPane.showMessageDialog(null, "Este n�mero n�o � divisivel por 2, 5 ou 10");                     
            }
         }
      }
   }
}