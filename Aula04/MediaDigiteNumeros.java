import javax.swing.JOptionPane;

public class MediaDigiteNumeros{
   public static void main (String[] args){
      int cont, soma, numero;
      cont = soma = numero = 0;
      char continuar = 's';
      while (continuar == 's'){
         numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
         soma += numero;
         cont++;
         continuar = JOptionPane.showInputDialog("Deseja continuar? s/n").charAt(0);
      }
      JOptionPane.showMessageDialog(null, "A m�dia desses n�meros � de " + (soma/cont));
   }
}