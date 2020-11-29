/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 * long en lugar de int ya que el primero admite números más largos.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_36 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = Long.parseLong(s.nextLine());
        boolean capicua = true;
        String delReves = "";

        for (long i = Long.toString(numero).length(); i >= 0 ; i--) {
            delReves = ""+Long.toString(i);
        }
    }
}

// Ejemplo 1:
// Por favor, introduzca un número entero positivo: 678
// El 678 no es capicúa.

// Ejemplo 2:
// Por favor, introduzca un número entero positivo: 2019102
// El 2019102 es capicúa.