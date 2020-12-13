package funciones;
/**
 * Crea una función con la siguiente cabecera:
 * 
 * public static String convierteEnPalotes(int n)
 * 
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
 * | - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
 * para comprobar que funciona bien. Desde la función no se debe mostrar nada
 * por pantalla, solo se debe usar print desde el programa principal.
 * @author Carlos Hidalgo Risco
 *
 */
public class Ejer35 {

	public static void main(String[] args) {
		System.out.print(convierteEnPalotes(470213));
	}
/**
 * Guarda en una variable el resultado de pasar el numero a lenguaje de palotes.
 * @param n
 * @return retorna el resultado de los palotes.
 */
	public static String convierteEnPalotes(int n) {
		long volteado = 0;
		long palotes = 0; 
		String resultado = "";

	    while(n > 0) {
	      volteado = (volteado * 10) + (n % 10);
	      n = n / 10;
	    }
		while (volteado > 0) {
			 palotes = volteado % 10;
			 
			 //imprime los palotes
			 for (int i = 0; i < palotes; i++) {
				resultado += ("| ");
			}
			 if(volteado > 10) {
				 resultado += ("- ");
			 }
			 volteado /= 10; 
		}
		return resultado;
	}
}
