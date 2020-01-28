package br.com.dominio;

public class Main {

	public static void main(String[] args) {

		//Singleton = Os quatros objetos deverao ter o mesmo endereco de memoria
		
		// Sem Singleton
		//GerenciadorImpressao g1 = new GerenciadorImpressao();
		//GerenciadorImpressao g2 = new GerenciadorImpressao();
		//GerenciadorImpressao g3 = new GerenciadorImpressao();
		//GerenciadorImpressao g4 = new GerenciadorImpressao();
		
		// Com Singleton
		GerenciadorImpressao g1 = GerenciadorImpressao.getInstance();
		GerenciadorImpressao g2 = GerenciadorImpressao.getInstance();
		GerenciadorImpressao g3 = GerenciadorImpressao.getInstance();
		GerenciadorImpressao g4 = GerenciadorImpressao.getInstance();
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);

	}

}
