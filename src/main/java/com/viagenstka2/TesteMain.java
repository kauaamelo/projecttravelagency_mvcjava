package com.viagenstka2;

import com.viagenstka.dao.ClienteDAO;
import com.viagenstka.model.Cliente;
import java.sql.SQLException;
import java.time.LocalDate;

public class TesteMain {
	
	/*public static void testeMain(String[] args) throws SQLException {

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = new Cliente();
		
		cliente.setIdCliente(1);
		cliente.setNomeCliente("Kauã Alves");
		cliente.setDataNascimentoCliente(LocalDate.of(1996, 1, 2));
		cliente.setTelefoneCliente("22997456646");
		cliente.setLogin("kaua_amelo2020");
		cliente.setSenha("laranja4444");

		clienteDAO.atualizarCliente(cliente);
		
		System.out.println("ID - CLIENTE: " + cliente.getIdCliente());
        System.out.println("NOME: " + cliente.getNomeCliente());
        System.out.println("DATA DE NASCIMENTO: " + cliente.getDataNascimentoCliente());
        System.out.println("TELEFONE: " + cliente.getTelefoneCliente());
        System.out.println("LOGIN: " + cliente.getLogin());
        System.out.println("SENHA: " + cliente.getSenha());
        System.out.println("");

		}*/
	
	
	/*public static void main(String[] args) throws SQLException {

	ClienteDAO clienteDAO = new ClienteDAO();
	Cliente cliente = new Cliente();

	cliente.setNomeCliente("Kauã Alves");
		cliente.setDataNascimentoCliente(LocalDate.of(1996, 1, 2));
		cliente.setTelefoneCliente("22997456646");
		cliente.setLoginCliente("kaua_amelo2020");
		cliente.setSenhaCliente("laranja4444");

	clienteDAO.criarCliente(cliente);

	}*/
	
	/*public static void main(String[] args) throws SQLException {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = new Cliente();
		
		clienteDAO.mostrarCliente(1);
				
	}*/
	
	/*public static void testeMain(String[] args) throws SQLException {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		
		clienteDAO.deletarCliente(1);
		
	}*/
	
	
}
