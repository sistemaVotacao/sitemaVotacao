<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/comum.css">
<link rel="stylesheet" type="text/css" href="css/index.css">
<script type="text/javascript" src="js/index.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container tamanhoContainerIndex">
		<img alt="Tribunal Superior Eleitoral" src="img/Tribunal.png">
		<div id="containerBotoes" class = "containerBotoes centralizarItens">
			<button class="botao" id="btVotar" onclick="formulario('Nº Titulo de Eleitor:')">VOTAR</button>
			<button class="botao" id="btAreaMesario" onclick="formulario('Nº Registro:')">MESARIO</button>
			<button class="botao" id="btAreaSupervisor" onclick="formulario('Nº Registro:')">SUPERVISOR</button>
		</div >
		<div id="containerForm" class="classeInicial">
			<form id="form" action="" method="POST">
				<label for="numeroUsuario" id="lbInserirNumero"></label>
				<input type="text" name="numeroUsuario" id= "nUsuario">
				<label for="fSenhaFuncionario"><b>Senha:</b></label>
				<input type="password" name="fSenhaFuncionario" id="senha">
				<button type="submit" value="LOGAR" id="btLogar">LOGAR</button>
				<button type="button" id="btVoltar" class="botaoVoltar">Voltar</button>
			</form>
		</div>
	</div>
	<footer>
		<script src="jquery/jquery.js"></script>
		<script src="jquery/jquery_index.js"></script>
	</footer>
</body>
</html>