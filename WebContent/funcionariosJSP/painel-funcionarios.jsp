<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/comum.css">
<link rel="stylesheet" type="text/css" href="./css/cssFuncionarios/painel-funcionario.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container containerPainelMesario">
		<div class="containerFotoMesario">
			<img alt="Foto do Mesário" src="./img/imgMesarios/eu.jpeg"
				width="100px">
			<div class="containerInformacoes">
				<table>
					<tr>
						<td><b>Nome:</b></td>
						<td>${funcionario.eleitor.getNome()}</td>
					</tr>
					<tr>
						<td><b>Titulo:</b></td>
						<td>${funcionario.eleitor.getNumeroTituloEleitor()}</td>
					</tr>
					<tr>
						<td><b>Zona:</b></td>
						<td>${funcionario.eleitor.getZona().getIdZona()}</td>
					</tr>
					<tr>
						<td><b>Seção:</b></td>
						<td>${funcionario.eleitor.getSecaoEleitoral().getIdSecaoEleitoral()}</td>
					</tr>
				</table>
			</div>
			<img alt="Foto do Mesário" src="./img/imgMesarios/${funcionario.getCargo().getNomeCargo()}.png"
				width="300px"> <img
				alt="Tribunal Superior Eleitoral" src="./img/Tribunal.png"
				width="300px">
		</div>
		<div class="centralizarItens ${classe}">
			<button type="button" id="btRelatorio">RELATÓRIO</button>
			<button type="button" id="btAreaValidacao" class="botaoSelecionado">VALIDAÇÃO</button>
		</div>
		<div id="containerAreaValidacao" class="conteinerPainelValidação centralizarItens">
			<form action="sistema?log=LiberarEleitor" method="POST">
				<label><b>Nº Titulo Eleitor:</b></label>
				<input type="text" name="numeroEleitor" placeholder="Insira o número do título do eleitor" >
				<button type="submit" value="alksdj">VALIDAR</button>
			</form>
		</div>
		<div id="containerRelatorio" class="conteinerPainelRelatorio centralizarItensFlexStart">
			<h3>Total Votos = ${numeroVotos}</h3>
			<table>
				<tr>
					<th>Nome</th>
					<th>Titulo Eleitor</th>
				</tr>
				<c:forEach var = "eleitor" items="${eleitores}">
					<tr>
						<td>${eleitor.getNome()}</td>
						<td>${eleitor.getNumeroTituloEleitor()}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		
	</div>
	<footer>
		<script src="./jquery/jquery.js"></script>
		<script src="./jquery/jqueryFuncionario/jquery_painel-funcionario.js"></script>
	</footer>
</body>
</html>