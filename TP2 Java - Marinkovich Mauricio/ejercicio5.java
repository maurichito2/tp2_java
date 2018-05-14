package test;

import java.util.Scanner;

public class ejercicio5 {
		
	private static Scanner teclado;
	
	public static void main(String[] args) {
		
		int x = 0, acum = 0;

		teclado = new Scanner(System.in);
		
        while (acum <= 9999){
        	acum++;
            System.out.print("Ingrese valor: " );
			x = teclado.nextInt();
			acum = acum + x;
        }
        
        if (acum == 10000){
        	System.out.println("El valor es igual a 0");
        }
        else if (acum < 9999){
        	System.out.println("El valor es menor a 0");
        }
        else{
        	System.out.println("El valor es mayor a 0");
        }
	}
}


