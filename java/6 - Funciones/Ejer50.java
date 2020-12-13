package funciones;
/**
 * * 
 * Define la función mezcla con la siguiente cabecera:
 * 
 * public static int[] mezcla(int[] a, int[] b)
 * 
 * Esta función toma dos arrays como parámetros y devuelve un array que es
 * el resultado de mezclar los números de ambos de forma alterna, se coge un
 * número de a, luego de b, luego de a, etc. Los arrays a y b pueden tener
 * longitudes diferentes; por tanto, si se terminan los números de un array se
 * terminan de coger todos los que quedan del otro.
 * 
 * Ejemplos:
 * 
 * Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
 * Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10} 
 * Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
 * Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}
 * 
 * @author Carlos Hidalgo Risco
 *
 */
public class Ejer50 {

	public static void main(String[] args) {
		//crear los arrays que vamos a mezclar
		int[] array1 = {8, 9, 0, 3 };
		int[] array2 = { 1 };
		int[] arrayMezclado = mezcla(array1, array2);
		
		//Imprime el array mezclado
		for (int i = 0; i < arrayMezclado.length; i++) {
			System.out.print(arrayMezclado[i]);
		}
	}
	/**
	 * 
	 * @param a primer array a mezclar
	 * @param b segundo array a mezclar
	 * @return retorna el array mezclado
	 */
	public static int[] mezcla(int[] a, int[] b) {
		int[] arrayMezclado = new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			arrayMezclado[i] = a[i]; 
		}
		int j = 0; 
		for (int i = a.length; i < b.length+a.length; i++) {	
			arrayMezclado[i] = b[j]; 
			j++;
		}
		return arrayMezclado;
	}
}
