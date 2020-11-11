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
        String tipoEntrada = "";
        String entradaPareja = "";
        double total=0; 
        double descuento=0;
        double precioPareja=0;
        double precioIndividual=0;
      
        String entradaIndividual = "";
        
        switch (dia) {
            case "miercoles":
                precio = 5*entradas;
                break;
            case "jueves":
                if (entradas==2) {
                    precio = 11;
                    precioPareja = 11;
                    entradaPareja = "Entradas de parejas";
                }else if (entradas==6){
                    precio = 33;
                    precioPareja = 11;
                    entradaPareja = "Entradas de parejas";
                }else if (entradas==7){
                    precio = 41;
                    precioPareja = 11;
                    precioIndividual = 8;
                    entradaPareja = "Entradas de parejas";
                    entradaIndividual = "Entradas individuales";
                }
                else{
                    entradaIndividual = "Entradas individuales";
                    precioIndividual = 8;
                    precio = 8*entradas;
                }
                break;
            case "martes":
            case "viernes":
            case "sabado":
            case "lunes":
                precioIndividual = 8;
                entradaIndividual = "Entradas individuales";
                precio = 8*entradas;
                if (tieneTarjeta == true) {
                    descuento = precio*0.10;
                    total =  precio - descuento;
                }else{

                }
                break;
            default:
                System.out.print("Se a equivocado al escribir el dia.");
                System.exit(0);
                break;
            }
        System.out.println("Aqui tiene sus entradas. Gracias por su compra.");
        System.out.printf("%s %d",entradaIndividual,entradas);
        System.out.printf("Precio por entrada individual %d €",precioIndividual);
        System.out.printf("%s %d",entradaPareja,entradas);
        System.out.printf("Precio por entrada de pareja %d €",precioPareja);
        System.out.printf("Total %d",precio);
        System.out.printf("Descuento %d",descuento);
        System.out.printf("A pagar %d",total);
        

        
    }
}


// Venta de entradas CineCampa
// Número de entradas: 4
// Día de la semana: viernes
// ¿Tiene tarjeta CineCampa? (s/n): s

// Aquí tiene sus entradas. Gracias por su compra.
// Entradas individuales            4
// Precio por entrada individual    8.00 €
// Total                            32.00 €
// Descuento                        3.20 €
// A pagar                          28.80 €
