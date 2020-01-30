package br.com.dominio.adapter;

public class CotacaoAdapter extends Cotacao {

	@Override
	public void setValor(double valor) {
		
		super.setValor(valor / 3.00);
	}

	@Override
	public double getValor() {
		
		return (super.getValor() * 300);
	}
	
	public double getValorDolar() {
		return super.getValor();
	}
}
