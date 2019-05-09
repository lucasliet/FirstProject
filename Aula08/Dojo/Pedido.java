import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Pedido {
	private int id;
	private Date data;
	private double valor;
	public Pedido() {
	}
	public Pedido(int id) {
		this.id = id;
	}
   
	public Pedido(int id, Date data, double valor) {
		this.id = id;
		this.data = data;
      this.valor = valor;
	}
   
	public int getId() {
		return id;
	}
   
	public void setId(int id) {
		this.id = id;
	}
   
	public Date getData() {
		return data;
	}
   
	public void setData(Date data) {
		this.data = data;
	}
   
	public double getValor() {
		return valor;
	}
   
	public void setValor(double valor) {
		this.valor = valor;
	}
   
	public void incluir(int idCliente, Connection conn) {
		String sqlInsert = "INSERT INTO pedido(id, data, valor, id_cliente) VALUES (?, ?, ?, ?)";

		try (PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setInt(1, getId());
			stm.setDate(2, new java.sql.Date(getData().getTime()));
         stm.setDouble(3, getValor());
			stm.setInt(4, idCliente);
			stm.execute();
		} 
      catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} 
         catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
		}
	}
   
	public void excluir(Connection conn) {
		String sqlDelete = "DELETE FROM pedido WHERE id = ?";
		try (PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, getId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
		}
	}
   
	public void atualizar(Connection conn, Date novaData, double novoValor) {
		String sqlUpdate = "UPDATE pedido SET data=?, valor=? WHERE id=?";
		try (PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setDate(1, new java.sql.Date(novaData.getTime()));
			stm.setDouble(2, novoValor);
			stm.setInt(3, getId());
			stm.execute();
		} 
      catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} 
         catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
		}
	}
   
	public void carregar(Connection conn) {
		String sqlSelect = "SELECT data, valor FROM pedido WHERE id = ?";

		try (PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, getId());
			try (ResultSet rs = stm.executeQuery();) {
				/*
				 * este outro try e' necessario pois nao da' para abrir o
				 * resultsetno anterior uma vez que antes era preciso configurar
				 * o parametrovia setInt; se nao fosse, poderia se fazer tudo no
				 * mesmo try */
				if (rs.next()) {
					setData(rs.getDate(1));
					setValor(rs.getDouble(2));
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

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", valor=" + valor + "]";
	}
}
