/*
   Data:01/03/2019
 Aula 01
   Calcular a área de um retângulo.
   Para isso:
   - solicitar, via teclado, a base e a altura do retângulo.
   - O programa deverá calcular a área e mostrá-la na tela.
*/

import javax.swing.JOptionPane;   //importar o gerenciador de janelas JOptionPane

public class BaseTriangulo {
   //Declaração de Variaveis
      private double altura;
      private double base;
      private double area;
   //Construtores
   public AulaSexta(){            //Por hora não tem utilidade, apenas treino
   }
   //Métodos                      //é possivel mesclar essa etapa com a declaração de variáveis como fizemos nas aulas anteriores
   public void calcularArea(){
      //1º.Pedir para o usuário inserir o valor da base e altura
      base = Integer.parseInt(
         JOptionPane.showInputDialog(null, "Digite o valor da base: ")
      );
      
      altura = Integer.parseInt(
         JOptionPane.showInputDialog(null, "Digite o valor da altura: ")
      );
      
      //2º.Calcular a área
      area = base * altura;
      
      //3º.Exibir o resultado
      JOptionPane.showMessageDialog(null, "O valor da área é: " + area);
      
   }
}

/*
A Aula de hoje não usamos o main, mas usamos o Java Workbench (botão azul do JGrasp)
clicamos em create, botao direito e em usamos o invoke
*/