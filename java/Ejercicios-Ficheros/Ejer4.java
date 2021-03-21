/**
 *  Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
    contenidas en un fichero de texto. El nombre del fichero que contiene las
    palabras se debe pasar como argumento en la línea de comandos. El nombre
    del fichero resultado debe ser el mismo que el original añadiendo la coletilla
    sort, por ejemplo palabras_sort.txt. 
    Suponemos que cada palabra ocupa una línea.
    
    @author Carlos Hidalgo Risco
 */

package ficheros;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Ejer4 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String origen = args[0];
    
    List<String> lineas;
    
    try  {
      var bw = new BufferedWriter(new FileWriter(nombreDestino(origen)));

      lineas = Files.readAllLines(Paths.get(origen));
      
      Collections.sort(lineas);
      
      for (String line: lineas) {
        bw.write(line);
        bw.newLine();
      }
      
      bw.close();
    }catch(IOException e){
      System.out.println("No se ha podido abrir el fichero.");
    }

  }

  private static String nombreDestino(String origen) {
    int pointPos = origen.lastIndexOf(".");
    String extension = origen.substring(pointPos,origen.length());
    String fileName = origen.substring(0, pointPos);
    return fileName+"_sort"+extension ;
  }

}
