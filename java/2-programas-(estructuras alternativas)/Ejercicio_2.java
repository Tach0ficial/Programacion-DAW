/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 *
 * @author Carlos Hidalgo Risco
 */
public class Ejercicio_2 { // Clase principal
    public static void main(String[] args) {
      
      System.out.print("Introduce la hora: ");
      int hour = Integer.parseInt(System.console().readLine());

        if ((hour >=6) && (hour <= 12)){
          System.out.print("Buenos dias");
        }else if ((hour >=13) && (hour <= 20)){
          System.out.print("Buenas tardes");
        }else if ((hour >=21) && (hour <= 24) || (hour >=1)&&(hour <=5)){
          System.out.print("Buenas noches");
        }else{
        System.out.println("La hora introducida no es correcta.");
      }
    }
}
    