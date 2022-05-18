import java.io.IOException;
import java.net.URISyntaxException;

import Lugar.Lugar;


public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		
		Lugar mercado = new Lugar("Praça");	// criando uma variável "mercado" do tipo "Lugar"
		Lugar barDoZe = new Lugar("BarDoZe");
		
		// mercado.nome = "Praça";  // alterando o valor do atributo "nome" no objeto de tipo "Lugar" para "Praça"
		
		mercado.mostraNoMapa();  // chamando um método dentro do objeto Lugar
		barDoZe.mostraNoMapa();

	}
	
	// CTRL + SHIFT + O - retira todos os imports que não estão sendo utlizados

}
