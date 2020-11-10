/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax2 + bx + c = 0).
 *
 * @author Carlos Hidalgo Risco
 */
public class Ejercicio_9 { // Clase principal
    public static void main(String[] args) {
        
        System.out.print("Por favor, introduzca el valor de a: ");
        double a = Double.parseDouble(System.console().readLine());

        System.out.print("Ahora introduzca el valor de b: ");
        double b = Double.parseDouble(System.console().readLine());

        System.out.print("Ahora introduzca el valor de c: ");
        double c = Double.parseDouble(System.console().readLine());

        if ((a != 0) && (b != 0) && (c != 0)) {
        
            double result = b*b - (4 * a * c);
            
            if (result < 0) {
                System.out.println("La ecuación no tiene soluciones reales");
            }  else {
              System.out.println("x1 = " + (-b + Math.sqrt(result))/(2 * a));
              System.out.println("x2 = " + (-b - Math.sqrt(result))/(2 * a));
            }
        }
    }
}