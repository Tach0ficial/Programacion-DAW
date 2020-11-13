/**
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_33 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la altura de la U:");
        int alturaLetra = Integer.parseInt(s.nextLine());
        for (int i = 0; i < alturaLetra-1; i++) {
            System.out.print("*");
            for (int j = 0; j < alturaLetra-2 ; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.print(" ");
        for (int i = 0; i < alturaLetra-2; i++) {
            System.out.print("*");
           
        }
        System.out.print(" ");
        
    }
}

