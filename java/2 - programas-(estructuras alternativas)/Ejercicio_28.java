/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
 * incorrecta, el programa deberá mostrar un mensaje de error.
 *
 * @author Carlos Hidalgo Risco
 */
import java.util.Scanner;

public class Ejercicio_28 { // Clase principal
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Presupuesto de tartas");

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String player1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String player2 = s.nextLine();

        if (player1.equals(player2)) {
            System.out.print("Empate");
        }else{
                int ganador = 2;
                switch(player1) {
                case "piedra":
                    if (player2.equals("tijera")) {
                    ganador = 1;
                    }
                    break;
                case "papel":
                    if (player2.equals("piedra")) {
                    ganador = 1;
                    }
                    break;
                case "tijera":
                    if (player2.equals("papel")) {
                    ganador = 1;
                    }
                    break;
                default:
                }
                System.out.println("Gana el jugador " + ganador);
                }
            
        }

    }


