import java.io.IOException;
import java.net.URISyntaxException;

import Lugar.Lugar;


public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		
		Lugar mercado = new Lugar();	// criando uma variável "mercado" do tipo "Lugar"
		
		mercado.nome = "Praça";  // alterando o valor do atributo "nome" no objeto de tipo "Lugar" para "Praça"
		
		mercado.mostraNoMapa();  // chamando um método dentro do objeto Lugar

	}

}
