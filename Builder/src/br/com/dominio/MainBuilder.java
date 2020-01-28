package br.com.dominio;

import java.math.BigDecimal;

import br.com.dominio.builder.PedidoBuilder;
import br.com.dominio.model.Pedido;

public class MainBuilder {


	public static void main(String[] args) {
		
		Pedido pedido = new PedidoBuilder()
						.setPedido("9999")
						.setCliente(100, "Paulo", "(81 997626600")
						.setVendedor(123, "Vendendor 01")
						.setProduto("Caderno", 1, new BigDecimal(12.00))
						.setProduto("Lapis", 3, new BigDecimal(1.00))
						.setProduto("Borracha", 2, new BigDecimal(0.50))
						.builder();
		
		pedido.informacoes();
				
	}
}
