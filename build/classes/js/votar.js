document.getElementById("entrada").addEventListener("input", criar10btn);
function criar10btn() {
	if(document.getElementById("entrada").value == "14"){
		document.getElementById("imgem").src = 'https://upload.wikimedia.org/wikipedia/commons/d/da/Lula_-_foto_oficial05012007.jpg';
	}
	else if(document.getElementById("entrada").value == "17"){
		document.getElementById("imgem").src = 'https://pt.wikipedia.org/wiki/Jair_Bolsonaro#/media/File:Presidente_Bolsonaro.png';
		
	}
};
//