/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *
 * @author Carlos Hidalgo Risco
 */

public class Ejercicio_22 { // Clase principal
    public static void main(String[] args) {
    
        boolean esPar = true; 

        for (int i = 2; i <= 100; i++) {
            esPar = true; 
            for (int x = 2; x < i; x++) {
                if (i % x == 0) {
                    esPar = false;
                }
            }
            if (esPar) {
                System.out.println(i);
            }
        }
    }
}