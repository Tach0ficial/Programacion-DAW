/**
 * Realiza un programa que pinte por pantalla una serpiente con un "serpenteo" aleatorio. 
 * La cabeza se representara con el carácter @ y se debe colocar  exactamente 
 * en la posición 13 (con 12 espacios delante).
 * 
 *  A partir de ahi, 
 * el cuerpo ira serpenteando de la siguiente manera: 
 * se generara de forma aleatoria
 * un valor entre tres posibles que hará que el siguiente carácter se  coloque 
 * una posición a la izquierda del anterior, alineado con el anterior o una posición a la derecha del anterior.
 *  La longitud de la serpiente se pedirá por teclado y se supone que el usuario introducirá un dato correcto.

Ejemplo:

Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
            @
            *
             *
             *
             *
            *
 * 
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;
public class NumerosAleatorios4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud = s.nextInt();
        int random = 0; 
        System.out.printf("%13s\n","@");

        for (int i = 0; i < longitud; i++) {
            random = (int) (Math.random()*(14-13+1)+13);
            System.out.printf("%"+random+"s\n","*");
        }
	}
}

