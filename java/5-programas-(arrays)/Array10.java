//Escribe un programa que genere 20 n�meros enteros aleatorios entre 0 y 100
//y que los almacene en un array. El programa debe ser capaz de pasar todos
//los n�meros pares a las primeras posiciones del array (del 0 en adelante) y
//todos los n�meros impares a las celdas restantes. Utiliza arrays auxiliares si es
//necesario.


import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//genero los 20 numeros
		
		int[] numerosAleatorios = new int[20];
		int[] numerosOrdenados = new int[20];
		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = (int) (Math.random()*100);
		}
		
		//pongo los pares delante
		int j = 19;
		int x = 0;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			if (numerosAleatorios[i] % 2 == 0) {
				numerosOrdenados[x] = numerosAleatorios[i] ;
				x++;
			}else {
				numerosOrdenados[j] = numerosAleatorios[i] ;
				j--;
			}
		}
		for (int i = 0; i < numerosOrdenados.length; i++) {
			System.out.println("array["+i+"] --> "+numerosOrdenados[i]);
		}
	}
}
