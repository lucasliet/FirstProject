public class Etiqueta{
   private String marca;
   private String tamanho;
   
   public Etiqueta(String marca, String tamanho){
      setMarca(marca);
      setTamanho(tamanho);
   }   
   
   public String getMarca(){
      return marca;
   }
   
   public String getTamanho(){
      return tamanho;
   }
   
   public String getDados(){
	   return "Etiqueta: \nMarca: " + marca + "Tamanho: " + tamanho
   }
   
   public void setMarca(String marca){
      this.marca = marca;
   }
   
   public void setTamanho(String tamanho){
      if (tamanho.equalsIgnoreCase("P") || 
          tamanho.equalsIgnoreCase("M") ||
          tamanho.equalsIgnoreCase("G") ||
          tamanho.equalsIgnoreCase("XG")||
          tamanho.equalsIgnoreCase("XXG") ){
         this.tamanho = tamanho;
      }
      else {
         this.tamanho = "U";
      }
   }
}
