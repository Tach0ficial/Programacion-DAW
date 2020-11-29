/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 
 * y que no termine de generar números hasta que no saque el 24. 
 * El  programa deberá decir al final cuántos números se han generado.
 * @author Carlos Hidalgo Risco
 */

public class NumerosAleatorios2 { // Clase principal
    public static void main(String[] args) {
        

        int numero = 0;
        int veces = 0; 

        do {
            numero = (int) (Math.random() * 100);
            veces++;
        } while (numero != 24);
        System.out.print("Se han generado "+veces+" numeros.");
    }
}
