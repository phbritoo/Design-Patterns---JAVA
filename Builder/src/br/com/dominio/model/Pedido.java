package br.com.dominio.model;

import java.math.BigDecimal;
import java.util.List;

import javax.swing.JOptionPane;

public class Pedido {

	private String numeroPedido;
	private List<Produto> produtos;
	private Cliente cliente;
	private Vendendor vendendor;

	public BigDecimal getValorTotal() {
		BigDecimal total = BigDecimal.ZERO;

		for (Produto produto : produtos) {
			total = total.add(produto.getValor().multiply(new BigDecimal(produto.getQuantidade())));
		}

		return total;
	}

	public int getTotalProdutos() {
		int total = 0;
		for (Produto produto : produtos) {
			total += produto.getQuantidade();
		}
		
		return total;
	}
	
	public void informacoes() {

		System.out.println("Numero Pedido:" + getNumeroPedido());
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Vendedor: " + vendendor.getNome());
		System.out.println("Produto(s): " + getTotalProdutos());
		System.out.println("Valor Total: " + getValorTotal());
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendendor getVendendor() {
		return vendendor;
	}

	public void setVendendor(Vendendor vendendor) {
		this.vendendor = vendendor;
	}
	
	
	
}
