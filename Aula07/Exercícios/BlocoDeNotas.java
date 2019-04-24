import java.util.ArrayList;
public class BlocoDeNotas{
   private ArrayList<String> notas;
   public BlocoDeNotas(){
      notas = new ArrayList<String>();
   }
   public int buscar(String procura){
      for(int i = 0; i < notas.size(); i++){    
         String nota = notas.get(i);            
         if(procura.equals(nota)){                      
            return i;
         }
      }
      return -1;
   }
   
   public void inserir(String nota){
      notas.add(nota);
      
   }
   
   public boolean remover(String nota){
      int posicao = buscar(nota);
      if (posicao >= 0){
         notas.remove(posicao);
         return true;
      }
      else
      return false;
   }
   
   public String toString(){
      String saida = "";
      int posicao = 1;
      for(int i = 0; i < notas.size(); i++){    
         String nota = notas.get(i); 
         saida +="\nNota "+posicao+"\n["+nota+"]";
         posicao++;
      }
      return saida;
   }
}
