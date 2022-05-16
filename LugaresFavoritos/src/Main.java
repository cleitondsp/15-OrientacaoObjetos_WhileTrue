import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {


		String lugar = "MercadoMunicipalDeS�oPaulo"; // se tiver mais de uma palavra n�o colocar espa�os
		Double avaliacao = 5d/2d; // o "d" converte automaticamente os numeros de Integer para Double
		
		System.out.println(lugar);
		System.out.println(avaliacao);
		
		mostrarLugarNoMapa(lugar);

	}
	
	//M�todos e Fun��es s�o sin�nimos
	private static void mostrarLugarNoMapa(String lugar) throws IOException, URISyntaxException {
		// url padr�o pra abrir o google com a pesquisa que quiser
		Desktop.getDesktop().browse(new URI("https://www.google.com/maps/search/?api=1&query="+lugar));
		// m�too criado a partir da sele��o da linha de codigo, bot�o direito e escolher Refactor/Extract Method...
	}

}
