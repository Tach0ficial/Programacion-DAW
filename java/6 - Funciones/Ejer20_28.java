package funciones;

import funciones.arrays;

public class Ejer20_28 {

	public static void main(String[] args) {
		
		//generaArrayInt------------------------
		int[] pepe = matematicas.arrays.generaArrayInt(10, 10, 50);
		for (int i = 0; i < pepe.length; i++) {
			System.out.println(pepe[i]);
		}
		
		
		//minimoArrayInt------------------------
		System.out.println();

		
		//maximoArrayInt------------------------
		System.out.println();

		
		//mediaArrayInt-------------------------
		System.out.println();

		
		//estaEnArrayInt------------------------
		System.out.println();

		
		//posicionEnArray------------------------
		System.out.println();
		
		
		//volteaArrayInt------------------------
		System.out.println();
		
		
		//rotaDerechaArrayInt------------------------
		pepe = matematicas.arrays.rotaDerechaArrayInt(pepe,4); 
		System.out.println();
		for (int i = 0; i < pepe.length; i++) {
			System.out.println(pepe[i]);
		}
		
		
	}
}
