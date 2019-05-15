public class TesteEmpregado{
   public static void main(String[] args){
      Empregado emp1 = new Empregado("Joao da Silva");
      System.out.println(emp1.getNome());
      System.out.println(emp1.salario());
      
      Empregado emp2 = new Mensalista("Jose Pereira", 3500.00);
      System.out.println(emp2.getNome());
      System.out.println(emp2.salario());
      
      Empregado emp3 = new Comissionado("Maria Pereira", 1500.00, 5000.00);
      System.out.println(emp3.getNome());
      System.out.println(emp3.salario());
      emp3.setComissao(10000.0);
      System.out.println(emp3.salario());
      
      Empregado emp4 = new Horista("A Diarista", 70, 5.33);
      
      System.out.println(emp1+"\n"+emp2+"\n"+emp3+"\n"+emp4);
   }

}