
/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
 * y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
 * cuadrado se deben almacenar los cuadrados de los valores que hay en el array
 * numero. En el array cubo se deben almacenar los cubos de los valores que hay en
 * numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
 * columnas.
 * 
 * @author Carlos Hidalgo Risco
 */

import java.util.Scanner;
public class Array4 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numero = new int [20];
        int[] cuadrado = new int [20];
        int[] cubo = new int [20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < numero.length; i++) {
            cuadrado[i] = (int) Math.pow(numero[i], 2);
        }

        for (int i = 0; i < numero.length; i++) {
            cubo[i] = (int) Math.pow(numero[i], 3); 
        }
        
        for (int i = 0; i < numero.length; i++) {
            System.out.printf(" %6d %6d %6d\n",numero[i],cuadrado[i],cubo[i]);
        }
	}
}
