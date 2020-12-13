/**
 * 3. Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) 
 * con el c�digo ascii entre el 32 y el 126. Puedes hacer casting con (char)
 * para  convertir un entero en un car�cter.
 * 
 * @author Carlos Hidalgo Risco
 */

public class NumerosAleatorios3 {

	public static void main(String[] args) {
		int random = 0; 
		while (true){
			random =  (int) (Math.random()*(126-32+1)+32);
			System.out.print((char)random);
		}
	}
}
