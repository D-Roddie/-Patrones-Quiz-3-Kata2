package com.cenfotec.patrones;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class KataDosApplication {
	static BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	static PrintStream out = System.out;
	public static void main(String[] args){
		
	
	}
	
	 public static void mostrarMenu() throws java.io.IOException {
	        boolean seguir;
	        int opcion;
	        seguir = true;
	        opcion = -1;
	        do {
	            out.println("---MENU PRINCIPAL---");
	            out.println("1. Ingresar números");
	            out.println("2. Imprimir factores primos");
	            out.println("Digite la opcion");
	            opcion = Integer.parseInt(in.readLine());
	            procesarOpcion(opcion);
	            out.println("La opcion ingresada fue: " + opcion);
	        } while (opcion != 9);
	    }
	 
	 public static void procesarOpcion(int pOpcion) throws IOException {

	        switch (pOpcion) {
	            case 1:
	            
	                break;


	            default:
	                out.println("Opción inválida");
	        }
}
