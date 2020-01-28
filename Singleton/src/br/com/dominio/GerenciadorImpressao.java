package br.com.dominio;

public class GerenciadorImpressao {

	//Criar uma variavel estatica do mesmo no da classe
	private static GerenciadorImpressao gerenciadorImpressao;
	
	//Declara um construtor privado sem parametros
	private GerenciadorImpressao() {
		
	}
	
	//Cria um metodo publico do gerenciador
	public static GerenciadorImpressao getInstance() {
		
		if (gerenciadorImpressao == null) {
			gerenciadorImpressao = new GerenciadorImpressao();
		}
		
		return gerenciadorImpressao;
	}
}
