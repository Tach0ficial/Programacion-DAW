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
        int serpenteo = 0; 
        int espacios= 12; 
        System.out.printf(" ".repeat(espacios)+"@\n");

        for (int i = 0; i < longitud; i++) {
            serpenteo = (int) (Math.random()*3) - 1; //genero un numero aleatorio que sera 1 0 o -1
            espacios += serpenteo;
            if (espacios < 2 ) {
                espacios++;
            }
            if (espacios > 25) {
                espacios--;
            }
            System.out.println(" ".repeat(espacios)+"*");
        }
	}
}

