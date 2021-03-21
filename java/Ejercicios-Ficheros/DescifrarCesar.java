/**
 * - Haz un programa que reciba como parámetro un fichero encriptado con el método César, lo desencripte y almacene el resultado en otro archivo, que también pasamos como parámetro, de manera que:

    Si el programa no recibe el número de parámetros adecuado termina con un error 1.
    Si el programa recibe un solo parámetro guardará la información encriptada en el mismo archivo del que lee, pero antes advertirá al usuario de que machacará el archivo origen, dando opción a que la operación no se haga.
    Si el fichero origen no existe (da error al abrirlo como lectura) el programa termina con un mensaje de error y código 2.
    Si en el fichero destino no se puede escribir (da error al abrirlo como escritura) el programa termina con un mensaje de error y código 3.
    Para desencriptar necesitas una clave que debes pedir al usuario.
    ¿Se te ocurre alguna forma de desencriptar este archivo sin pedir clave? Coméntala, y si te atreves... ¡impleméntala!

  @author Carlos Hidalgo Risco
 */

package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class DescifrarCesar {

  public static void main(String[] args) throws IOException {
    
    Scanner s = new Scanner(System.in);
    
    salirSiErrorNumeroArgumentos(args);
    
    String ficheroOrigen = args[0];
    String ficheroDestino;
       
    ficheroDestino = preguntaSiQuiereContinuarConUnArgumento(args, ficheroOrigen);
    
    int clave = getClave();
    
    var Lineas = leerLineasFihero(ficheroOrigen);
      
    descifrarLineas(ficheroDestino, clave, Lineas);
    
  }

  protected static int getClave() {
    Scanner s = new Scanner(System.in);
    System.out.print("Indica el numero de desplazamientos para descifrar el fichero: ");
    int desplazamiento = s.nextInt();s.nextLine();
    return desplazamiento;
  }

  private static void descifrarLineas(String ficheroDestino, int desplazamiento, List<String> Lineas) {
    try(var destino = new BufferedWriter(new FileWriter(ficheroDestino))){
    
      for (String linea : Lineas) {
        linea = descifrarCesar(linea, desplazamiento);
        destino.write(linea);
        destino.newLine();
      }
      
    } catch (IOException e) {
      System.err.println("No pudeo abrir el fichero: " + ficheroDestino);
      System.exit(3);
    }
  }

  private static String descifrarCesar(String linea, int desplazamiento) {
    String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZáéíóúüñÁÉÍÓÚÜÑ";
    String lineaDescifrada = "";
    for (int i=0; i<linea.length(); i++) {
      String letra = linea.substring(i, i+1);
      // Comprobamos si es una letra o otro caracter.
      if (letras.contains(letra)) {
        int posicionDondeEsta = letras.indexOf(letra);
        int posicionLetraCifrada = ((posicionDondeEsta - desplazamiento) % letras.length());
        letra = letras.substring(posicionLetraCifrada, posicionLetraCifrada+1);
      } 
      lineaDescifrada += letra;
    }
    return lineaDescifrada;
  }

  private static List<String> leerLineasFihero(String ficheroOrigen) {
    try {
      List<String>  Lineas = Files.readAllLines(Paths.get(ficheroOrigen));
      return Lineas;
    } catch (IOException e) {
      System.err.println("No pudeo abrir el fichero: " + ficheroOrigen);
      System.exit(2);
    }
    return null;
  }

  private static String preguntaSiQuiereContinuarConUnArgumento(String[] args,String ficheroOrigen) {
    Scanner s = new Scanner(System.in);
    String ficheroDestino;
    if (args.length == 1) {
      // Fichero origen y destino iguales
      ficheroDestino = ficheroOrigen;
      
      // Advertimos de que se machacará el archivo origen
      System.out.println("Tenga en cuenta que solo ha indicado un nombre de archivo: " + ficheroOrigen + " y se machacará los datos del mismo.");

      //Preguntamos si quiere continuar.
      String respuesta;
      do {
        System.out.print("¿Continuamos con la operación? (s/n) ");
        respuesta = s.next().toLowerCase();
      } while (!respuesta.equals("s") && !respuesta.equals("n"));
      if (respuesta.equals("n")) {
        System.out.println("Operacion cancelada.");
        System.exit(0);
      }
    } else {
      ficheroDestino = args[1];
    }
    return ficheroDestino;
  }

  private static void salirSiErrorNumeroArgumentos(String[] args) {
    if (args.length == 0 || args.length > 2) {
      System.err.println("El programa debe de recibir como parametros el fichero origen y destino.");
      System.exit(1);
    }
  }

}
