package br.com.dominio;

import br.com.dominio.adapter.CotacaoAdapter;

public class Main {
	
	public static void main(String[] args) {
		
		CotacaoAdapter cotacaoAdapter  = new CotacaoAdapter();
		cotacaoAdapter.setValor(1.00);
		
		System.out.println("R$: " + cotacaoAdapter.getValor());
		System.out.println("$: " + cotacaoAdapter.getValorDolar());
	}

}
