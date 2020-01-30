package br.com.dominio.mariostate;

import br.com.dominio.state.State;

public class MarioInvencivel implements State {

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um cogumelo: Seu estado ainda é invencivel");
		return this;
	}

	@Override
	public State pegarFlorDeFogo() {
	
		System.out.println("Pegou uma flor: Seu estado ainda é invencivel");
		return this;
	}
	

	@Override
	public State colidirComInimigo() {

		System.out.println("Colidiu com o inimigo: o inimigo morreu");
		return this;
	}

	@Override
	public State pegarEstrela() {

		System.out.println("Pegou uma estrela: Seu estado ainda é invencivel");
		return this;
	}

	@Override
	public String retornarTipo() {

		return "Mario Invencivel";
	}

}
