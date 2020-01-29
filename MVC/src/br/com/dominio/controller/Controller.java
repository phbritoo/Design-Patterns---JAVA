package br.com.dominio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.dominio.model.Model;
import br.com.dominio.view.View;

public class Controller {

	private View view;
	private Model model;

	// Construtor
	public Controller(View view, Model model) {

		this.view = view;
		this.model = model;

		this.view.adiconarListener(new Listener());
	}

	class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			int numero1, numero2 = 0;

			try {
				numero1 = view.getPrimeiroNumero();
				numero2 = view.getSegundoNumero();

				model.somarNumeros(numero1, numero2);

				view.setResultado(model.getValor());
			} catch (Exception e2) {

				view.mensagemErro("Insira dois numeros inteiros");
			}
		}

	}

}
