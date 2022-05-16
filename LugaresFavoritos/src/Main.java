import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {


		String lugar = "MercadoMunicipalDeSãoPaulo"; // se tiver mais de uma palavra não colocar espaços
		Double avaliacao = 5d/2d; // o "d" converte automaticamente os numeros de Integer para Double
		
		System.out.println(lugar);
		System.out.println(avaliacao);
		
		mostrarLugarNoMapa(lugar);

	}
	
	//Métodos e Funções são sinônimos
	private static void mostrarLugarNoMapa(String lugar) throws IOException, URISyntaxException {
		// url padrão pra abrir o google com a pesquisa que quiser
		Desktop.getDesktop().browse(new URI("https://www.google.com/maps/search/?api=1&query="+lugar));
		// métoo criado a partir da seleção da linha de codigo, botão direito e escolher Refactor/Extract Method...
	}

}
