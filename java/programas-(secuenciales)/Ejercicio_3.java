/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 *
 * @author Carlos Hidalgo Risco
 */
public class Ejercicio_3 { // Clase principal
    public static void main(String[] args) {

      System.out.print("Introduce las pesetas: ");
      String linea = System.console().readLine();
      double pesetas = Integer.parseInt( linea );
      
      double euros =  pesetas / 166.386;
      
      System.out.printf("El valor de %f pesetas es:\n %.2f euros.", pesetas , euros  );
    }
  }
  