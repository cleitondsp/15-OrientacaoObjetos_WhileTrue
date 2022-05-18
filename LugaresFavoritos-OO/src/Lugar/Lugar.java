package Lugar;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Lugar {
		
		public Double avaliacao;
		public String nome;

	public Lugar(String stringQualquer) {
			this.nome = stringQualquer;
		}

	public void mostraNoMapa() throws IOException, URISyntaxException {

		Desktop.getDesktop().browse(new URI("https://www.google.com/maps/search/?api=1&query=" + nome));		
	}

}
