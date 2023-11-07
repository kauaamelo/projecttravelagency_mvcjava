package com.viagenstka.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.viagenstka.database.ConnectionSql;
import com.viagenstka.model.Cliente;

public class ClienteDAO {

	private static String sql;
	private final Connection connection;

	public ClienteDAO() throws SQLException {
		connection = ConnectionSql.createConnection();
	}

	public void closeConnection() {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}

	public void criarCliente(Cliente cliente) {
		sql = "INSERT INTO CLIENTE (nomeCliente, dataNascimentoCliente, telefoneCliente, loginCliente, senhaCliente) VALUES (?, ?, ?, ?, ?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {

			stmt.setString(1, cliente.getNomeCliente());
			Date data = Date.valueOf(cliente.getDataNascimentoCliente());

			stmt.setDate(2, data);
			stmt.setString(3, cliente.getTelefoneCliente());
			stmt.setString(4, cliente.getLoginCliente());
			stmt.setString(5, cliente.getSenhaCliente());

			stmt.executeUpdate();

			System.out.println("CADASTRADO!");

		} catch (SQLException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}
	
	public Cliente mostrarCliente(int idCliente) {
		Cliente cliente = null;
		sql = "SELECT * FROM cliente WHERE idCliente=?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			
			stmt.setInt(1, idCliente);
			ResultSet resultado = stmt.executeQuery();
			
			if (resultado.next()) {
				cliente = new Cliente();
				cliente.setIdCliente(resultado.getInt("idCliente"));
				cliente.setNomeCliente(resultado.getString("nomeCliente"));
				cliente.setDataNascimentoCliente(resultado.getDate("dataNascimentoCliente").toLocalDate());
				cliente.setTelefoneCliente(resultado.getString("telefoneCliente"));
				cliente.setLoginCliente(resultado.getString("loginCliente"));
				cliente.setSenhaCliente(resultado.getString("senhaCliente"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}
	
	public List<Cliente> listarClientes() {
	    String sql = "SELECT * FROM cliente";
	    List<Cliente> clientes = new ArrayList<Cliente>();
	    ResultSet resultado = null;

	    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
	        resultado = stmt.executeQuery();
	        
	        while (resultado.next()) {
	            Cliente cliente = new Cliente();
	            cliente.setIdCliente(resultado.getInt("idCliente"));
	            cliente.setNomeCliente(resultado.getString("nomeCliente"));
	            cliente.setDataNascimentoCliente(resultado.getDate("dataNascimentoCliente").toLocalDate());
	            cliente.setTelefoneCliente(resultado.getString("telefoneCliente"));
	            cliente.setLoginCliente(resultado.getString("loginCliente"));
	            cliente.setSenhaCliente(resultado.getString("senhaCliente"));

	            clientes.add(cliente);
	        }
	    } catch (SQLException e) {
	        System.out.println("ERRO: " + e.getMessage());
	    }
	    return clientes;
	}

	public void atualizarCliente(Cliente cliente) {
		sql = "UPDATE cliente SET nomeCliente = ?, dataNascimentoCliente = ?, telefoneCliente = ?, loginCliente = ?, senhaCliente = ? WHERE idCliente = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {

			stmt.setString(1, cliente.getNomeCliente());
			Date data = Date.valueOf(cliente.getDataNascimentoCliente());

			stmt.setDate(2, data);
			stmt.setString(3, cliente.getTelefoneCliente());
			stmt.setString(4, cliente.getLoginCliente());
			stmt.setString(5, cliente.getSenhaCliente());
			stmt.setInt(6, cliente.getIdCliente());
			stmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}

	public void deletarCliente(int idCliente) {
		sql = "DELETE FROM cliente WHERE idCliente = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {

			stmt.setInt(1, idCliente);
			stmt.execute();

			System.out.println("Cliente Deletado!");

		} catch (SQLException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}

}
