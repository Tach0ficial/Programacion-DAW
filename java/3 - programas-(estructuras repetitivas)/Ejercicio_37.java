/**
 * Realiza un conversor del sistema decimal al sistema de "palotes".
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_37 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numero = Integer.parseInt(s.nextLine());
       
        int longitud = numero;
        while (longitud > 0) {
            System.out.print(numero.charAt(i++));
            longitud/= 10; 

        }
        
        
    }
}

// Por favor, introduzca un número entero positivo: 47021
// El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.