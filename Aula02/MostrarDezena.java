import javax.swing.JOptionPane;

public class MostrarDezena {
   public static void main (String[] args){
      String numero = JOptionPane.showInputDialog("Digite um n�mero de 3 d�gitos");
      String mostrador = numero.substring(1,2);
      JOptionPane.showMessageDialog(null, mostrador);
   }
}