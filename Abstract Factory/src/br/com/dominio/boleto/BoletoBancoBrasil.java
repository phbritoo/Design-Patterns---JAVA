package br.com.dominio.boleto;

import br.com.dominio.model.Produto;

public class BoletoBancoBrasil implements Boleto {

	@Override
	public void emitir(Produto produto, double imposto) {
		System.out.println("BANCO DO BRASIL");
		System.out.println("==========================================================");
		System.out.println("Descrição: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor: R$" + produto.getValorUnitario());
		System.out.println("Imposto: " + imposto);
		System.out.println("Valor Total: R$" + produto.getValorTotal(imposto));
	}

}
