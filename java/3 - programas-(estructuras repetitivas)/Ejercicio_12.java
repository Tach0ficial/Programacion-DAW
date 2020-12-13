/**
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
 * introducir por teclado.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_12 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Dime los numero que quieres que salgan: ");
        int numero = Integer.parseInt(s.nextLine());
        int anteriorX2 = 0;
        int anterior = 1;
        int ahora = 0;
        System.out.println(anteriorX2);
        System.out.println(anterior);
        

        for (int i =0; i < numero-2; i++) {

            ahora = anterior + anteriorX2;
            System.out.println(ahora);
            anteriorX2 = anterior;
            anterior = ahora;
        }
        
    }
}