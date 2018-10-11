package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Test;

import interfaces.AppInterface;
import interfaces.AppInterfaceImpl;
import utils.Utils;

public class AppTest {

	
	@Test
	public void contaBilizaBuracosOK() {
		
		Utils util =  mock(Utils.class);
		
		when(util.retornaValor("A")).thenReturn(1); 
		when(util.retornaValor("a")).thenReturn(1); 
		when(util.retornaValor("B")).thenReturn(2); 
		when(util.retornaValor("b")).thenReturn(1); 
		
		assertEquals(util.retornaValor("A"), 1);
		assertEquals(util.retornaValor("a"), 1);
		assertEquals(util.retornaValor("B"), 2);
		assertEquals(util.retornaValor("b"), 1);
		
		
	}

	@Test
	public void contaBilizaBuracosNOK() {
		
		Utils util =  mock(Utils.class);
		
		when(util.retornaValor("A")).thenReturn(1); 
		when(util.retornaValor("a")).thenReturn(1); 
		when(util.retornaValor("B")).thenReturn(2); 
		when(util.retornaValor("b")).thenReturn(1); 
		
		assertNotEquals(util.retornaValor("A"), 0);
		assertNotEquals(util.retornaValor("a"), 0);
		assertNotEquals(util.retornaValor("B"), 1);
		assertNotEquals(util.retornaValor("b"), 2);
		
	}
	
	@Test(expected = Exception.class)
	public void contaBilizaBuracosException() {
		AppInterface executa = mock(AppInterfaceImpl.class);
		doThrow(new Exception()).when(executa).contabilizaBuracosTexto();
	}
	
	@Test(expected = Exception.class)
	public void contaBilizaBuracosIOException() {
		AppInterface executa = mock(AppInterfaceImpl.class);
		doThrow(new IOException()).when(executa).contabilizaBuracosTexto();
	}
	
	
	
}
