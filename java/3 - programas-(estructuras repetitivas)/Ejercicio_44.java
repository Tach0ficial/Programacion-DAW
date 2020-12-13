/**
 * Escribe un programa que sea capaz de insertar un dígito dentro de un número
 * indicando la posición. El nuevo dígito se colocará en la posición indicada y el
 * resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
 * izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 * correctamente los datos. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_44 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numero = Integer.parseInt(s.nextLine());
       
        
    }
}

// Ejemplo:
// Por favor, introduzca un número entero positivo: 406783
// Introduzca la posición donde quiere insertar: 3
// Introduzca el dígito que quiere insertar: 5
// El número resultante es 4056783.