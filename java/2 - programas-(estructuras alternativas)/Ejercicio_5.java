/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
 * 0).
 *
 * @author Carlos Hidalgo Risco
 */
public class Ejercicio_5 { // Clase principal
    public static void main(String[] args) {
      
        String linea;

        System.out.print("Por favor, introduzca el valor de a: ");
        linea = System.console().readLine();
        double a = Integer.parseInt( linea );

        System.out.print("Ahora introduzca el valor de b: ");
        linea = System.console().readLine();
        double  b = Integer.parseInt( linea );

        if (a == 0){
            System.out.print("Esa ecuaci\u00f3n no tiene soluci\u00f3n real.");
        }else{
            System.out.println("x = " + (-b/a));
        }
    }
}
