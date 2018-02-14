package com.cenfotec.patrones.logica;

public class LogicaFactor {

	public static void calcular_factor () {
		int numero = 0;
		int factor = 2;
		
		do {
			if(numero % factor == 0) {
				numero = numero/factor;
			} else {
				factor++;
			}
		}
		while (factor <= numero);
		
			}	
	}

