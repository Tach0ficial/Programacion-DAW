package funciones;
/**
 * Crea una función con la siguiente cabecera:
 * public String convierteEnMorse(int n)
 * Esta función convierte el número n al sistema Morse y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
 * Morse. Utiliza esta función en un programa para comprobar que funciona bien.
 * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
 * desde el programa principal.
 * 1 . _ _ _ _ 6 _ . . . .
 * 2 . . _ _ _ 7 _ _ . . .
 * 3 . . . _ _ 8 _ _ _ . .
 * 4 . . . . _ 9 _ _ _ _ .
 * 5 . . . . . 0 _ _ _ _ _
 * @author Carlos Hidalgo Risco
 *
 */
public class Ejer37 {

	public static void main(String[] args) {
		System.out.print(convierteEnMorse(213));
	}
	
	public static String convierteEnMorse(int n) {
		String resultado = ""; 
		long aux = 0; 
		long volteado = 0;

	    while(n > 0) {
	      volteado = (volteado * 10) + (n % 10);
	      n = n / 10;
	    }
	    while (volteado > 0) {
	    	aux = volteado % 10; 
	    	if(aux < 6 || aux != 0) {
		    	for (int i = 0; i < aux; i++) {
					resultado += ". " ; 
				}
		    	for (int i = 0; i < 5-aux; i++) {
		    		resultado += "_ " ; 
				}
		    }else {
		    	for (int i = 0; i < aux; i++) {
					resultado += "_ " ; 
				}
		    	for (int i = 0; i < 5-aux; i++) {
		    		resultado += ". " ; 
				}
		    }
	    	volteado /= 10;
	    }
		return resultado;
	}

}
