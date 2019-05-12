/* 
   Data: 10/05/2019
   Programa para controlar sala de aula com array(vetor)
   Mostrar as notas impares
   Mostrar as posicoes com notas impares   (Numero par ou impar sao sempre do tipo int)
   
*/
import javax.swing.JOptionPane;
public class VetorNotas {
   public static void main (String[] args){
   
      //Declarar Variaveis
      double[] sala = new double[5];   //Vetor
      String mostrarNotas = "" , aprovados = "";
      double soma = 0;
      
      //Entrar com as Notas
      for(int i = 0; i < sala.length; i++){
         sala[i] = Double.parseDouble( JOptionPane.showInputDialog("Nota") );
      }
      
      //Mostrar as Notas
      for(int i = 0; i < sala.length; i++){
         mostrarNotas+= "Aluno "+ (i+1) + " Nota: " + sala[i] + "\n";   
      }
      JOptionPane.showMessageDialog(null, "Notas: \n" + mostrarNotas);
      
      //Calcular Soma
      for(int i = 0; i < sala.length; i++){
         soma+=sala[i];
      }
      
      //Mostrar resultado da Soma
      JOptionPane.showMessageDialog(null, "Soma das notas: \n" + soma);
      
      //Mostrar media das notas
      JOptionPane.showMessageDialog(null, "Media das notas: \n" + soma/sala.length);
      
      //Calcular e mostrar os aprovados e a posicao em que se encontram
      mostrarNotas = ""; //Resetando a variavel
      for(int i = 0; i < sala.length; i++){
         if(sala[i] >= 7){
            mostrarNotas+= "Aluno na posicao "+ (i) + " Nota: " + sala[i] + "\n";
         }
      }
      JOptionPane.showMessageDialog(null, "Aprovados: \n" + mostrarNotas); 
      //Checar e mostrar as notas impares e a posicao em que se encontram
      
      //Vetor tem que ser do tipo int
      
      mostrarNotas = ""; //Resetando a variavel
      for(int i = 0; i < sala.length; i++){
         if(sala[i] % 2 == 1){
            mostrarNotas+= "Aluno na posicao "+ (i) + " Nota: " + sala[i] + "\n";
         }
      }
      JOptionPane.showMessageDialog(null, "Notas Impares: \n" + mostrarNotas); 
      
   }  
}