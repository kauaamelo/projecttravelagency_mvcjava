<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Criar Cadastro</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">	
	<style>
    .aligned-form {
        text-align: center;
    }

    .custom-label {
        width: 250px;
        display: inline-block;
    }
</style>
</head>
<body class="text-center">

<header>
        <nav class="navbar navbar-expand-lg navbar-light text-dark" style="background-color: #fcb653;">
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
                    </ul>
                </div>
            </div>
        </nav>
    </header>

	<h1 class="mt-4">Criar Cadastro</h1>
	<div class="container mt-4">
	
	<form action="CriarController" method="POST" class="text-center">
	
	<label class="custom-label" for="nome">Nome: </label>
	<input type="text" id="nomeCliente" name="nomeCliente" required>
	<br>
	<br>
	<label class="custom-label" for="nascimento">Data Nascimento: </label>
	<input type="date" id="dataNascimentoCliente" name="dataNascimentoCliente" required>
	<br>
	<br>
	<label class="custom-label" for="telefone">Telefone: </label>
	<input type="text" id="telefoneCliente" name="telefoneCliente" required>
	<br>
	<br>
	<label class="custom-label" for="login">Login: </label>
	<input type="text" id="loginCliente" name="loginCliente" required>
	<br>
	<br>
	<label class="custom-label" for="senha">Senha: </label>
	<input type="password" id="senhaCliente" name="senhaCliente" required>
	<br>
	<br>
	<input class="custom-label" type="submit" value="Registrar">
	
 	</form>
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