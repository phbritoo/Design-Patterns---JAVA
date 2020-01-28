package br.com.dominio.builder;

import java.math.BigDecimal;
import java.util.ArrayList;

import br.com.dominio.model.Cliente;
import br.com.dominio.model.Pedido;
import br.com.dominio.model.Produto;
import br.com.dominio.model.Vendendor;

public class PedidoBuilder {

	private Pedido instancia;
	
	public PedidoBuilder() {
		this.instancia = new Pedido();
	}
	
	public PedidoBuilder setPedido(String numeroPedido) {
		instancia.setNumeroPedido(numeroPedido);
		return this;
	}
	
	public PedidoBuilder setCliente(int codigo, String nome, String telefone) {
		Cliente cliente = new Cliente();
		cliente.setCodigo(codigo);
		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		
		instancia.setCliente(cliente);
		
		return this;
	}
	
	public PedidoBuilder setVendedor(int codigo, String nome) {
		Vendendor vendendor = new Vendendor();
		vendendor.setCodigo(codigo);
		vendendor.setNome(nome);
		
		instancia.setVendendor(vendendor);
		
		return this;
	}
	
	public PedidoBuilder setProduto(String nome, int quantidade, BigDecimal valor) {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setQuantidade(quantidade);
		produto.setValor(valor);
		
		if (instancia.getProdutos() == null) {
			instancia.setProdutos(new ArrayList<>());
		}
		
		instancia.getProdutos().add(produto);		
		return this;
	}
	
	public Pedido builder() {
		return instancia;

	}
	
}