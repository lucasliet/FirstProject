/*
private só retorna o atributo da classe
default retorna os atributos da classe e do pacote
protect retorna os atributos da classe, do pacote e da heranca
public retorna tudo
*/
public class Empregado{
   private String nome;
   
   public Empregado(String nome){ //construtor com parametros
      this.nome = nome;
   }
   public Empregado(){} //construtor padrao
   
   public String getNome(){
      return nome;
   }
   
   public void setNome(String nome){
      this.nome = nome;
   }
   
   public double salario(){
      return 0.0;
   }
   
   public void setComissao(double comissao){
      //nao faz nada->classe abstrata
   }
   
   public String toString(){
      return "Empregado [Nome: " + nome + "] " + "[Salario: " + salario() + "]";
   }  
   
}