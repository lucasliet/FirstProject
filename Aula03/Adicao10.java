import javax.swing.JOptionPane;

public class Adicao10{
   public static void main (String[] args){
      JOptionPane.showMessageDialog(null, "Farei a soma de dois n�meros, se o resultado for maior que 10, apresentarei");
      int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
      int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
      int resultado = num1 + num2;
      if (resultado > 10){
         JOptionPane.showMessageDialog(null, resultado);
      }
   
   }
}