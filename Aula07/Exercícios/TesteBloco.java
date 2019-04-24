import javax.swing.JOptionPane;
public class TesteBloco{
   public static void main(String[] args){
      BlocoDeNotas notas = new BlocoDeNotas();
      int menu;
      String nota = null;
      do{
         menu = Integer.parseInt(JOptionPane.showInputDialog(
            "1 Inserir Nota\n2 Remover Nota\n3 Buscar uma Nota\n4 Sair\n5 Mostrar todas as Notas"));
         if(menu == 1){
            nota = JOptionPane.showInputDialog("Digite sua nota");
            notas.inserir(nota);
         }
         else if(menu == 2){
            nota = JOptionPane.showInputDialog("Nota para remover");
            if(notas.remover(nota)){
               JOptionPane.showMessageDialog(null, "Removido");
            }
            else {
               JOptionPane.showMessageDialog(null, "Nao encontrado");
            }
         }
         else if(menu == 3){
            nota = JOptionPane.showInputDialog("Nota para procurar:");
            int posicao = notas.buscar(nota);
            if(posicao >= 0){
               JOptionPane.showMessageDialog(null, "Encontrado em "+posicao);
            }
            else {
               JOptionPane.showMessageDialog(null, "Nao encontrado");
            }
         }
         else if(menu == 4){
         }
         else if(menu == 5){
            JOptionPane.showMessageDialog(null,notas); //Puxa por padrão o metodo toString() da classe BlocoDeNotas
         }
         else {
            JOptionPane.showMessageDialog(null,
               "Opcao invalida");
         }
      }while(menu != 4);
   }
}