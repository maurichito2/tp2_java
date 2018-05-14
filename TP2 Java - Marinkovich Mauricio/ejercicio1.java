package test;

import java.util.Scanner;

public class ejercicio1 {
	
	private static Scanner teclado;
	
	public static void main(String[] args) {
		
		int precio;
		int cantidad;
		int suma;
		
		teclado = new Scanner(System.in);
		
		System.out.print("Precio del Articulo: $");
		precio=teclado.nextInt();
		
		System.out.print("Cantidad de Articulos a llevar: ");
		cantidad=teclado.nextInt();
		
		suma = precio*cantidad;
		System.out.print("Total a pagar: $" + suma);
	}

}
