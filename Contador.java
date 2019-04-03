import javax.swing.JOptionPane;

public class Contador{
   public static void main (String[] args){
      int cont = 0;
      String mostrador = "Mariana conta <br>";
      int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite até quanto quer que o Mariana conte"));
      int divisor = 0;
      while (cont < fim){
         cont = cont + 1;
         if (cont < 10){
            mostrador = mostrador + "0" + cont + " | ";
         } else
            mostrador = mostrador + cont + " | ";
            divisor = cont % 10;
         if (divisor == 0){
            mostrador = mostrador + "\n";
         } 
      }
     
      JOptionPane.showMessageDialog(null, mostrador);
   }


}