package br.com.vivareal.test;

import junit.framework.TestCase;

//class just to make my experience with JUnit

public class JunitTest extends TestCase{
	public void testCreate(){
		PropertyForJUnitTest properties = new PropertyForJUnitTest("Property", 1);
		
		int id = 1;
		
		
		String retorno = new String("Nome: Property" + "\nId: 1");
		String retornado = properties.search(id);
		assertEquals(retorno, retornado);
	}
}