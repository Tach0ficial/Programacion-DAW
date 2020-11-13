/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_28 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero: ");
        int numero = Integer.parseInt(s.nextLine());
        int factorial = 0;
        int multi = 1 ;  

        for (int i = 1; i < numero; i++) {
            factorial =  multi * (i+1);
            multi = multi * (i+1);
        } 
        System.out.println(numero+"! = "+factorial);
        
        
    }
}
