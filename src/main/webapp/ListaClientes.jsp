<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar e Deletar</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body class="text-center">

    <header>
        <nav class="navbar navbar-expand-lg text-dark" style="background-color: #fcb653;">
            <div class="container">
                <a class="navbar-brand" href="#"><img src="./imgs/LogoTkaViagem.png" height="48px"/> </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                            <a href="./index.html" class="nav-link text-dark">Home</a>
                        </li>
                        <li class="nav-item">
                           <a href="ListaClientes" class="nav-link text-dark">Clientes</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-dark" href="./CadastroViagens.jsp">Registre-se</a>
                        </li>         
                    </ul>
                </div>
            </div>
        </nav>
    </header>
	<h1 class="mt-4">Lista de Clientes</h1>
	<div class="container mt-5">
	<a href="./CadastroViagens.jsp" class="btn btn-success mb-4">Criar Novo</a>
	<a href="ListaClientes" class="btn btn-danger mb-4">Inicio</a>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Data de Nascimento</th>
					<th>Telefone</th>
					<th>Login</th>
					<th>Editar/Excluir</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${clientes}" var="cliente">
					<tr>
						<td>${cliente.idCliente}</td>
						<td>${cliente.nomeCliente}</td>
						<td>${cliente.dataNascimentoCliente}</td>
						<td>${cliente.telefoneCliente}</td>
						<td>${cliente.loginCliente}</td>
						<td>
								<a href="AtualizarCliente?idCliente=${cliente.idCliente}" class="btn btn-success">Editar</a>
							<a href="DeletarCliente?idCliente=${cliente.idCliente}"
							class="btn btn-danger">Excluir</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
    <footer class="text-dark text-center py-2 fixed-bottom" style="background-color: #fcb653;">
        &copy; 2023 Viagens TKA. Todos os direitos reservados.
    </footer>
	
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>