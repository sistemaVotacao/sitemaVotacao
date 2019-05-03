<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/comum.css">
<link rel="stylesheet" type="text/css" href="css/index.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container tamanhoContainerIndex">
		<img alt="Tribunal Superior Eleitoral" src="img/Tribunal.png">
		<h1>${textoErro}</h1>
		<form action="sistema?log=VoltarTelaInicial" method="POST" class="containerBotoes">
			<button type="submit" id="btVoltar" class="botaoVoltar">Voltar</button>
		</form>
		
		
	</div>
</body>
</html>