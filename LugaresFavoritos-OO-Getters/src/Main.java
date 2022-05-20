import java.io.IOException;
import java.net.URISyntaxException;

import Lugar.Lugar;


public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		
		Lugar objetoLugar = new Lugar("Praça");	
		
		objetoLugar.setNome("Bar do Zé"); // utilizando o set - alterando o nome
		
		objetoLugar.mostraNoMapa(); 
		
		

	}

}
