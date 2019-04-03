import javax.swing.JOptionPane;

public class ContagemRegressiva {
   public static void main (String[] args){
      int cont = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro positivo \ne eu mostrarei a contagem regressiva dos impares"));
      String line = "Contagem \n| ";
      
      while ( cont > 0 ){
         if ( cont % 2 == 1){        //Saber se o número é impar
            line = line + cont + " | ";
         }
         cont = cont - 1;
      }
      JOptionPane.showMessageDialog(null, line);
   }
}