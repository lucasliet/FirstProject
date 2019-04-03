import javax.swing.JOptionPane;

public class SomaSequencial {
   public static void main (String[] args){
      int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro positivo \n
															e eu mostrarei a soma sequencial até ele"));
      int soma = 0;
      int cont = 0;
      
      while ( cont <= n ){
         soma = soma + cont;
         cont = cont + 1;
      }
      JOptionPane.showMessageDialog(null, soma);
   }
}