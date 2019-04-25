import java.util.ArrayList;
public class Rede{
   private ArrayList<Amigo> amigos;
   public Rede(){
      amigos = new ArrayList<Amigo>();
   }
   public int buscar(String nome){
      for(int i = 0; i < amigos.size(); i++){    //amigoS � a arraylist de amigo  //o for normal foi usado pra retornar a posi��o do objeto
         Amigo amigo = amigos.get(i);           //objeto amigo, recebe o objeto da arraylist
         String nomeAmigo = amigo.getNome();   //uma string chamada nomeAmigo recebne o nome do objeto anterior
         if(nome.equals(nomeAmigo)){          //checa se o nome que o usu�rio digitou � igual ao nome do objeto anterior
            return i;
         }
      }
      /*
      for(Amigo amigo:amigos){                  //outra forma de uso
         if(amigo.getNome().equals(nome)){
            return amigos.indexOf(amigo);
         }
      } 
      */
      return -1;//nao achou
    
    
   
   }

   public boolean blockAmigo(String nome){
      int posicao = buscar(nome);
      if(posicao >= 0){
         amigos.remove(posicao);
         return true;
      } else {
         return false;
      }
   }
   public boolean enviarMensagem(String nome, String mensagem){
      int posicao = buscar(nome);
      if(posicao >= 0){
         Amigo amigo = amigos.get(posicao);
         amigo.setMensagem(mensagem);
         return true;
      } else {
         return false;
      }
   }
   public Amigo[] procurarVelhos(){
      if(amigos.size() == 0){
         return new Amigo[0];
      }
      int maior = amigos.get(0).getIdade();
   //encontrar a maior idade
      for(Amigo amigo:amigos){
         if(amigo.getIdade() > maior){
            maior = amigo.getIdade();
         }
      }
   //contar quantos tem a maior idade
      int qtde = 0;
      for(Amigo amigo:amigos){
         if(amigo.getIdade() == maior){
            qtde++;
         }
      }
   //criar vetor de amigos
      Amigo[] velhos = new Amigo[qtde];
   //popular o vetor de mais velhos
      int k = 0;
      for(int i = 0; i < amigos.size(); i++){
         Amigo amigo = amigos.get(i);
         if(amigo.getIdade() == maior){
            velhos[k++] = amigo;
         }
      }
      return velhos;
   }
   public void addAmigo(Amigo amigo){                           //"Sobrecarga" quando h� dois m�todos iguais instanciados de forma diferente, o programa detecta automaticamente pelos parametros
      amigos.add(amigo);                                        
   }
   public void addAmigo(String nome, String sexo, int idade){
      Amigo amigo = new Amigo();
      amigo.setNome(nome);
      amigo.setSexo(sexo);
      amigo.setIdade(idade);
      amigos.add(amigo);
   
   }
   public void listarAmigos(){
      for(Amigo amigo:amigos){
         System.out.println(amigo);   //puxando o toString()
      }
   }
}