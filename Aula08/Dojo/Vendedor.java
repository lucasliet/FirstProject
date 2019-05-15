import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Vendedor{
   private ArrayList<Cliente> lista;
   
   public Vendedor(){
      lista = new ArrayList<>();
   }
   
   public void carregar(Connection conn) {
		String sqlSelect = "SELECT id, nome, fone FROM cliente";
      
		try (PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					Cliente cliente = new Cliente();
					cliente.setIdCliente(rs.getInt("id"));
					cliente.setNome(rs.getString("nome"));
					cliente.setFone(rs.getString("fone"));
					lista.add(cliente);
				}
			} 
         catch (Exception e) {
				e.printStackTrace();
			}
		} 
      catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
	}
   public String toString(){
      String listagem = "";
		for(Cliente cliente: lista){
			listagem += cliente.toString() + "\n";
		}
		return listagem;
   }
}