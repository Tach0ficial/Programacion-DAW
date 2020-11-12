/**
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_10 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero = 0;
        int suma = 0; 
        int veces = 0;
        System.out.print("Dime un numero: ");
        numero = Integer.parseInt(s.nextLine());
        while(numero >= 0){
            veces++;
            suma += numero;
            System.out.print("Dime un numero: ");
            numero = Integer.parseInt(s.nextLine());
        }
        System.out.println("La media de los numeros introducidos es: "+suma/veces);
    }
}