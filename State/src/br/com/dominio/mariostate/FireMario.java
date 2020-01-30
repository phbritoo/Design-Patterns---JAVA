package br.com.dominio.mariostate;

import br.com.dominio.state.State;

public class FireMario implements State {

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um cogumelo:  Mais 1000 pontos");
		return this;
	}

	@Override
	public State pegarFlorDeFogo() {
	
		System.out.println("Pegou uma flor: Continua com poderes de fogo");
		return this;
	}
	

	@Override
	public State colidirComInimigo() {

		System.out.println("Colidiu com o inimigo: Voltou a ser Super Mario");
		return new SuperMario();
	}

	@Override
	public State pegarEstrela() {

		System.out.println("Pegou uma estrela: Mario est� invencivel");
		return new MarioInvencivel();
	}

	@Override
	public String retornarTipo() {

		return "Mario Fogo";
	}

}
