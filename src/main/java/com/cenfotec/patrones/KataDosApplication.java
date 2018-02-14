package com.cenfotec.patrones;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cenfotec.patrones.logica.LogicaFactor;


@SpringBootApplication
public class KataDosApplication {
	static BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	static PrintStream out = System.out;
	static LogicaFactor LF = new LogicaFactor();
	
	
	public static void main(String[] args) throws IOException{
		mostrarMenu();
	
	}
	
	 public static void mostrarMenu() throws java.io.IOException {
	        int opcion;
	        opcion = -1;
	        do {
	            out.println("---MENU PRINCIPAL---");
	            out.println("1. Ingresar números");
	            out.println("Digite la opcion");
	            opcion = Integer.parseInt(in.readLine());
	            procesarOpcion(opcion);
	            out.println("La opcion ingresada fue: " + opcion);
	        } while (opcion != 9);
	    }
	 
	 public static void procesarOpcion(int pOpcion) throws IOException {

	        switch (pOpcion) {
	            case 1:
	            	ingresar_numero();
	                break;


	            default:
	                out.println("Opción inválida");
	                }
	        }
	 
	 public static void ingresar_numero() {
		 int numero = 0;
		 System.out.println("Ingrese un número, para ver su factor primo:");
		 try {
			 numero = Integer.parseInt(in.readLine());
			 imprimir_primos(numero);
		 } catch (IOException e) {
			 
		 }
	 }
	 
	 public static void imprimir_primos(int numero) {
		 ArrayList<Integer> factores_primos = LF.generate(numero);
		 out.println(numero);
		 for (Integer factor: factores_primos) {
		 //for (int i = 0; i < factores_primos.size(); i++) {
			 System.out.print("[");
			 System.out.print(factor);
			 System.out.print("]");
			 
		 }
		 System.out.println();
	 }
}

