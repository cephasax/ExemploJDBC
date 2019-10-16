package negocio;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Cliente;
import banco.Conexao;

public class Operacao {
	
	public static void inserirCliente(Cliente cliente) throws SQLException{
		String sql ="INSERT INTO cliente VALUES (default, ?,?)";
		
		PreparedStatement ps = Conexao.getConnection().prepareStatement(sql);
		ps.setString(1, cliente.getNome());
		ps.setString(2, cliente.getCpf());
		ps.execute();
        ps.close();
		System.out.println("Cliente " + cliente.getNome()+ " cadastrado.");
	}
	
	//ADICIONE DEMAIS OPERACOES AQUI
	
}
