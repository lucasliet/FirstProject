import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Cliente {
	private int idCliente;
	private String nome;
	private String fone;

	public Cliente() {}

	public Cliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Cliente(int idCliente, String nome, String fone) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.fone = fone;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
  	}

	public void incluir(Connection conn) {
		String sqlInsert = "INSERT INTO cliente(id, nome, fone) VALUES (?, ?, ?)";

		try (PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setInt(1, getIdCliente());
			stm.setString(2, getNome());
			stm.setString(3, getFone());
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

	public void excluir(Connection conn) {
		String sqlDelete = "DELETE FROM cliente WHERE id = ?";
		try (PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			//depois excluir o cliente
			stm.setInt(1, getIdCliente());
			stm.execute();
			//anular os pedidos e os atributos
			setNome(null);
			setFone(null);
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
		}
	}

	public void atualizar(Connection conn) {
		String sqlUpdate = "UPDATE cliente SET nome=?, fone=? WHERE id = ?";

		try (PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setString(1, getNome());
			stm.setString(2, getFone());
			stm.setInt(3, getIdCliente());
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

	public void carregar(Connection conn) {
		String sqlSelect = "SELECT nome, fone FROM cliente WHERE id = ?";

		try (PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, getIdCliente());
			try (ResultSet rs = stm.executeQuery();) {
				/*
				 * este outro try e' necessario pois nao da' para abrir o
				 * resultsetno anterior uma vez que antes era preciso configurar
				 * o parametrovia setInt; se nao fosse, poderia se fazer tudo no
				 * mesmo try
				 */
				if (rs.next()) {
					setNome(rs.getString("nome"));
					setFone(rs.getString("fone"));
				} else {
					setNome(null);
					setFone(null);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
	}
}
