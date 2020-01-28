package br.com.dominio;

import java.math.BigDecimal;

import br.com.dominio.loja.LojaCentroDaInformatica;
import br.com.dominio.model.Produto;
import br.com.dominio.venda.Venda;
import br.com.dominio.venda.VendaFactory;

public class Main {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setNome("Iphone 11 Max");
		produto.setQuantidade(1);
		produto.setValorUnitario(new BigDecimal(1000));
		
		VendaFactory factory = new LojaCentroDaInformatica();
		
		Venda venda = new Venda(factory);
		
		venda.realizarVenda(produto);

	}

}
