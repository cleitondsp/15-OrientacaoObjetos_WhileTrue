package Lugar;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Lugar {
		
		// private Double avaliacao;
		private String nome;

	public Lugar(String stringQualquer) {
			this.nome = stringQualquer.toUpperCase(); // coloca em capslock o conteúdo antes de guardar na variavel "nome"
		}

	public void mostraNoMapa() throws IOException, URISyntaxException {
		String nomeUrl = this.nome.replace(" ", "%20"); // consertando o erro de nomes com espaço, substituindo por %20
		Desktop.getDesktop().browse(new URI("https://www.google.com/maps/search/?api=1&query=" + nomeUrl));		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	
	
	

}
