/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_8 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //pide los datos
        System.out.print("Dime un numero para mostrar la tabla de multiplicar : ");
        int numMultiplicar = Integer.parseInt(s.nextLine());

        //bucle de 1 a 10 multipicando el numero introducido por i.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" x "+numMultiplicar+" = "+ i*numMultiplicar);
        }
        
    }
}