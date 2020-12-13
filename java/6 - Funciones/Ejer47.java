package funciones;
/**
 * Define la funci�n convierteArrayEnString con la siguiente cabecera:
 * 
 * public static String convierteArrayEnString(int[] a)
 * 
 * Esta funci�n toma como par�metro un array que contiene n�meros y devuelve
 * una cadena de caracteres con esos n�meros. 
 * 
 * Por ejemplo, si a = { }, convierteArrayEnString(a) --> devuelve ��; 
 * 
 * si a = { 8 }, convierteArrayEnString(a) --> devuelve �8�; 
 * 
 * si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) --> devuelve �62501�.
 * 
 * @author Carlos Hidalgo Risco
 *
 */
public class Ejer47 {

	public static void main(String[] args) {
		int[] array = { 6, 2, 5, 0, 1 };
		System.out.print(convierteArrayEnString(array));
	}
	/**
	 * Convierte un array a String
	 * @param a
	 * @return
	 */
	public static String convierteArrayEnString(int[] a) {
		String resultado = "";
		for (int i = 0; i < a.length; i++) {
			resultado += a[i];  
		}
		return resultado;
	}

}
