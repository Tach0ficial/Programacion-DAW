/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 *
 * @author Carlos Hidalgo Risco
 */
public class Ejercicio_8 { // Clase principal
    public static void main(String[] args) {
        
        System.out.print("Introduce tu nota: ");
        double nota1 = Double.parseDouble(System.console().readLine());

        System.out.print("Introduce otra nota: ");
        double nota2 = Double.parseDouble(System.console().readLine());

        System.out.print("Introduce otra nota: ");
        double nota3 = Double.parseDouble(System.console().readLine());

        double media = (nota1+nota2+nota3)/3 ; 

        if (media < 5) {
            System.out.print("Insuficiente");
        }else if ((media >= 5) && (media < 6)) {
            System.out.print("Suficiente");
        }else if ((media >= 6) && (media < 7)) {
            System.out.print("Bien");
        }else if ((media >= 7) && (media < 9)) {
            System.out.print("Notable");
        }else {
            System.out.print("Sobresaliente");
        }
    }
}