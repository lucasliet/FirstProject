import javax.swing.JOptionPane;

public class Soma {
   public static void main (String[] args){
      String disciplina = JOptionPane.showInputDialog("Digite o nome da Disciplina");
      
      System.out.println(disciplina);
      JOptionPane.showMessageDialog(null, disciplina);
      
   }
}