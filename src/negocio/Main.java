package negocio;

import java.sql.Date;
import java.sql.SQLException;
import banco.Conexao;
import modelo.Cliente;


public class Main {

	//COMPLETE O CODIGO 

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
		
		// realize alguma operação que modifique valores em uma conta já cadastrada
		
		//consultarContas();
		//consultarExtrato(Cliente c);
		
		try {
			Conexao.getConnection().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	private static void consultarExtrato(Cliente c) {
		//Operacao.consultaTodosExtratos(Cliente c);
	}

	private static void consultarContas(Cliente c) {
		//Operacao.consultaContas();
	}
}
