package matematicas;

public class arrays {
	/**
	 * generaArrayInt: Genera un array de tamaño n con números aleatorios
	 * cuyo intervalo (mínimo y máximo) se indica como parámetro.
	 */
	public static int[] generaArrayInt(int n,int minumo, int maximo) {
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = (int) (Math.random()*(maximo-minumo+1)+minumo);
		}
		return num;
	}
	
	/**
	 * minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
	 */
	public static long minimoArrayInt(int array[]) {
		long min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i]; 
			}
		}
		return min;
	}
	/**
	 * maximoArrayInt: Devuelve el máximo del array que se pasa como
	 * parámetro.
	 */
	public static long maximoArrayInt(int array[]) {
		long max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i] < max) {
				max = array[i]; 
			}
		}
		return max;
	}
	
	/**
	 * mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
	 */
	public static long mediaArrayInt(int array[]) {
		long sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum =+ array[i];
		}
		return sum/array.length;	
	}
	
	/**
	 * estaEnArrayInt: Dice si un número está o no dentro de un array.
	 */
	public static boolean estaEnArrayInt(int array[], int n) {
		boolean estaDentro = false;
		for (int i = 0; i < array.length; i++) {
			if (n == array[i]) {
				estaDentro = true;
			}
		}
		return estaDentro;
	}
	
	/**
	 * posicionEnArray: Busca un número en un array y devuelve la posición 
	 * (el índice) en la que se encuentra.
	 */
	public static int posicionEnArray(int array[], int n) {
		int position = 0; 
		for (int i = 0; i < array.length; i++) {
			if (n == array[i]) {
				position = i;
			}
		}
		return position; 
	}
	
	/**
	 * volteaArrayInt: Le da la vuelta a un array.
	 */
	public static int[] volteaArrayInt(int array[]) {
		int arrayVolteado[] = new int[array.length]; 
		for (int i = array.length; i >= 0; i--) {
			arrayVolteado[i] = array[i]; 
		}
		return arrayVolteado;
	}
	/**
	 * rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un 
	 * array.
	 */
	public static int[] rotaDerechaArrayInt(int array[], int n) {
		int arrayRotado[] = new int[array.length+n]; 
		for (int i = 0; i < n; i++) {
			arrayRotado[i] = 0; 
		}
		int j = 0;
		for (int i = n; i < arrayRotado.length; i++) {
			arrayRotado[i] = array[j]; 
			j++; 
		}
		return arrayRotado;
	}
	/**
	 * rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de
	 * un array.
	 */
	public static int[] rotaIzquierdaArrayInt(int array[], int n) {
		int arrayRotado[] = new int[array.length+n]; 
		int j = 0;
		for (int i = n; i < arrayRotado.length; i++) {
			arrayRotado[i] = array[j]; 
			j++; 
		}
		for (int i = 0; i < n; i++) {
			arrayRotado[i] = 0; 
		}
		return arrayRotado;
	}
	
	
	
	
	
}
