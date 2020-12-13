/**
 * 
 * Crea una biblioteca de funciones matem�ticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada funci�n ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la funci�n esCapicua
 * resulta trivial teniendo voltea y la funci�n siguientePrimo tambi�n es muy f�cil de
 * implementar teniendo esPrimo.
 * 
 * @author Carlos Hidalgo Risco
 * 
 */
package matematicas;

public class FuncionesMatematicas {
	
	/**
	 * Devuelve verdadero si el n�mero que se pasa como par�metro
	 * es capic�a y falso en caso contrario.
	 * @return 
	 * @return
	 */
	public static boolean esCapicua(long a) {
		return  a == voltear(a);
	}
	
	/**
	 * Devuelve verdadero si el n�mero que se pasa como par�metro
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
	 * Devuelve el menor primo que es mayor al n�mero que
	 * se pasa como par�metro.
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
	 * Cuenta el n�mero de d�gitos de un n�mero entero.
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
	 * Le da la vuelta a un n�mero.
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
	 * Devuelve el d�gito que est� en la posici�n n de un n�mero entero.
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
	  /* Devuelve el d�gito que est� en la posici�n n de un n�mero entero. Se
	   * empieza contando por el 0 y de izquierda a derecha.
	   * @return  d�gito que est� en la posici�n n del n�mero <code>x</code>
	   *          empezando a contar por el 0 y de izquierda a derecha
	   */
	  public static int digitoN(int x, int n) {
	    return digitoN((long)x, n);
	  }
	
	/**
	 * Da la posici�n de la primera ocurrencia de un d�gito
	 * dentro de un n�mero entero. Si no se encuentra, devuelve -1.
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
	 * Le quita a un n�mero n d�gitos por detr�s (por la
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
	 * Le quita a un n�mero n d�gitos por delante (por la
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
	 * A�ade un d�gito a un n�mero por detr�s.
	 * @return
	 */
	public static long pegaPorDetras(long n, int d) {
		return  juntaNumeros(n, d);
	}
	
	/**
	 * A�ade un d�gito a un n�mero por delante.
	 * @return
	 */
	public static long pegaPorDelante(long n, int d) {
		return  juntaNumeros(d, n);
	}
	/**
	 * Toma como par�metros las posiciones inicial y final
	 * dentro de un n�mero y devuelve el trozo correspondiente
	 * @return
	 */
	public static long trozoDeNumero(long n, int inicio, int fin ) {
		int longitud = digitos(n);
	    n = quitaPorDelante(n, inicio);
	    n = quitaPorDetras(n, longitud - fin - 1);
	    return n;
	}
	
	//juntaNumeros: Pega dos n�meros para formar uno.
	public static long juntaNumeros(long x, long y) {
		return (long)(x * potencia(10, digitos(y))) + y;
	}

}
