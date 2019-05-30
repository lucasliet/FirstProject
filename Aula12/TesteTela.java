import java.sql.*;

public class TesteTela{
   public static void main(String[] args){
   // obtem conexao com o banco
      ConexaoBD bd = new ConexaoBD();
      try{
         Connection conn = bd.conectar();
         new TelaCliente(conn);
      }catch (SQLException e){
         e.printStackTrace();
      }
   }
}