import javax.swing.JOptionPane;

public class DiasVividos {
   public static void main (String args []) {
     int anos = Integer.parseInt(
               JOptionPane.showInputDialog("Quantos anos voc� tem?"));
     int dias = (anos * 365);
     JOptionPane.showMessageDialog (null, 
      "Voc� viveu por " + dias + " dias.");

   }
}