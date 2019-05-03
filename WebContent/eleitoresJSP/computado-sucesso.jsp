<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/comum.css">
<link rel="stylesheet" type="text/css" href="./css/cssEleitores/votar.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="containerVotar" class="container containerVotar">
		<img alt="" src="./imgCandidatos/confirmado.jpg">
		<h1>Voto computado com sucesso!</h1>
		<form action="sistema?log=VoltarTelaInicial" method="POST" class="formCenter formCenterVotar">
			<button type="submit" id="btVoltar" class="botaoVoltar">Voltar</button>
	</form>
	</div>
</body>
</html>