/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
 * nombre del día de la semana.
 *
 * @author Carlos Hidalgo Risco
 */
public class Ejercicio_3 { // Clase principal
    public static void main(String[] args) {
        String dia;

        System.out.print("Por favor, introduzca un n\u00famero del 1 al 7: ");
        int day = Integer.parseInt(System.console().readLine());
    
            switch(day) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Mi\u00e9rcoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "S\u00e1bado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Debe introducir un n\u00famero del 1 al 7";
            }
            
            System.out.println(dia);

        }

}

