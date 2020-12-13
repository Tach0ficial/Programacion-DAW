package funciones;

import matematicas.arrays;

public class Ejer20_28 {

	public static void main(String[] args) {
		
		//generaArrayInt------------------------
		int[] pepe = matematicas.arrays.generaArrayInt(10, 10, 50);
		for (int i = 0; i < pepe.length; i++) {
			System.out.println(pepe[i]);
		}
		
		
		//minimoArrayInt------------------------
		System.out.println("El minimo es: "+matematicas.arrays.minimoArrayInt(pepe));
		
		
		//maximoArrayInt------------------------
		System.out.println("El maximo es: "+matematicas.arrays.maximoArrayInt(pepe));

		
		//mediaArrayInt-------------------------
		System.out.println("La media es: "+matematicas.arrays.mediaArrayInt(pepe));

		
		//estaEnArrayInt------------------------
		if (matematicas.arrays.estaEnArrayInt(pepe, 2)) {
			System.out.println("2 esta en el array.");
		}else {
			System.out.println("2  no esta en el array.");
		}
		
		//posicionEnArray------------------------
		System.out.println(matematicas.arrays.posicionEnArray(pepe, 2));
		
		
		//volteaArrayInt------------------------
		System.out.println(matematicas.arrays.volteaArrayInt(pepe));
		
		
		//rotaDerechaArrayInt------------------------
		pepe = matematicas.arrays.rotaDerechaArrayInt(pepe,4); 
		System.out.println();
		for (int i = 0; i < pepe.length; i++) {
			System.out.println(pepe[i]);
		}
		
	}
}
