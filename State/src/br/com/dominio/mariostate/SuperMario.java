package br.com.dominio.mariostate;

import br.com.dominio.state.State;

public class SuperMario implements State {

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um cogumelo: Mais 1000 pontos");
		return this;
	}

	@Override
	public State pegarFlorDeFogo() {
	
		System.out.println("Pegou uma flor: Mario atira fogo");
		return new FireMario();
	}
	

	@Override
	public State colidirComInimigo() {

		System.out.println("Colidiu com o inimigo: Volotu a ser mario normal");
		return new Mario();
	}

	@Override
	public State pegarEstrela() {

		System.out.println("Pegou uma estrela: Mario está invencivel");
		return new MarioInvencivel();
	}

	@Override
	public String retornarTipo() {

		return "Super Mario";
	}

}
