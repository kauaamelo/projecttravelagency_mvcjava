package com.viagenstka.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viagenstka.dao.ClienteDAO;
import com.viagenstka.model.Cliente;

@WebServlet("/AtualizarCliente")
public class AtualizarController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("idCliente"));
		
		try {
			ClienteDAO clienteDAO = new ClienteDAO();
			Cliente cliente = clienteDAO.mostrarCliente(id);		
			request.setAttribute("cliente", cliente);		
			RequestDispatcher rd = request.getRequestDispatcher("AtualizarCliente.jsp");
			rd.forward(request, response);				
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Cliente cliente = new Cliente();
			cliente.setIdCliente(Integer.parseInt(request.getParameter("idCliente")));
			cliente.setNomeCliente(request.getParameter("nomeCliente"));
			cliente.setDataNascimentoCliente(LocalDate.parse(request.getParameter("dataNascimentoCliente")));
			cliente.setTelefoneCliente(request.getParameter("telefoneCliente"));
			cliente.setLoginCliente(request.getParameter("loginCliente"));
			cliente.setSenhaCliente(request.getParameter("senhaCliente"));

			
			ClienteDAO clienteDAO = new ClienteDAO();
			clienteDAO.atualizarCliente(cliente);
			
			response.sendRedirect("ListaClientes");
		} catch (Exception e) {
	}

}
}
