package test;

import java.util.Scanner;

public class ejercicio8 {

	private static Scanner teclado;
	static String nom;
	static int edad;
	
	public static void cargar() {
		teclado = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		nom=teclado.next();
		
		System.out.print("Edad: ");
		edad=teclado.nextInt();
	}
	
	public static void imprimir() {
		System.out.print("\nNombre: " + nom + "\n");
		System.out.print("Edad: " + edad + "\n");
	}
	
	public static void main(String[] args) {
		cargar();
		empleado empleado1 = new empleado();
		empleado1.CargarSueldo();
		imprimir();
		empleado1.ImprimirSueldo();
	}
}