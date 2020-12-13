/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_11 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int numero = Integer.parseInt(s.nextLine());

        System.out.printf("\n %8s  %14s %8s \n------------------------------------", "Numero", "Cuadrado", "Cubo" );
        for (int i = numero; i < numero+5; i++) {
            System.out.printf("\n %5d    -->>   %5d %10d ", i, i*i, i*i*i );
        }
        
    }
}