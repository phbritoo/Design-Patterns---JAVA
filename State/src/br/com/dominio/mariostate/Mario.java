package br.com.dominio.mariostate;

import br.com.dominio.state.State;

public class Mario implements State{

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um cogumelo: Tornou-se Super Mario");
		return new SuperMario();
	}

	@Override
	public State pegarFlorDeFogo() {
	
		System.out.println("3Pegou uma flor: Mario atira fogo");
		return new FireMario();
	}
	

	@Override
	public State colidirComInimigo() {

		System.out.println("4Colidiu com o inimigo: Mario Morto");
		return new MarioMorto();
	}

	@Override
	public State pegarEstrela() {

		System.out.println("2Pegou uma estrela: Mario está invencivel");
		return new MarioInvencivel();
	}

	@Override
	public String retornarTipo() {

		return "Mario Comum";
	}

}
