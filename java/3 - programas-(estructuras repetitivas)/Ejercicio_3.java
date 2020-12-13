/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 *
 * @author Carlos Hidalgo Risco
 */

public class Ejercicio_3 { // Clase principal
    public static void main(String[] args) {
        int i= 0;
        do{
            if (i % 5 == 0) { //comprobamos si es múltiplo de 5 y lo imprime si lo es.
                System.out.println(i);
            }
            i+=1; //Incrementa el numero mas 1.
        }while (i<=100); //realiza el bucle mientras i sea menor o igual a 100.
       

      
    }
}