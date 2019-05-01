import javax.swing.JOptionPane;

public class MostrarTryCatch{
   static int divide (int a, int b){
      return a/b;
   }
   public static void main(String[] args){
      try{
         int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite o numerador"));
         int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite o denominador"));
         JOptionPane.showMessageDialog(null, "divisao ="+divide(n1,n2) );
      }
      catch (NumberFormatException ne) {
         //ne.printStackTrace();
         JOptionPane.showMessageDialog(null, "Digite apenas numeros");
      }
      catch (ArithmeticException ae) {
         JOptionPane.showMessageDialog(null, "Não existe divisão por zero");
      }
      JOptionPane.showMessageDialog(null, "Obrigado, volte Sempre.");
   }   
}