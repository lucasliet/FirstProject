import java.sql.Date;

public class Pedido {
   private int id;
   private Date data;
   private double valor;
   
   public Pedido() {}
   
   public Pedido(int id, Date data, double valor){
      this.id = id;
      this.data = data;
      this.valor = valor;
   }
   
   public void setId(int id){
      this.id = id;
   }
   
   public void setData(Date data){
      this.data = data;
   }
   
   public void setValor(double valor){
      this.valor = valor;
   }
   
   public int getId(){
      return id;
   }
   
   public Date getData(){
      return data;
   }
   
   public double getValor(){
      return valor;
   }
   
   @Override 
   public String toString () {
      return "Pedido = [id = " + id + ", data = " + data +
	  ", valor = " + valor + "]";
   }
}