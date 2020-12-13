/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 *
 * @author Carlos Hidalgo Risco
 */
public class Ejercicio_2 { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Introduce los euros: ");
    String linea = System.console().readLine();
    int euros = Integer.parseInt( linea );
    
    double pesetas =  euros * 166.386;
    
    System.out.print("El valor de " + euros + " euros es:\n "+ pesetas +" pesetas."  );
    }
  }
  