import javax.swing.JOptionPane;

public class TesteProduto{
   public static void main(String[] args){
      String nome = JOptionPane.showInputDialog("Digite o nome do produto");
      double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
      String marca = JOptionPane.showInputDialog("Digite a marca do produto");
      String tamanho = JOptionPane.showInputDialog("Digite o tamanho do produto (P M G XG XXG)");
      
      Etiqueta etiqueta1 = new Etiqueta(marca, tamanho);
      Produto produto1 = new Produto(nome, preco, etiqueta1);
      
      JOptionPane.showMessageDialog(null,"Produto: " + produto1.getNome() + "\nPreço: " + produto1.getPreco() + "\nMarca: " + etiqueta1.getMarca() + "\nTamanho: " + etiqueta1.getTamanho() );
      
      preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo preço do produto"));
      tamanho = JOptionPane.showInputDialog("Digite o novo tamanho do produto (P M G XG XXG)");
      produto1.setPreco(preco);
      etiqueta1.setTamanho(tamanho);
      
      JOptionPane.showMessageDialog(null,"Produto: " + produto1.getNome() + "\nPreço: " + produto1.getPreco() + "\nMarca: " + etiqueta1.getMarca() + "\nTamanho: " + etiqueta1.getTamanho() );
      
   }
}