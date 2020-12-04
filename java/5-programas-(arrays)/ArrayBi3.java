/*
    Modifica el programa anterior de tal forma que los números que se introducen
    en el array se generen de forma aleatoria (valores entre 100 y 999).
*/

import java.util.Scanner;

public class ArrayBi3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		int[][] num = new int[4][5];
        int sumaFila = 0;
        int sumaColumnas = 0;
        int sumaTotal = 0;

        //introduce los 20 números en el array
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
                num[i][j] = (int) (Math.random()*(999-100+1)+100);
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

