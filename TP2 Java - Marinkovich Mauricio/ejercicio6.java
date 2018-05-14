package test;

import java.util.Scanner;

public class ejercicio6 {
	
	private static Scanner teclado;
	
	static String nom;
	static int suel;
	
	public static void empleado(){
		teclado = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		nom = teclado.next();
		
		System.out.println("Ingrese Sueldo: ");
		suel = teclado.nextInt();
	}
	
	public static void datos(){
		System.out.println("Nombre: " + nom + ".");
		System.out.println("Sueldo: $" + suel + ".");
	}
	
	public static void main(String[] args){
		
		empleado();
		
		datos();
		
		if (suel <= 3000) {
			System.out.print("No paga impuestos.");
		}
		else {
			System.out.println("Debe pagar impuestos.");
		}
	}

}
