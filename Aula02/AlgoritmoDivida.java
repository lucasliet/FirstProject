/*
se voc� deve para o cart�o de cr�dito R$ 100,00,
� taxa de juros de 10%, quanto dever� depois de 8 meses? 
*/
import javax.swing.JOptionPane;

public class AlgoritmoDivida {
   public static void main (String[] args){
      double divida = 100;
      int mes = 0;
      while (mes < 8){
         mes = mes + 1;
         divida = divida + divida * 10/100;
      }
      JOptionPane.showMessageDialog(null, String.format("Sua divida � de R$%.2f", divida));
   }

}