package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  Escribe un programa que guarde en un fichero con nombre primos.dat los
    números primos que hay entre 1 y 500.
 * @author Carlos Hidalgo Risco
 *
 */
public class Ejer1 {
  
  public static void main(String[] args) {
    try(var fileWriter = new BufferedWriter(new FileWriter("primos.dat"))) {
      for (int i = 1; i <= 500; i++) {
        if(esPrimo(i)) {
          fileWriter.write(String.valueOf(i));
          fileWriter.newLine();
        }
      } 
    }catch (IOException e) {
      System.out.println("No he podido crear el fichero.");
    }
  }
  /**
   * Devuelve true si el numero es primo y falso si no los es.
   * @param numero
   * @return
   */
  public static boolean esPrimo(int numero){
    int contador = 2;
    boolean primo=true;
    while ((primo) && (contador!=numero)){
      if (numero % contador == 0)
        primo = false;
      contador++;
    }
    return primo;
  }
}
