//Realiza un programa que pida la temperatura media que ha hecho en cada mes
//de un determinado a�o y que muestre a continuaci�n un diagrama de barras
//horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
//de asteriscos o cualquier otro car�cter.

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		int[] temperaturaMedia = new int[12];
		for (int i = 0; i < meses.length; i++) {
			System.out.print("Introduce la temperatura media de "+meses[i]+": ");
	        temperaturaMedia[i] = s.nextInt();
		}
        
		for (int i = 0; i < temperaturaMedia.length; i++) {
			System.out.printf("%12s --> ",meses[i]);
			for (int j = 0; j < temperaturaMedia[i]; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
        
        
        

	}

}
