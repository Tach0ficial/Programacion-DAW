/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje "Lo siento, esa no es la combinación"
 * y si acertamos se nos dirá "La caja fuerte se ha abierto satisfactoriamente".
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_7 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Control de acceso a una caja fuerte");
    
        int clave = 1234;//indicamos la clave en la variable "clave"
        int claveIntroducida;

        for (int i = 3; i >= 0; i--) {
            System.out.print("Dime la combinacion para abrir la caja: ");
            claveIntroducida = Integer.parseInt(s.nextLine());
            if (claveIntroducida==clave) {// comparamos si la clave introducida es igual a la clave que indicamos previamente.
                System.out.print("La caja fuerte se ha abierto satisfactoriamente");//si es que si, lo mostramos por pantalla y salimos del bucle.
                break;
            }else{
                System.out.println("Lo siento, esa no es la combinacion.");
                System.out.println("Te quedan "+i+" intentos.\n");//si es que no indicamos los intentos que nos quedan.
            }
        }
        
    }
}