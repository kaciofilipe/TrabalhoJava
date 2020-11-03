package br.com.prog2.rh.persistencia;

import java.util.List;
import br.com.prog2.rh.model.Cliente;

public interface ClienteDAO {
	
	public String inserir(Cliente cli);

	public String excluir(Cliente cli);

	public List<Cliente> listarTodos();

	public Cliente pesquisarPorCodigo(int codCliente);

	public Cliente pesquisarPorRG(int rgCliente);
}