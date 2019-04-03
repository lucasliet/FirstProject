import javax.swing.JOptionPane;

public class DigiteUmaMensagem {
   public static void main (String args []) {
      String msg = JOptionPane.showInputDialog("Digite uma mensagem:");
      JOptionPane.showMessageDialog(null, msg);
   }
}