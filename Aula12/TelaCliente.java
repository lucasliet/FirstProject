import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class TelaCliente extends JFrame implements ActionListener{
   private JTextField txtNome, txtId, txtFone;
   private JLabel lblNome, lblId, lblFone;
   private JButton inserir, alterar, excluir, carregar;
   private Cliente cliente;
   private Connection conn;
   
   public TelaCliente(Connection conn){
      super("Cadastro de Clientes");
      txtNome = new JTextField(30);
      txtId = new JTextField(5);
      txtFone = new JTextField(10);
      
      lblId = new JLabel("Id");
      lblNome = new JLabel("Nome");
      lblFone = new JLabel("Fone");
      
      inserir = new JButton("Novo");
      alterar = new JButton("Atualiza");
      excluir = new JButton("Exclui");
      carregar = new JButton("Carrega");
      
      this.conn = conn;
      
      Container caixa = getContentPane();
      caixa.setLayout(new BorderLayout());
      
      JPanel painelBotoes = new JPanel(new FlowLayout());
      JPanel painelCentro = new JPanel(new GridLayout(3,1));
      JPanel painelLinha1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
      JPanel painelLinha2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
      JPanel painelLinha3 = new JPanel(new FlowLayout(FlowLayout.LEFT));

      painelLinha1.add(lblId);
      painelLinha1.add(txtId);
      painelLinha2.add(lblNome);
      painelLinha2.add(txtNome);
      painelLinha3.add(lblFone);
      painelLinha3.add(txtFone);
      painelCentro.add(painelLinha1);
      painelCentro.add(painelLinha2);
      painelCentro.add(painelLinha3);
      painelBotoes.add(inserir);
      painelBotoes.add(alterar);
      painelBotoes.add(excluir);
      painelBotoes.add(carregar);
      
      caixa.add(painelCentro, BorderLayout.CENTER);
      caixa.add(painelBotoes, BorderLayout.SOUTH);

      inserir.addActionListener(this);
      alterar.addActionListener(this);
      excluir.addActionListener(this);
      carregar.addActionListener(this);
      
      setSize(432,170);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e){
      cliente = new Cliente();
      cliente.setIdCliente(Integer.parseInt(txtId.getText()));
      cliente.setNome(txtNome.getText());
      cliente.setFone(txtFone.getText());

      if(e.getSource() == inserir){
         cliente.incluir(conn);
      } else if(e.getSource() == alterar){
         if(cliente.getNome().length() > 0 && cliente.getFone().length()>0){
            cliente.atualizar(conn);
         } else {
            JOptionPane.showMessageDialog(null, "Dados invalidos", "Cliente", 
               JOptionPane.ERROR_MESSAGE);
         }
      } else if(e.getSource() == excluir){
         cliente.excluir(conn);
      } else if(e.getSource() == carregar){
         cliente.carregar(conn);
         txtNome.setText(cliente.getNome());
         txtFone.setText(cliente.getFone());
      }
   }
}
