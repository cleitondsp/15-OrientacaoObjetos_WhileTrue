import java.io.IOException;
import java.net.URISyntaxException;

import Lugar.Lugar;


public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		
		Lugar mercado = new Lugar();	// criando uma vari�vel "mercado" do tipo "Lugar"
		
		mercado.nome = "Pra�a";  // alterando o valor do atributo "nome" no objeto de tipo "Lugar" para "Pra�a"
		
		mercado.mostraNoMapa();  // chamando um m�todo dentro do objeto Lugar

	}

}
