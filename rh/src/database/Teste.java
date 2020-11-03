package database;
import java.sql.Connection;

import br.com.prog2.rh.persistencia.ConnectionFactory;

public class Teste {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Testando Conexao");
		Class.forName("org.postgresql.Driver");
		Connection con = ConnectionFactory.getConnection();
		if(con != null){
			System.out.println("OK");
			ConnectionFactory.closeConnection(con);
		}
	}
}