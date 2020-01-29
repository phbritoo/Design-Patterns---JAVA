package br.com.dominio.service;

import java.math.BigDecimal;

import br.com.dominio.model.Produto;

public class CalculoPrecoComBrinde implements CalculoPreco {

	private CalculoPreco calculo;

	public CalculoPrecoComBrinde(CalculoPreco calculo) {
		this.calculo = calculo;
	}
	
	@Override
	public BigDecimal valorFinal(Produto produto) {
		//Sempre tem que chamar o esse metodo
		BigDecimal valorFinal = calculo.valorFinal(produto);
		
		BigDecimal brinde = new BigDecimal("100.0");
		valorFinal = valorFinal.add(brinde);
		
		return valorFinal;
	}

}
