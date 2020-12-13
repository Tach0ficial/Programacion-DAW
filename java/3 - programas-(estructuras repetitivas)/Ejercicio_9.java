/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice (int o long).
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_9 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //pide los datos
        System.out.print("Dime un numero: ");
        long numeroIntroducido = Long.parseLong(s.nextLine());
        //calculos
        long numero = numeroIntroducido;
        long digitos = 1;
        //divide el numero entre 10 hasta que sea minor que 10
        while (numero > 10) {
            numero /= 10;
            digitos++;
        }        
        System.out.print("El numero "+numeroIntroducido+" tiene "+digitos+" digitos.");
    }
}