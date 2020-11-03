package br.com.prog2.rh.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.prog2.rh.model.Chale;
import br.com.prog2.rh.model.Cliente;
import br.com.prog2.rh.persistencia.ClienteDAOImp;
import br.com.prog2.rh.persistencia.ConnectionFactory;

public class ChaleController {
	public  String inserir(Chale emp) {
		String sql = "INSERT INTO bancoreserva.tb_chale(\"localizacao\", \"capacidade\", \"valorAltaEstacao\", \"valorBaixaEstacao\") VALUES (?, ?, ?, ?)";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emp.getLocalizacao());
			pst.setInt(2, emp.getCapacidade());
			pst.setFloat(3, emp.getValorAltaEstacao());
			pst.setFloat(4, emp.getValorBaixaEstacao());

			int res = pst.executeUpdate();
			if (res > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		} finally {
			ConnectionFactory.closeConnection(con);
		}
	}

	public String excluir(Chale emp) {
		String sql = "DELETE FROM bancoreserva.tb_chales WHERE tb_chales.\"localizacao\" = ? AND tb_chales.\"capacidade\" = ?";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emp.getLocalizacao());
			pst.setInt(2, emp.getCapacidade());
			int res = pst.executeUpdate();
			if (res > 0) {
				return "Excluído com sucesso.";
			} else {
				return "Erro ao excluir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		} finally {
			ConnectionFactory.closeConnection(con);
		}
	}

	public List<Cliente> listarTodos() {
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.listarTodos();
	}

}
