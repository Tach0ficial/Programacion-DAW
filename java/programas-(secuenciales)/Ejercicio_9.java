/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =1/3 pi r2h
 *
 * @author Carlos Hidalgo Risco
 */
public class Ejercicio_9 { // Clase principal
    public static void main(String[] args) {

      String linea;

      System.out.print("Introduce el radio del cono: "); 
      linea = System.console().readLine();
      double radio = Integer.parseInt( linea );

      System.out.print("Introduce la altura del cono: ");
      linea = System.console().readLine();
      double altura = Integer.parseInt( linea );

      double volumen =  (Math.PI *  Math.pow(radio, 2) * altura) / 3;

      System.out.printf("El volumen del cono es: %.2f metros cubicos.",volumen); 

      


    }
  }
  