public class Int{
   public int recebeInt(int numero){
      int cont=0;
      for(int i=0;i <= numero; i++){
         cont += (i*i);
      }
      return cont;
   }
   public int multiplicaInt(int numero){
      int cont=1;
      for(int i=1 ;i <= numero; i++){
         cont *= (i*i);
      }
      return cont;
   }
   public double divideInt(int numero){
      double cont = 0, i = 0;
      while(i <= numero){
         cont += (i/ (i+1) );
         i++;
      }
      return cont;
   }


}