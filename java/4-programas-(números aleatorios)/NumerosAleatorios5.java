/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
 * Muestra también el máximo, el mínimo, la moda, la media, la mediana y la desviación típica de esos números.
 * 
 * moda
 * mediana
 * desviación típica
 * 
 * @author Carlos Hidalgo Risco
 */

public class NumerosAleatorios5 {
	public static void main(String[] args) {

        int max = 100;
        int min = 199;
        int suma = 0;
        int random = 0;
        int maximaVecesQueSeRepite = 0; 
        int moda_num = 0;
        int[] moda = new int [50];

        for (int i = 0; i < 50; i++) {
            random = (int) (Math.random()*(199-100+1)+100);
            System.out.print(random+" ");
            max = Math.max(max,random);
            min = Math.min(min,random);
            suma += random; 
            moda[i]=random;
        }
        
        // calculo de la moda
        for(int i=0; i<moda.length; i++){
            int vecesQueSeRepite = 0;
            for(int j=0; j<moda.length; j++){
            if(moda[i] == moda[j])
            vecesQueSeRepite++;
            }
            if(vecesQueSeRepite > maximaVecesQueSeRepite){
            moda_num = moda[i];
            maximaVecesQueSeRepite = vecesQueSeRepite;
            }
        }
        // calculo de la media
        int media = suma / 50;
        // impresion de los resultados 
        System.out.println("El maximo es: "+max);
        System.out.println("El minimo es: "+min);
        System.out.println("La media es: "+media);
        System.out.println("La moda es: "+moda_num);
        
	}
}

