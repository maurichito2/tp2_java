package test;

import java.util.Scanner;

public class ejercicio7 {
	
	static int num1, suma, resta;
	static int num2, multi, div;
	private static Scanner teclado;
	
	public static void operaciones(){
		teclado = new Scanner(System.in);
		
		System.out.print("Ingrese un valor: ");
		num1 = teclado.nextInt();
		
		System.out.print("Ingrese otro valor: ");
		num2 = teclado.nextInt();
	}
	
	static void suma() {
		suma = num1 + num2;
		System.out.println("Suma: " + suma);
	}
	
	static void resta() {
		resta = num1 - num2;
		System.out.println("Resta: " + resta);
	}
	
	static void multi() {
		multi = num1 * num2;
		System.out.println("Multiplicacion: " + multi);
	}
	
	static void div() {
		div = num1 / num2; 
		System.out.println("Division: " + div);
	}

	public static void main (String[] args) {
		operaciones();
		suma();
		resta();
		multi();
		div();
	}

}
