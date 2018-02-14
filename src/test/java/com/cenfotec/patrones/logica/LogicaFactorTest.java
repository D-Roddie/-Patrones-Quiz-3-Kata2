package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class LogicaFactorTest {
	
	static LogicaFactor logicaPrueba = new LogicaFactor();


	@Test
	public void pruebaUno() {
		ArrayList<Integer> Factores = new ArrayList<>();
		Factores.add(2);
		assertEquals(Factores, logicaPrueba.generate(2));
	}
	
	@Test 
	public void pruebaDos() {
		ArrayList<Integer> Factores = new ArrayList<>();
		Factores.add(1);
		assertEquals(Factores, logicaPrueba.generate(0));
	}
	
	@Test 
	public void pruebaTres() {
		ArrayList<Integer> Factores = new ArrayList<>();
		Factores.add(2);
		Factores.add(3);
		assertEquals(Factores, logicaPrueba.generate(6));
	}



	
	
}
