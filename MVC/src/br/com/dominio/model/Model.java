package br.com.dominio.model;

public class Model {
	
	private int valor;
	
	public void somarNumeros(int numero1, int numero2) {
		this.valor  = numero1 + numero2;
	}
	
	public int getValor() {
		return valor;
	}
	

}
