/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_23 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero = 0;
        int veces = 0;
        int suma = 0; 
        while (numero<= 10000) {
            suma += numero;
            veces++;
            System.out.print("Indica un numero: ");
            numero = Integer.parseInt(s.nextLine());
        }

        System.out.println("La suma de numeros introducidos es: "+suma);
        System.out.println("El total de numeros introducidos es: "+ (veces-1));
        System.out.println("El media es: "+ suma/(veces-1));

    }
}