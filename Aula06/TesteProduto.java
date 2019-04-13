import javax.swing.JOptionPane;

public class TesteProduto{
   public static void main(String[] args){
      String nome = JOptionPane.showInputDialog("Digite o nome do produto");
      double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
      String marca = JOptionPane.showInputDialog("Digite a marca do produto");
      String cnpj = JOptionPane.showInputDialog("Digite o CNPJ da marca");
      String tamanho = JOptionPane.showInputDialog("Digite o tamanho do produto (P M G XG XXG)");
      
      Marca marca1 = new Marca(marca,cnpj);
      Etiqueta etiqueta1 = new Etiqueta(marca1, tamanho);
      Produto produto1 = new Produto(nome, preco, etiqueta1);
      
      JOptionPane.showMessageDialog(null,produto1.getDados());
      
      preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo preço do produto"));
      tamanho = JOptionPane.showInputDialog("Digite o novo tamanho do produto (P M G XG XXG)");
      produto1.setPreco(preco);
      etiqueta1.setTamanho(tamanho);
      
      JOptionPane.showMessageDialog(null,produto1.getDados());
            
   }
}