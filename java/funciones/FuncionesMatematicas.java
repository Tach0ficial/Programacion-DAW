/**
 * 
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de
 * implementar teniendo esPrimo.
 * 
 * @author Carlos Hidalgo Risco
 * 
 */
package matematicas;

public class FuncionesMatematicas {
	
	/**
	 * Devuelve verdadero si el número que se pasa como parámetro
	 * es capicúa y falso en caso contrario.
	 * @return 
	 * @return
	 */
	public static boolean esCapicua(long a) {
		return  a == voltear(a);
	}
	
	/**
	 * Devuelve verdadero si el número que se pasa como parámetro
	 * es primo y falso en caso contrario.
	 * @return
	 */
	public static boolean esPrimo(int n) {
		if (n < 2) {
		      return false;
		    } else {
		      for (long i = n / 2; i >= 2; i--) {
		        if (n % i == 0) {
		          return false;
		        }
		      }
		    }
		    return true;
	}
	
	/**
	 * Devuelve el menor primo que es mayor al número que
	 * se pasa como parámetro.
	 * @return
	 */
	public static int siguientePrimo(int n) {
		int menorPrimo = 0;
		boolean esPrimo = false; 
		int i = n;
		while (esPrimo == false) {
			i++;
			if(esPrimo(i)) {
				esPrimo = true;
				menorPrimo = i; 
			}
		}
		return menorPrimo;
	}
	
	/**
	 * Dada una base y un exponente devuelve la potencia.
	 * @return
	 */
	public static int potencia(int base, int exponente) {
		int potencia = (int) Math.pow(base, exponente);
		return potencia;
	}
	
	/**
	 * Cuenta el número de dígitos de un número entero.
	 * @return
	 */
	public static int digitos(long n) {
		int digitos = 0;
		while(n>0) {
			digitos++;
			n /= 10;
		}
		return digitos;
	}
	
	/**
	 * Le da la vuelta a un número.
	 * @return el digito volteado.
	 */
	public static long voltear(long a) {
		
			if (a < 0) {
		      return -voltear(-a);
		    }

		    long volteado = 0;

		    while(a > 0) {
		      volteado = (volteado * 10) + (a % 10);
		      a = a / 10;
		    }

		    return (long) volteado;
	}
	
	/**
	 * Devuelve el dígito que está en la posición n de un número entero.
	 * Se empieza contando por el 0 y de izquierda a derecha.
	 * @return
	 */
	public static int digitoN(long x, int n) {
	    x = voltear(x);

	    while (n-- > 0) {
	      x = x / 10;
	    }

	    return (int)x % 10;
	  }

	  /**
	  /* Devuelve el dígito que está en la posición n de un número entero. Se
	   * empieza contando por el 0 y de izquierda a derecha.
	   * @return  dígito que está en la posición n del número <code>x</code>
	   *          empezando a contar por el 0 y de izquierda a derecha
	   */
	  public static int digitoN(int x, int n) {
	    return digitoN((long)x, n);
	  }
	
	/**
	 * Da la posición de la primera ocurrencia de un dígito
	 * dentro de un número entero. Si no se encuentra, devuelve -1.
	 * @return
	 */
	public static int posicionDeDigito(long n,int d) {
		int i;
	    for ( i = 0; (i < digitos(n)) && (digitoN(n, i) != d); i++) {}

	    if (i == digitos(n)) {
	      return -1;
	    } else {
	      return i;
	    }
	}
	
	/**
	 * Le quita a un número n dígitos por detrás (por la
	 * derecha).
	 * @return
	 */
	public static long quitaPorDetras(long numero, int digitos ) {
		for (int i = 0; i < digitos; i++) {
			numero /= 10; 
		}
		return numero ;
	}
	
	/**
	 * Le quita a un número n dígitos por delante (por la
	 * izquierda).
	 * @return
	 */
	public static long quitaPorDelante(long numero, int digitos) {
		numero = voltear(numero);
		for (int i = 0; i < digitos; i++) {
			numero /= 10; 
		}
		numero = voltear(numero);
		return numero ;
	}
	
	/**
	 * Añade un dígito a un número por detrás.
	 * @return
	 */
	public static long pegaPorDetras(long n, int d) {
		return  juntaNumeros(n, d);
	}
	
	/**
	 * Añade un dígito a un número por delante.
	 * @return
	 */
	public static long pegaPorDelante(long n, int d) {
		return  juntaNumeros(d, n);
	}
	/**
	 * Toma como parámetros las posiciones inicial y final
	 * dentro de un número y devuelve el trozo correspondiente
	 * @return
	 */
	public static long trozoDeNumero(long n, int inicio, int fin ) {
		int longitud = digitos(n);
	    n = quitaPorDelante(n, inicio);
	    n = quitaPorDetras(n, longitud - fin - 1);
	    return n;
	}
	
	//juntaNumeros: Pega dos números para formar uno.
	public static long juntaNumeros(long x, long y) {
		return (long)(x * potencia(10, digitos(y))) + y;
	}

}
