// Classe usada para modelar um carrinho de supermercado

import java.util.ArrayList; // importa a classe ArrayList

public class Carrinho
{
    // atributos: variáveis que armazenam os dados de um objeto, após este
    // ser instanciado.
    private ArrayList <Produto> produtosEscolhidos;

    // métodos construtores: usado para inicializar os atributos,
    // quando um objeto cliente é criado (instanciado). Notar que o construtor
    // faz chamada interna de dois métodos modificadores.
    public Carrinho()
    {
        produtosEscolhidos = new ArrayList<>(400);
    }

    // outros métodos
    
    /*
     * Este método deve ser executado uma vez para cada produto colocado 
     * no carrinho.
     * Para cada produto, escrever o nome (exemplo: "arroz"), o preço 
     * unitário por kg (em reais) e a quantidade de produto (em kg).
     */
    
    public void colocarProdutoNoCarrinho(String nomeProduto, double precoProduto, 
    double quantidadeProduto)
    {
        Produto novoProduto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
        produtosEscolhidos.add(novoProduto);
    }
    /*remover um produto de uma posição e devolver o produto*/
    public Produto removeProdutoDoCarrinho(int posicao){ 
         return produtosEscolhidos.remove(posicao);
    }  
    /* 
    * Este método percorre a Lista de Produtos, armazenada em um ArrayList. Colhe os valores dos atributos 
    * de cada objeto da lista e os concatena numa String (saida). Calcula 
    * também o total em reais gasto nas compras, concatenando-o na mesma 
    * String. Depois, retorna essa String.
    */
    
   
    public String listaDeProdutos()
    {
        String saida = "";
        double soma = 0.0;
                
        for( Produto produto: produtosEscolhidos )
        {
            saida += produto.gastoComProduto();
            soma += produto.getQuantidade() * produto.getPrecoUnitario();
        }
        saida += "\n\nTotal a Pagar: R$ ";
        if (getPeso() > 50)
        {
            double desconto = soma * 0.12;
            soma -= desconto; 
            saida+= soma + " Desconto de 12%, Você economizou: " + desconto + " Peso total: " + getPeso();
        }
        else
        {
            saida+= soma + " Peso total: " + getPeso();
        }
        return saida;
      
    }
    public double getPeso()
    {
      double peso = 0.0;
      
      for ( Produto produto: produtosEscolhidos )
      {
          peso+= produto.getQuantidade();
      }
      return peso;
    }
}
