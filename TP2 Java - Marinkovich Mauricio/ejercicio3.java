package test;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio32 {
	
	private static Scanner teclado;
	
	public static void main(String[] args) {
		ArrayList<Integer> Lista = new ArrayList<Integer>();
		
		int x = 0, i = 0;
		
		teclado = new Scanner(System.in);
		
		for(i=1; i<=10; i++){
			System.out.print("Numero " + i + ":");
			x = teclado.nextInt();
			Lista.add(x);
		}
		
		for(i=1; i<10; i++){
			if (i%2==0) {
				System.out.print("el numero "+ i +" es par\n");
			}else{
				System.out.print("el numero "+ i +" es impar\n");
			}
		}
	}
}
