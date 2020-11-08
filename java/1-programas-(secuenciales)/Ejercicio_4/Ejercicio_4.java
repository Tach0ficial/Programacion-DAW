/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 *
 * @author Carlos Hidalgo Risco
 */
public class Ejercicio_4 { // Clase principal
    public static void main(String[] args) {

      String linea;

      System.out.print("Introduce un numero: ");
      linea = System.console().readLine();
      int n1 = Integer.parseInt( linea );

      System.out.print("Introduce otro numero: ");
      linea = System.console().readLine();
      int n2 = Integer.parseInt( linea );

      int suma = n1 + n2;
      int resta = n1 - n2;
      int multi = n1 * n2;
      int div = n1 / n2;

      System.out.printf("\nLa suma de %d y %d es: %d\n", n1, n2, suma);
      System.out.printf("La resta de %d y %d es: %d\n", n1, n2, resta);
      System.out.printf("La multiplicacion de %d y %d es: %d\n", n1, n2, multi);
      System.out.printf("La division entre %d y %d es: %d\n", n1, n2, div);
    }
  }
  