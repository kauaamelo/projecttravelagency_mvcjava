package com.viagenstka.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viagenstka.dao.ClienteDAO;
import com.viagenstka.model.Cliente;

@WebServlet("/CriarController")
public class CriarController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			Cliente cliente = new Cliente();
			
			cliente.setNomeCliente(request.getParameter("nomeCliente"));
			cliente.setDataNascimentoCliente(LocalDate.parse(request.getParameter("dataNascimentoCliente")));
			cliente.setTelefoneCliente(request.getParameter("telefoneCliente"));
			cliente.setLoginCliente(request.getParameter("loginCliente"));
			cliente.setSenhaCliente(request.getParameter("senhaCliente"));
			
			try {
				ClienteDAO clienteDAO = new ClienteDAO();
				clienteDAO.criarCliente(cliente);
				
				response.sendRedirect("ListaClientes");
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

}
