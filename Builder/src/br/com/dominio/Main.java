package br.com.dominio;

import java.math.BigDecimal;
import java.util.ArrayList;

import br.com.dominio.model.Cliente;
import br.com.dominio.model.Pedido;
import br.com.dominio.model.Produto;
import br.com.dominio.model.Vendendor;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(100);
		cliente.setNome("Carlos");
		cliente.setTelefone("(81) 997626-6600");
		
		Vendendor vendendor = new Vendendor();
		vendendor.setCodigo(1);
		vendendor.setNome("João");
		
		Produto produto = new Produto();
		produto.setNome("Caderno");
		produto.setQuantidade(1);
		produto.setValor(new BigDecimal(10.00));
		
		Produto produto2 = new Produto();
		produto2.setNome("Caneta");
		produto2.setQuantidade(2);
		produto2.setValor(new BigDecimal(1.50));
		
		Pedido pedido = new Pedido();
		pedido.setNumeroPedido("000001");
		pedido.setCliente(cliente);
		pedido.setVendendor(vendendor);
		pedido.setProdutos(new ArrayList<>());
		pedido.getProdutos().add(produto);
		pedido.getProdutos().add(produto2);
		
		pedido.informacoes();
		
	}
}
