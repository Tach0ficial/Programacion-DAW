/**
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
 * do-while.
 *
 * @author Carlos Hidalgo Risco
 */

public class Ejercicio_6 { // Clase principal
    public static void main(String[] args) {
        int i = 320; //se inicializa i en 320.

        do{
            System.out.println(i);
            i-=20;//i se va decrementando de 20 en 20.
        }while (i >=160 );
    }
}