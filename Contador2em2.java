
import javax.swing.JOptionPane;

public class Contador2em2 {
   public static void main (String[] args){
      int cinnamon=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
      String line ="Contagem: ";
      int cont = 1;
      while (cont < cinnamon){
         line = line + cont + " | ";
         cont = cont + 2;
      }
      JOptionPane.showMessageDialog(null, line); 
   }
}