//Define un array de n�meros enteros de 3 filas por 6 columnas con nombre num
//y asigna los valores seg�n la siguiente tabla. Muestra el contenido de todos
//los elementos del array dispuestos en forma de tabla como se muestra en la
//figura.

import java.util.Scanner;

public class ArrayBi1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//genero los 20 numeros
		
		int[][] num = new int[3][6];
		num[0][0]= 0;
		num[0][1]= 30;
		num[0][2]= 2;
		num[0][5]= 5;
		num[1][0]= 75;
		num[2][2]= -2;
		num[2][3]= 9;
		num[2][5]= 11;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.printf("%5d",num[i][j]);
			}
			System.out.println();
		}
	}
}
