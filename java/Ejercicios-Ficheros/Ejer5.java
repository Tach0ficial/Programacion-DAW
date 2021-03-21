/**
 * Escribe un programa capaz de quitar los comentarios de un programa de Java. Se utilizaría de la
 * siguiente manera:
 * 
 * quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
 * 
 * Por ejemplo: quita_comentarios hola.java holav2.java crea un fichero con nombre holav2.java que
 * contiene el código de hola.java pero sin los comentarios.
 */

package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer5 {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("No se han indicado los argumentos necesarios.");
      System.exit(-1);
      }
      try(BufferedReader br = new BufferedReader(new FileReader(args[0]));
          BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]))) {
        String lineaOrigen = "";
        String lineaDestino = "";
        boolean comentarioDeBloque = false;
        int i = 0;
        while ((lineaOrigen = br.readLine()) != null) {
          int longitudLinea = lineaOrigen.length();
          lineaDestino = lineaOrigen;
          // Detecta inicio de comentario de bloque
          if ((i = lineaOrigen.indexOf("/*")) != -1) {
          comentarioDeBloque = true;
          lineaDestino = lineaOrigen.substring(0, i);
          lineaOrigen = lineaDestino;
          }
          
          // Detecta fin de comentario de bloque
          if ((i = lineaOrigen.indexOf("*/")) != -1) {
          comentarioDeBloque = false;
          lineaDestino = lineaOrigen.substring(i + 2, longitudLinea);
          }
          
          // Detecta comentario de línea
          if (((i = lineaOrigen.indexOf("//")) != -1) && !comentarioDeBloque) {
          lineaDestino = lineaOrigen.substring(0, i);
          }
          
          if (!comentarioDeBloque) {
           bw.write(lineaDestino + "\n");
          }
        }
       }catch (IOException ioe) {
        System.err.println(ioe.getMessage());
        }
  }
}

