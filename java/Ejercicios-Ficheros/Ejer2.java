package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *  Realiza un programa que lea el fichero creado en el ejercicio anterior y que
    muestre los números por pantalla.
 * @author Carlos Hidalgo Risco
 *
 */
public class Ejer2 {

  public static void main(String[] args) {
    try {
      //primos.dat
      var fileReader = new BufferedReader(new FileReader("primos.dat"));
     
      String linea;
      while ((linea = fileReader.readLine()) != null) {
        System.out.println(linea);
      }
      
      fileReader.close();
      
    }catch (IOException e) {
      System.out.println("No se a podido abrir el fichero.");
    }

  }

}
