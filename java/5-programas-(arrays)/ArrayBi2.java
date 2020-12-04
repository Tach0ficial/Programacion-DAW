/*
    Escribe un programa que pida 20 números enteros. Estos números se deben
    introducir en un array de 4 filas por 5 columnas. El programa mostrará las
    sumas parciales de filas y columnas igual que si de una hoja de cálculo se
    tratara. La suma total debe aparecer en la esquina inferior derecha.
*/

import java.util.Scanner;

public class ArrayBi2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		
		int[][] num = new int[4][5];
        int sumaFila = 0;
        int sumaColumnas = 0;
        int sumaTotal = 0;
        //introduce los 20 números en el array
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
                System.out.printf("Dime un numero: ");
                num[i][j] = s.nextInt();
			}
        }

        //suma de filas
        for (int i = 0; i < 4; i++) {
            sumaFila = 0; 
			for (int j = 0; j < 5; j++) {
                sumaFila += num[i][j];
                System.out.printf("%5d",num[i][j]);
            }
            System.out.printf(" | --> %2d\n",sumaFila);
        }

        //suma colomnas 
        for (int i = 0; i < 13; i++) {
            System.out.printf("%2s","-");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            sumaColumnas = 0; 
			for (int j = 0; j < 4; j++) {
                sumaColumnas += num[j][i];
                sumaTotal += num[j][i];
            }
            System.out.printf("%5d",sumaColumnas);
        }
        
        System.out.printf(" | Total --> %2d\n",sumaTotal);
	}
}
