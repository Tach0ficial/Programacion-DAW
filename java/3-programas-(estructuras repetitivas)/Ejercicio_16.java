/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_16 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = Integer.parseInt(s.nextLine());
        boolean esPar = true; 
        for (int i = 2; i < numero; i++) {
           if (numero % i == 0) {
               esPar = false;
           }
        }
        if (esPar){
            System.out.print("El numero es primo");
        }else{
            System.out.print("El numero no es primo");
        }
        //QUE ES LA UNIDAD??
    }
}