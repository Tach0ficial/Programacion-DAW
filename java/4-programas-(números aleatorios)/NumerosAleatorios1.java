/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos
 * y el pleno al quince (15 filas) de forma que la probabilidad de que salga un 1 sea  de 1/2,
 * la probabilidad de que salga X sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. 
 * Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 * 3 apuestas de quiniela 
 * 3 columnas 
 * 14 partidos
 * pleno al quince (15 filas)
 * salga 1 --> 3/6
 * salga X --> 2/6
 * salga 2 --> 1/6
 * @author Carlos Hidalgo Risco
 */

public class NumerosAleatorios1 { // Clase principal
    public static void main(String[] args) {
        
        int resultado;
        System.out.println("      1X2|1X2|1X2 ");
        System.out.println("      -----------");
        for (int i = 1; i < 16; i++) {
            System.out.printf("%2d -->",i);
            for (int j = 0; j < 3; j++) {
                resultado = (int) ((Math.random() * 3) + 1);
                
                switch(resultado) {
                    case 1:
                      System.out.print("1  |");
                      break;
                    case 2:
                      System.out.print("  2|");
                      break;
                    case 3:
                      System.out.print(" X |");
                    default:
                }
            }
            System.out.println();
        }
    }
}
