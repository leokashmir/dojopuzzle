import interfaces.AppInterface;
import interfaces.AppInterfaceImpl;

public class MarisaApp {
	
	

	public static void main(String[] args) {
		
		
		AppInterface executa = new AppInterfaceImpl();
		executa.contabilizaBuracosTexto();
	
	}

}
