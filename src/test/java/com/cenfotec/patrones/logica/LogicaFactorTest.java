package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogicaFactorTest {


	@Test
	public void pruebaUno() {
		LogicaFactor LF = new LogicaFactor();
		assertEquals(1, LF.generate(0));
	}

}
