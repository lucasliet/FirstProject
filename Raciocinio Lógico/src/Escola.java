/*
Data:  17/05/2019
Declarar um vetor tipo double c/ 8 posições
Inserir via teclado notas às posições
Depois disso, mostrar as notas >=6
e a média das notas com valor > =6
*/
import javax.swing.*;
public class Escola {
    public static void main (String[] args){
        //Criando Variáveis
        double[] alunos = new double[8];
        String mostrarNotas = "";
        double soma = 0;
        double media = 0;
        int cont = 0;
        //Atribuindo notas à alunos
        for(int i = 0; i < alunos.length;i++) {
            alunos[i] = Double.parseDouble( JOptionPane.showInputDialog("Digite a nota do "+(i+1)+"º aluno:") );
        }
        //Criando lista dos alunos com notas maiores que 6, calculando a média deles e quantos foram aprovados
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] >= 6){
                mostrarNotas+= "Aluno "+ (i+1) + " Nota: " + alunos[i] + "\n";
                soma+=alunos[i];
                cont++;
            }
        }
        if (cont > 0){
            media = soma / cont;
        }
        else{
            mostrarNotas = "Nenhum aluno foi aprovado.";
        }
        JOptionPane.showMessageDialog(null, "Aprovados: \n" + mostrarNotas);
        JOptionPane.showMessageDialog(null, "A média dos alunos aprovados foi: "+media+ " e foram aprovados "+cont+" alunos");

    }
}
