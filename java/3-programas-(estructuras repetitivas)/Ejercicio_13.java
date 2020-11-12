/**
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_13 { // Clase principal
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Dime los numero que quieres que salgan: ");
            int numero = Integer.parseInt(s.nextLine());
            if (numero > 0 && numero != 0) {
                positivos++;
            } else if  (numero != 0){
                negativos++;
            }
        }
        System.out.println("Has introducido "+positivos+" numeros positivos y "+negativos+" negativos.");
        
    }
}