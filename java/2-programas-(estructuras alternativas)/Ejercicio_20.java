/**
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 *
 * @author Carlos Hidalgo Risco
 */

import java.util.Scanner;

public class Ejercicio_20 { // Clase principal
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
		int[] valores = new int[5];
		System.out.println("Introduzca 5 cifras");
		System.out.println("Despues de cada número pulse INTRO");
		
		for (int i = 0; i < valores.length; i++) {
			valores[i]= leer.nextInt();
		}
		
		if (valores[0] == valores[4] && valores[1] == valores[3]) {

			System.out.println("El número es capicúa");
		}else {
			System.out.println("El número no es capicúa");
        }
    }
}
