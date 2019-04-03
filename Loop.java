/*

Operações matemáticas
>   Maior
>=  Maior ou Igual
<   Menor
<=  Menor ou Igual
==  Igual
!=  Diferente

Repetição, Laço, Loop 

*/
import javax.swing.JOptionPane;

public class Loop {
   public static void main (String[] args){
      int cont = 0; //Variavel deve ser iniciada
      String line ="Contagem: ";
      while (cont < 5){
         cont = cont + 1;
         line = line + cont + " | ";  
      }
      JOptionPane.showMessageDialog(null, line);   
   }

}
