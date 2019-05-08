import javax.swing.JOptionPane;
public class MainInt{
   public static void main(String args[]){
      int numero;
      Int exp1= new Int();
      //numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
      //JOptionPane.showMessageDialog(null,"A soma da expressão foi "+ exp1.recebeInt(numero));
      
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
      JOptionPane.showMessageDialog(null,"A soma da expressão foi "+ exp1.divideInt(numero));

   }
   
}
