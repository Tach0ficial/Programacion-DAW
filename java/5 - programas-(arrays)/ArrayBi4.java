/*
    Modifica el programa anterior de tal forma que las sumas parciales y la suma
    total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
    que el ordenador se queda “pensando” antes de mostrar los números.
*/

import java.util.Scanner;

public class ArrayBi4 {

    public static void main(String[] args) 
        throws InterruptedException {
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
                Thread.sleep(200);
            }
            Thread.sleep(500);
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
            Thread.sleep(500);
            System.out.printf("%5d",sumaColumnas);
        }
        
        Thread.sleep(500);
        System.out.printf(" | Total --> %2d\n",sumaTotal);
        
	}
}


