/**
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
 * manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
 * 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
 * además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
 * nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_27 { // Clase principal
    public static void main(String[] args) {

        String tipoDeChocolate="";

        Scanner s = new Scanner(System.in);
        System.out.println("Presupuesto de tartas");

        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        String sabor = s.nextLine();
        double precio = 0;
        double precioSabor = 0;
        switch (sabor) {
            case "manzana":
                precioSabor = 18;
                precio = 18 ; 
                break;
            case "fresa":
                precioSabor = 16;
                precio = 16 ; 
                break;
            case "chocolate":
                System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
                tipoDeChocolate = s.nextLine();
            
                if (tipoDeChocolate == "negro") {
                    precioSabor = 14;
                    precio = 14;
                }else{
                    precioSabor = 15;
                    precio = 15;
                }
                break;
            default:
                break;
        }
        
        
        System.out.print("¿Quiere nata? ");
        boolean quiereNata = (s.nextLine()).equals("si");
        
        System.out.print("¿Quiere ponerle un nombre? ");
        boolean quiereNombre = (s.nextLine()).equals("si");

        if (quiereNata == true) {
            precio += 2.50;
        }
        if (quiereNombre == true) {
            precio += 2.75;
        }
        
        System.out.printf("Tarta de %s %s:     %.2f\n", sabor, tipoDeChocolate, precioSabor);
        if (quiereNata == true) {
            System.out.println("Con nata:                 2,50 euros");
        }
        if (quiereNombre == true) {
            System.out.println("Con nombre:               2,75 euros");
        }
        System.out.printf("Total:                         %.2f",precio);
    }
}


