<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Atualizar Cliente</title>
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

<div class="container">
		<div class="row justify-content-center text-left">
			<div class="col-md-5">
				<h1 class="mt-5" >Atualizar Cliente</h1>
				
				<form class="mt-5" action="AtualizarCliente" method="post">
    <div class="form-group">
        <label for="idCliente">ID:</label>
        <input type="text" class="form-control" id="idCliente" name="idCliente" value="${cliente.idCliente}" readonly>
    </div>
    <div class="form-group">
        <label for="nomeCliente">Nome:</label>
        <input type="text" class="form-control" id="nomeCliente" name="nomeCliente" value="${cliente.nomeCliente}" required>
    </div>
    <div class="form-group">
        <label for="dataNascimentoCliente">Data de Nascimento:</label>
        <input type="date" class="form-control" id="dataNascimentoCliente" name="dataNascimentoCliente" value="${cliente.dataNascimentoCliente}" required>
    </div>
    <div class="form-group">
        <label for="telefoneCliente">Telefone:</label>
        <input type="text" class="form-control" id="telefoneCliente" name="telefoneCliente" value="${cliente.telefoneCliente}" required>
    </div>
    <div class="form-group">
        <label for="loginCliente">Login:</label>
        <input type="text" class="form-control" id="loginCliente" name="loginCliente" value="${cliente.loginCliente}" required>
    </div>
    
    <div class="form-group">
        <label for="loginCliente">Senha:</label>
        <input type="password" class="form-control" id="senhaCliente" name="senhaCliente" value="${cliente.senhaCliente}" required>
    </div>
    
    <button type="submit" class="btn btn-primary">Atualizar</button>
    
    <c:if test="${not empty sucesso}">
    <div class="alert alert-success">
        ${sucesso}
    </div>
	</c:if>

</form>		

		</div>
		</div>
		</div>

<footer class="text-dark text-center py-2" style="background-color: #fcb653;">
        &copy; 2023 Viagens TKA. Todos os direitos reservados.
    </footer>
	
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>