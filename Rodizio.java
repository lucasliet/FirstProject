import javax.swing.JOptionPane;

public class Rodizio{
   public static void main (String[] args){
      int placa = Integer.parseInt(JOptionPane.showInputDialog("Digite os quatro ultimos digitos da sua placa"));
      int digito = placa % 10;
      
      if ((digito == 1) || (digito == 2)){
         JOptionPane.showMessageDialog(null, "Seu rodizio e na segunda");
      }
      else if ((digito == 3) || (digito == 4)){
         JOptionPane.showMessageDialog(null, "Seu rodizio e na terça");
      }
      else if ((digito == 5) || (digito == 6)){
         JOptionPane.showMessageDialog(null, "Seu rodizio e na quarta");
      }
      else if ((digito == 7) || (digito == 8)){
         JOptionPane.showMessageDialog(null, "Seu rodizio e na quinta");
      }
      else
         JOptionPane.showMessageDialog(null, "Seu rodizio e na sexta");            
   }
}