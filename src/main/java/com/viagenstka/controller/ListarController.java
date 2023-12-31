package com.viagenstka.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viagenstka.dao.ClienteDAO;
import com.viagenstka.model.Cliente;

@WebServlet("/ListaClientes")
public class ListarController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            List<Cliente> clientes = clienteDAO.listarClientes();
            
          
            request.setAttribute("clientes", clientes);

            RequestDispatcher rd = request.getRequestDispatcher("ListaClientes.jsp");
            rd.forward(request, response);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}