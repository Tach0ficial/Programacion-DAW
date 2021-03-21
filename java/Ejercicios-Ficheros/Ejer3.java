package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  Escribe un programa que guarde en un fichero el contenido de otros dos
    ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los
    primeros dos ficheros mezcladas, es decir, la primera línea será del primer
    fichero, la segunda será del segundo fichero, la tercera será la siguiente del
    primer fichero, etc.
    
    Los nombres de los dos ficheros origen y el nombre del fichero destino se deben
    pasar como argumentos en la línea de comandos.
    
    Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas
    pueden tener tamaños diferentes.
 * @author Carlos Hidalgo Risco
 *
 */

public class Ejer3 {

  public static void main(String[] args) {

    String ficheriOrigen1 = args[0];
    String ficheriOrigen2 = args[1];
    String ficheriDestino = args[2];

    try {
      var brA = new BufferedReader(new FileReader(ficheriOrigen1));
      var brB = new BufferedReader(new FileReader(ficheriOrigen2));
      var bwMezcla = new BufferedWriter(new FileWriter(ficheriDestino));
      
      String lineaA = "";
      String lineaB = "";
      while ((lineaA  != null ) || (lineaB  != null )) {
        lineaA = brA.readLine();
        lineaB = brB.readLine();
        
        if (lineaA != null) {
          bwMezcla.write(lineaA);
          bwMezcla.newLine();
        }
        if (lineaB != null) {
          bwMezcla.write(lineaB);
          bwMezcla.newLine();
        }
      }
      
      brA.close();
      brB.close();
      bwMezcla.close();
      
    }catch (IOException e) {
      System.out.println("No se a podido abrir algun fichero.");
    }
  }
}
