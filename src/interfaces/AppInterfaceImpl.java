package interfaces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import utils.Utils;

public class AppInterfaceImpl extends Utils  implements AppInterface {

	private Integer soma;
	
	@Override
	public void contabilizaBuracosTexto() {
		soma = 0;
		
		
		try {
			Path arquivo = Paths.get("resoucer\\texto.txt");
			
			Files.lines(arquivo).forEach(linha -> {
				Arrays.asList(linha.split("")).forEach(letra-> {
						soma += retornaValor(letra);
				});
				
			});
			
			System.out.println(" Soma == > " + soma);
		
		} catch (IOException | NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
		

	}

}
