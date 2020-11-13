/**
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_31 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la altura de la L: ");
        int alturaLetra = Integer.parseInt(s.nextLine());
       
        for (int i = 0; i < alturaLetra-1; i++) {
            System.out.println("*");
        }
        for (int i = 0; i <= (alturaLetra/2); i++) {
            System.out.print("* ");
        }
        
    }
}

// Introduzca la altura de la L: 5
// *
// *
// *
// *
// * * *