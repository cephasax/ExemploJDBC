package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static String DB_URL="jdbc:postgresql://localhost/banco_02";
	public static String DB_USER="teste";
	public static String DB_PASS="1234";
	private static Connection conexao;
	
	public static Connection getConnection() throws SQLException {
		if(conexao == null){
			conexao = fazerConexao();
		}
		return conexao;
	}
	
	private static Connection fazerConexao() throws SQLException{
		try{
			conexao = DriverManager.getConnection(DB_URL, DB_USER,DB_PASS);
			System.out.println("Banco conectado!!!");
		} catch (SQLException e){
			System.out.println("Erro de conexão!!!!");	
		}
		return conexao;
	}

}
