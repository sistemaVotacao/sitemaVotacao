package br.com.fatec.geradoresSenhaNumeroTitulo;

import java.util.Random;

public class GeradorNumeroTitulo {
	private final String NUMEROS;
	private Random gerador;
	private String numeroTitulo;
	public GeradorNumeroTitulo() {
		gerador = new Random();
		NUMEROS = "0123456789";
	}
	public  String gerarNumeroTitulo() {
		for(int i = 0; i < 9; i++) {
			System.out.println(numeroTitulo.concat(NUMEROS).charAt(gerador.nextInt(3)));
		}
		return numeroTitulo;
		
	}
}
