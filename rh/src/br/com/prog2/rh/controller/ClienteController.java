package br.com.prog2.rh.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import br.com.prog2.rh.model.Cliente;
import br.com.prog2.rh.persistencia.ClienteDAOImp;
import br.com.prog2.rh.persistencia.ConnectionFactory;

public class ClienteController {

	public  String inserir(Cliente emp) {
		
		String sql = "INSERT INTO bancoreserva.tb_cliente(\"nomeCliente\", \"enderecoCliente\", \"bairroCliente\", \"cidadeCliente\", \"estadoCliente\", \"CEPCliente\", \"nascimentoCliente\", \"rgCliente\") VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emp.getNomeCliente());
			pst.setString(2, emp.getEnderecoCliente());
			pst.setString(3, emp.getBairroCliente());
			pst.setString(4, emp.getCidadeCliente());
			pst.setString(5, emp.getEstadoCliente());
			pst.setString(6, emp.getCEPCliente());
			pst.setString(7, emp.getNascimentoCliente());
			pst.setInt(8, emp.getRgCliente());

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

	public String excluir(Cliente emp) {
		String sql = "DELETE FROM bancoreserva.tb_cliente WHERE tb_cliente.\"rgCliente\" = ?";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, emp.getRgCliente());
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

	public Cliente pesquisarPorRG(int rg) {
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.pesquisarPorRG(rg);
	}

	public Cliente pesquisarPorCodigo(int codCliente) {
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.pesquisarPorCodigo(codCliente);
	}

}