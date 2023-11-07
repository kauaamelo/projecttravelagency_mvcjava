package com.viagenstka.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viagenstka.dao.ClienteDAO;

@WebServlet("/DeletarCliente")
public class DeletarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int idCliente = Integer.parseInt(request.getParameter("idCliente"));
		
		try {
			ClienteDAO clienteDAO = new ClienteDAO();
			clienteDAO.deletarCliente(idCliente);
			
			response.sendRedirect("ListaClientes");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
