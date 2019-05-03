package br.com.fatec.geradoresSenhaNumeroTitulo;

import java.util.Random;

public class GeradorSenha {
	private static final String CARACTERES ="0123456789abcdefghijklmnopqrstuvwxyz";
	private static Random gerador = new Random();
	private static String senha;
	public static String gerarSenha() {
		for(int i = 0; i < 9; i++) {
			senha.concat(CARACTERES).charAt(gerador.nextInt(CARACTERES.length()));
		}
		return senha;
		
	}
}
