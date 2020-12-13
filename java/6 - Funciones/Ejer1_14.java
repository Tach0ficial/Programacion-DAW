import funciones.FuncionesMatematicas;

public class Ejer1_14 {

	public static void main(String[] args) {
		
		//esCapicua---------------------------------------------
		if (FuncionesMatematicas.esCapicua(232)){
			System.out.println(232+" --> Es capicua");
		}
		
		if (FuncionesMatematicas.esCapicua(2322) == false){
			System.out.println(2322+" --> No es capicua");
		}
		
		//esPrimo-----------------------------------------------
		
		if (FuncionesMatematicas.esPrimo(11)){
			System.out.println(11+" --> Es primo");
		}else {
			System.out.println(11+" --> No es primo");
		}
		
		//digitoN-----------------------------------------------
		System.out.println("En la posicion 4 del numero 23237 esta el numero: "+FuncionesMatematicas.digitoN(23237,4));
		
		//siguientePrimo----------------------------------------
		
		System.out.println("El numero primo menor y mayor que 24 es: "+FuncionesMatematicas.siguientePrimo(24));
		
		//potencia----------------------------------------------
		
		System.out.println("La potencia de 4 y 2 es : "+FuncionesMatematicas.potencia(4, 2));
		
		//digitos-----------------------------------------------
		
		System.out.println("El numero 999 tiene "+FuncionesMatematicas.digitos(999)+" digitos.");
		
		//posicionDeDigito---------------------------------------
		
		System.out.println("En el 3452, el d�gito 4 est� en la posici�n "+FuncionesMatematicas.posicionDeDigito(3452, 4));
	    System.out.println("En el 78604321, el d�gito 1 est� en la posici�n "+FuncionesMatematicas.posicionDeDigito(78604321, 1));
	    System.out.println("En el 78604321, el d�gito 7 est� en la posici�n "+FuncionesMatematicas.posicionDeDigito(78604321, 7));
	    System.out.println("En el 78604321, el d�gito 5 est� en la posici�n "+FuncionesMatematicas.posicionDeDigito(78604321, 5));
	    
	    //quitaPorDetras-----------------------------------------
	    
	    System.out.println("Si al 78604321 se le quitan por detr�s 4 d�gitos, se queda como " + FuncionesMatematicas.quitaPorDetras(78604321, 4));
	    System.out.println("Si al 1000 se le quita por detr�s 1 d�gito, se queda como " + FuncionesMatematicas.quitaPorDetras(1000, 1));
	    
	    //quitaPorDelante-----------------------------------------
	    
	    System.out.println("Si al 78604321 se le quitan por delante 4 d�gitos, se queda como " + FuncionesMatematicas.quitaPorDelante(78604321, 4));
	    System.out.println("Si al 78604000 se le quitan por delante 2 d�gitos, se queda como " + FuncionesMatematicas.quitaPorDelante(78604000, 2));
	    
	    // pegaPorDetras---------------------------------------------

	    System.out.println("Si al 567 se le pega por detr�s el 1 da el " + FuncionesMatematicas.pegaPorDetras(567, 1));
	    System.out.println("Si al 33 se le pega por detr�s el 0 da el " + FuncionesMatematicas.pegaPorDetras(33, 11));

	    // pegaPorDelante-----------------------------------------

	    System.out.println("Si al 567 se le pega por delate el 1 da el " + FuncionesMatematicas.pegaPorDelante(567, 1));
	    System.out.println("Si al 33 se le pega por delante el 0 da el " + FuncionesMatematicas.pegaPorDelante(33, 0));

	    // trozoDeNumero------------------------------------------

	    System.out.println("Al 78604000 le cojo el trozo que va de la posici�n 0 a la 3: " + FuncionesMatematicas.trozoDeNumero(78604000, 0, 3));
	    System.out.println("Al 78604000 le cojo el trozo que va de la posici�n 4 a la 6: " + FuncionesMatematicas.trozoDeNumero(78604000, 4, 6));
	    System.out.println("Al 78604000 le cojo el trozo que va de la posici�n 2 a la 2: " + FuncionesMatematicas.trozoDeNumero(78604000, 2, 2));
	    
	    //juntaNumeros--------------------------------------------
	    
	    System.out.println("Juntando el 21 y el 40 da el " + FuncionesMatematicas.juntaNumeros(21, 40));
	    System.out.println("Juntando el 789 y el 250 da el " + FuncionesMatematicas.juntaNumeros(789, 250));
	}
}
