/**
 * Realiza un programa que calcule el precio de unas entradas de cine en función
 * del número de personas y del día de la semana.
 * 
 * El precio base de una entrada son 8 euros. 
 * El miércoles (día del espectador), el precio base es de 5 euros. 
 * Los jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
 * 
 * Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
 * grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
 * que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
 * 1 individual que son 41 euros (33 + 8).
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

 public class Ejercicio_26 { // Clase principal
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Venta de entradas CineCampa");
    
        System.out.print("Numero de entradas: ");
        double entradas = Double.parseDouble(s.nextLine());
    
        System.out.print("Dia de la semana: ");
        String dia = s.nextLine();
    
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        boolean tieneTarjeta = (s.nextLine()).equals("s");
        
        double precio= 0;
        
        double total=0; 
        double descuento=0;        
        double precioPareja=11;
        double entradasParejas = 0;
        double precioIndividual = 8;
        double entradasIndividuales = entradas;
        
        switch (dia) {
            case "miercoles":
                precioIndividual= 5;
                break;
            case "jueves":
                entradasParejas = (int) entradas / 2; //las entradas de las parejas.
                entradasIndividuales = entradas % 2; //el resto de las entradas.
                break;
            default:
                System.out.print("Se a equivocado al escribir el dia.");
                System.exit(0);
                break;
            }

            precio = precioIndividual * entradasIndividuales;
            precio += 11 * entradasParejas;

            if (tieneTarjeta) {
                descuento = precio * 0.10;
            }

            total = precio - descuento;


        System.out.println("\nAqui tiene sus entradas. Gracias por su compra.");
        System.out.println("-----------------------------------------------");
        if (entradasIndividuales > 0) {
        System.out.printf("Entradas individuales                      %.0f\n",entradasIndividuales);
        System.out.printf("Precio por entrada individual     %.2f euros\n",precioIndividual);
        }

        if (entradasParejas > 0) {
        System.out.printf("Entradas de pareja                         %.0f\n",entradasParejas);
        System.out.printf("Precio por entrada de pareja      %.2f euros\n",precioPareja);
        }

        System.out.printf("Total                            %.2f euros\n",precio);
        System.out.printf("Descuento                         %.2f euros\n",descuento);
        System.out.printf("A pagar                          %.2f euros\n",total);
        

        
    }
}

