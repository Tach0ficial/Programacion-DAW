/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 *
 * @author Carlos Hidalgo Risco
 */

public class Ejercicio_1 { // Clase principal
    public static void main(String[] args) {

    for (int i = 0; i<=100; i++) {
        if (i % 5 == 0) {//comprobamos si es múltiplo de 5 y lo imprime si lo es.
            System.out.println(i);
        }
    }
}
}