package br.com.dominio.state;

public interface State {

	public State pegarCogumelo();

	public State pegarFlorDeFogo();

	public State colidirComInimigo();

	public State pegarEstrela();

	public String retornarTipo();

}
