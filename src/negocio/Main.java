package negocio;

import java.sql.Date;
import java.sql.SQLException;
import banco.Conexao;
import modelo.Cliente;


public class Main {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		c.setNome("Joao Carlos");
		c.setCpf("111.111.111-11");
		
		try {
			Operacao.inserirCliente(c);
			//Operacao.inserirConta(conta);
			//Operacao.gerarHistorico(historico);
			
		} catch (SQLException e) {
			System.out.println("diferente");
			e.printStackTrace();
		}
		
		//consultarContas();
		//consultarExtrato();
		
		try {
			Conexao.getConnection().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	private static Date Data() {
		Date data = new Date(07-12-2013);    
		return data;
	}

	private static void consultarExtrato() {
		//Operacao.consultaTodosExtratos();
	}

	private static void consultarContas() {
		// TODO Auto-generated method stub
	}
}
