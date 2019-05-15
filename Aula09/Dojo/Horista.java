public class Horista extends Empregado{
   private int horasTrabalhadas;
   private double valorHora;
   public Horista(String nome, int horasTrabalhadas, double valorHora){
      super(nome);
      this.horasTrabalhadas = horasTrabalhadas;
      this.valorHora = valorHora;
   }
   
   @Override
   public double salario(){
      return (horasTrabalhadas*valorHora);
   }
}