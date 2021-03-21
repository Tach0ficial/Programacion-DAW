/**
 *  Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
    fichero. Tanto el nombre del fichero como la palabra se deben pasar como
    argumentos en la línea de comandos.
 */

package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejer6 {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.err.println("Error en el numero de argumentos.");
    }

    try {
      Scanner file = new Scanner(new BufferedReader(new FileReader(args[0])));
      String word = args[1];
      
      int contador = 0;
      String fileWord;
      
      while (file.hasNext()) {
        fileWord = file.next();
        if (fileWord.equals(word)) {
          contador++;
        }
      }
      System.out.println("La palabra "+word+" se repite "+contador+" veces.");
    } catch (IOException e) {
      System.err.println("No se ha encontrado el archivo.");
    }
  }

}
