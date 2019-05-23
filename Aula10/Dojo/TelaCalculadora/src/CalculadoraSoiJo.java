import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSoiJo extends JFrame implements ActionListener {
   private JLabel lblValorA, lblValorB, lblOperacao, lblResultado;
   private JTextField txtValorA, txtValorB, txtOperacao, txtResultado;
   private JButton btnSoma, btnSubtrai, btnMultiplica, btnDivide, btnLimpa;
     
   public CalculadoraSoiJo(){
      super("Bora Calcular");
                                           //Texto e sempre String
      txtValorA = new JTextField("0", 10);
      txtValorB = new JTextField("0", 10);
      txtOperacao = new JTextField(12);
      txtResultado = new JTextField(12);
         
      lblValorA = new JLabel("Valor A");
      lblValorB = new JLabel("Valor B");
      lblOperacao = new JLabel("Operacao");
      lblResultado = new JLabel("Resultado");
         
      btnSoma = new JButton("+");
      btnSubtrai = new JButton("-");
      btnMultiplica = new JButton("*");
      btnDivide = new JButton("/");
      btnLimpa = new JButton("Limpa Tudo");
         
      JPanel painelNorte = new JPanel();
                                            //linha, coluna
      painelNorte.setLayout(new GridLayout(4, 2));
         
      painelNorte.add(lblValorA);
      painelNorte.add(txtValorA);
      painelNorte.add(lblValorB);
      painelNorte.add(txtValorB);
      painelNorte.add(lblOperacao);
      painelNorte.add(txtOperacao);
      painelNorte.add(lblResultado);
      painelNorte.add(txtResultado);
         
      JPanel painelCentro = new JPanel();
      painelCentro.setLayout(new GridLayout(1, 4));
         
      painelCentro.add(btnSoma);
      painelCentro.add(btnSubtrai);
      painelCentro.add(btnMultiplica);
      painelCentro.add(btnDivide);
         
      JPanel painelSul = new JPanel();
      painelSul.setLayout(new FlowLayout());
      painelSul.add(btnLimpa);
         
      Container container = getContentPane();
      container.setLayout(new FlowLayout());
         
      container.add(painelNorte, BorderLayout.NORTH);
      container.add(painelCentro, BorderLayout.CENTER);
      container.add(painelSul, BorderLayout.SOUTH);
         
      btnSoma.addActionListener(this);
      btnSubtrai.addActionListener(this);
      btnMultiplica.addActionListener(this);
      btnDivide.addActionListener(this);
      btnLimpa.addActionListener(this);
         
         
         
      setSize(400, 500);
      setLocationRelativeTo(null);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
   }
   @Override
     public void actionPerformed(ActionEvent evento){
      try{
         if (evento.getSource() == btnSoma) {
            double dblValorA = Double.parseDouble(txtValorA.getText());
            double dblValorB = Double.parseDouble(txtValorB.getText());
            double dblSoma = dblValorA + dblValorB;
            txtOperacao.setText("SOMA");
            txtResultado.setText("" + dblSoma);
         }
         else if (evento.getSource() == btnSubtrai){
            double dblValorA = Double.parseDouble(txtValorA.getText());
            double dblValotB = Double.parseDouble(txtValorB.getText());
            double dblSubtrai = dblValorA - dblValotB;
            txtOperacao.setText("SUBTRACAO");
            txtResultado.setText(""+dblSubtrai);
         }
         else if (evento.getSource() == btnMultiplica){
            double dblValorA = Double.parseDouble(txtValorA.getText());
            double dblValorB = Double.parseDouble(txtValorB.getText());
            double dblMultiplica = dblValorA * dblValorB;
            txtOperacao.setText("MULTIPLICACAO");
            txtResultado.setText(""+dblMultiplica);
         }
         else if (evento.getSource() == btnDivide){
            double dblValorA = Double.parseDouble(txtValorA.getText());
            double dblValorB = Double.parseDouble(txtValorB.getText());
            double dblDivide = dblValorA / dblValorB;
            txtOperacao.setText("DIVISAO");
            txtResultado.setText(""+dblDivide);
         }
         else {
            txtOperacao.setText("");
            txtResultado.setText("");
            txtValorA.setText("0");
            txtValorB.setText("0");
         }
      }
      catch(NumberFormatException nf){
         JOptionPane.showMessageDialog(this, "Digita um numero carai");
         txtOperacao.setText("");
         txtResultado.setText("");
         txtValorA.setText("0");
         txtValorB.setText("0");
      }
   }
   public static void main (String args[]){
      new CalculadoraSoiJo();
   }
}