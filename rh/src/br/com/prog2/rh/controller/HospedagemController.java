package br.com.prog2.rh.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import br.com.prog2.rh.model.Cliente;
import br.com.prog2.rh.model.Hospedagem;
import br.com.prog2.rh.persistencia.ClienteDAOImp;
import br.com.prog2.rh.persistencia.ConnectionFactory;

public class HospedagemController {

	public String inserir(Hospedagem emp) {
		String sql = "INSERT INTO bancoreserva.tb_hospedagem(\"estado\", \"qntPessoas\", \"desconto\", \"valorFinal\", \"codCliente\", \"codChale\", \"dataInicio\", \"dataFim\") VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emp.getEstado());
			pst.setInt(2, emp.getQtdPessoas());
			pst.setFloat(3, emp.getDesconto());
			pst.setFloat(4, emp.getValorFinal());
			pst.setInt(5, emp.getCodChale());
			pst.setInt(6, emp.getCodChale());
			pst.setString(7, emp.getDataInicio());
			pst.setString(8, emp.getDataFim());

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

	public String excluir(Hospedagem dep) {
		StringBuilder sql = new StringBuilder();
		sql.append(
				"DELETE FROM bancoreserva.tb_hospedagem WHERE tb_hospedagem.\"codChale\" = ? AND tb_hospedagem.\"codCliente\" = ?");
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql.toString());
			pst.setInt(1, dep.getCodChale());
			pst.setInt(2, dep.getCodChale());
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