package br.com.dominio;

import br.com.dominio.controller.Controller;
import br.com.dominio.model.Model;
import br.com.dominio.view.View;

public class Main {

	public static void main(String[] args) {
		
		View view = new View();
		Model model= new Model();
		Controller controller = new Controller(view, model);
		
		view.setVisible(true);
		
	}
}
