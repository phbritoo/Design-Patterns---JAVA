package br.com.dominio;

import br.com.dominio.mariostate.Mario;
import br.com.dominio.state.State;

public class Main {
	public static void main(String[] args) {

		State mario = new Mario();

		mario = mario.pegarCogumelo();
		mario = mario.pegarFlorDeFogo();
		mario = mario.pegarCogumelo();

		mario = mario.colidirComInimigo();
		mario = mario.colidirComInimigo();
		mario = mario.colidirComInimigo();

		System.out.println();
		System.out.println("Estado Final: " + mario.retornarTipo());
	}

}
