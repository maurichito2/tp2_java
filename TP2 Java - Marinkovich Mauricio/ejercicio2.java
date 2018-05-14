package test;

import java.util.Scanner;

public class ejercicio2 {

	private static Scanner teclado;
	
	public static void main(String[] args) {
		
		int numero;
		int digitos;
		
		teclado = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		numero=teclado.nextInt();
		
		digitos = Integer.toString(numero).length();
		
		System.out.print("Su numero tiene " + digitos + " Digitos");
	}

}