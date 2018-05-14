package test;

import java.util.Scanner;

public class empleado extends ejercicio8{

	private static Scanner teclado;
	static int suel;
	
	public void CargarSueldo() {
		teclado = new Scanner(System.in);
		
		System.out.print("Sueldo: ");
		suel=teclado.nextInt();
	}
	
	public void ImprimirSueldo() {
		System.out.print("Sueldo: " + suel);
	}
}