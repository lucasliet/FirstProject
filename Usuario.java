import javax.swing.JOptionPane;

public class Usuario {
   public static void main (String args[]) {
      String nome, login;
      nome = JOptionPane.showInputDialog ("Digite nome e sobrenome");
      int tamanho = nome.length();
      login = nome.substring(0, 3) + nome.substring(tamanho-3, tamanho);
      JOptionPane.showMessageDialog(null, login);
   }
}