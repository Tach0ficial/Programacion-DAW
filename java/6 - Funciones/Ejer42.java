package funciones;
/**
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
 * pintar las líneas.
 * Ejemplo 1:
 * Introduzca la altura de la figura: 8
 *   ********
 *   *     *
 *   *    *
 *   *   *
 *   *  *
 *   * *
 *   **
 *   *
 *	Ejemplo 2:
 *	Introduzca la altura de la figura: 5
 *	*****
 *	*  *
 *	* *
 *	**
 *	*
 * @author Carlos Hidalgo Risco
 *
 */
import java.util.Scanner;
public class Ejer42 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la altura de la figura: ");
		pintarLineas(s.nextInt());
	}
	/**
	 * Pinta el triangulo  teniendo en cuenta el numero introducido para saber el tamaño del mismo.
	 * @param n : indica el tamaño del triangulo.
	 */
	public static void pintarLineas(int n){
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		int aux = n-3; 
		if(n!=1 && n != 0) {
			for (int i = 0; i < n-1 && i != n-2; i++) { //lineas
				System.out.print("*");
				for (int j = 0; j < aux ; j++) { //contenido de cada linea
					System.out.print(" ");
				}
				aux--;
				System.out.print("*");
				System.out.println();
			}
			System.out.print("*");
		}
	}
}
