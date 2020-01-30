package br.com.dominio;

import br.com.dominio.pc.facade.ComputerFacade;

public class Main {
	public static void main(String[] args) {

		ComputerFacade facade = new ComputerFacade();
		facade.montarPC();
	}

}
