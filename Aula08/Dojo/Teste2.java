import java.sql.SQLException;
import java.sql.Connection;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Teste2 {

   public static void main(String[] args) {
      Connection conn = null;
      Pedido p;
      Cliente c;
      
      try {
      	// obtem conexao com o banco
         ConexaoBD bd = new ConexaoBD();
         conn = bd.conectar();
         
         //formatador de data
         DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

     	   // *** IMPORTANTE ***: Forca o uso de transacao.
         conn.setAutoCommit(false);
      	                  
         c = new Cliente(1010, "Ze dos Pedidos", "1199995678");
         c.incluir(conn);
         
         p = new Pedido(1, (Date)formatter.parse("02/05/2018"), 100.50);
         p.incluir (1010, conn);
         
         p = new Pedido(2, (Date)formatter.parse("03/05/2018"), 758.61);
         p.incluir (1010, conn);
         
         conn.commit();
         
         Pedido doBanco = new Pedido(1401);
         doBanco.carregar(conn);
         System.out.println (doBanco);
         
         doBanco.atualizar (conn, (Date)formatter.parse("08/05/2018"), 1000.00);
         doBanco.carregar(conn);
         System.out.println (doBanco);
                           
         conn.commit();
         
         Cliente novo = new Cliente(1010);
         novo.carregar(conn);
         System.out.println(novo);
         System.out.println(novo.listaDePedidos(conn));
         
         conn.commit();
         
         Vendedor lista = new Vendedor();
         System.out.println(lista.listarClientes(conn));
                
       } 
      catch (Exception e) {
         e.printStackTrace();
         if (conn != null) {
            try {
               conn.rollback();
            } 
            catch (SQLException e1) {
               System.out.print(e1.getStackTrace());
            }
         }
      } 
      finally {
         if (conn != null) {
            try {
               conn.close();
            } 
            catch (SQLException e1) {
               System.out.print(e1.getStackTrace());
            }
         }
      }
   }
}
