import javax.swing.JOptionPane;

public class TesteTurma{
   public static void main (String[] args) {
      String nome = JOptionPane.showInputDialog("Digite o nome da turma");
      String curso = JOptionPane.showInputDialog("Digite o curso");
      int alunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
      int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a s�rie"));
      
      Turma turma1 = new Turma (nome, curso, alunos, serie);
      JOptionPane.showMessageDialog(null, "Turma: " + turma1.getNome() + "\nCurso: " + turma1.getCurso()
                     + "\nQuantidade de Alunos: " + turma1.getAlunos() + "\nS�rie: " + turma1.getSerie() );
      
      alunos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos alunos ficaram at� o final"));
      turma1.setAlunos(alunos);

      JOptionPane.showMessageDialog(null, "Turma: " + turma1.getNome() + "\nCurso: " + turma1.getCurso()
                     + "\nQuantidade de Alunos: " + turma1.getAlunos() + "\nS�rie: " + turma1.getSerie() );
   }
}