package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogicaFactorTest {


	@Test
	public void pruebaUno() {
		LogicaFactor LF = new LogicaFactor();
		assertEquals(2, LF.generate(2));
	}


	
	
}
