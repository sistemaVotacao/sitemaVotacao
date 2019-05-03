<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/comum.css">
<link rel="stylesheet" type="text/css"
	href="./css/cssEleitores/votar.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="containerVotar" class="container containerVotar">
		<div class="centralizarItens">
			<label for="imgCandidato" ><b>Deputado</b></label> <img
				alt="Candidato" src="./img/imgCandidatos/candidatoX.png" id="imgem"
				name="imgCandidato" width="100px" height="150px">
				<label id="nomeCandidato"></label>
			<form id="form" action="" method="post" class="formCenter formCenterVotar">
				<label><b>Nº Candidato:</b></label> <input type="text" name="entrada" id="entrada">
				<input type="hidden"  name="eleitor" id="eleitor" value="${ numeroEleitor }">
				<div id="conteinerBtnBrancoCorrigeConf"class="containerBotoesVotacao">
				<button type="submit" id="btnBranco">
					<b>BRANCO</b>
				</button>
				<button type="button" id="btnCorrige">
					<b>CORRIGE</b>
				</button>
				<button type="submit" id="btnConfirmar">
					<b>CONFIRMA</b>
				</button>
				</div>
			</form>
		</div>
	</div>
	<footer>
		<script type="text/javascript" src="./js/votar.js"></script>
		<script src="./jquery/jquery.js"></script>
		<script src="./jquery/jquery_votar.js"></script>
	</footer>

</body>
</html>