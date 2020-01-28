package br.com.dominio;

import javax.swing.JOptionPane;

import br.com.dominio.mensagem.Mensagem;
import br.com.dominio.mensagem.MensagemEmail;
import br.com.dominio.mensagem.MensagemFactory;
import br.com.dominio.mensagem.MensagemSMS;

public class Main {

	public static void main(String[] args) {


		String texto = JOptionPane.showInputDialog(null);

		//Sem Factory Method
		//Mensagem mensagem = new MensagemSMS();
		//mensagem.enviar(texto);
		//Mensagem mensagemEmail = new MensagemEmail();
		//mensagemEmail.enviar(texto);
		
		// Com Factory Method voce enxuga o codigo e so altera uma linha caso ele queira enviar mensagem por email ou por sms
		// SMS = 1 , EMAIL = 2
		Mensagem mensagem = MensagemFactory.getMensagem(2);
		mensagem.enviar(texto);
	}
}
