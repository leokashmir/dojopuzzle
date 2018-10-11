package utils;
import java.util.HashMap;
import java.util.Map;

public class Utils {

	public int retornaValor(String a) {
		
		int retorno = 0;
		
		Map<String, Integer> lista =  new HashMap<String, Integer>();
		lista.put("A", 1);
		lista.put("B", 2);
		lista.put("D", 1);
		lista.put("O", 1);
		lista.put("P", 1);
		lista.put("Q", 1);
		lista.put("R", 1);
		lista.put("a", 1);
		lista.put("b", 1);
		lista.put("d", 1);
		lista.put("e", 1);
		lista.put("g", 1);
		lista.put("o", 1);
		lista.put("p", 1);
		lista.put("q", 1);
		
		if (lista.containsKey(a)) {
			retorno = lista.get(a);
		}
		
		return retorno;
	}
}
